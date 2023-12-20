package dao;

import exceptions.ValidationException;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;

import models.compra.DadosCompraProduto;
import models.compra.DadosRegistroNotaCompra;
import models.compra.NotaCompra;
import service.ProdutoService;

public class NotaCompraDao {
  private final Connection con;
  private final ProdutoService produtoService;
  private final ProdutoDao produtoDao;

  public NotaCompraDao(Connection con) {
    this.con = con;
    this.produtoDao = new ProdutoDao(con);
    this.produtoService = new ProdutoService(produtoDao);
  }

  public void cadastra(DadosRegistroNotaCompra dados) {
    String sql = "INSERT INTO nota_compra (numero, data_compra, fornecedor) VALUES (?,?,?)";

    try (PreparedStatement ps = con.prepareStatement(sql);) {
      con.setAutoCommit(false);

      ps.setString(1, dados.numeroNota());
      ps.setDate(2, Date.valueOf(dados.dataCompra()));
      ps.setString(3, dados.cnpjFornecedor());

      ps.execute();

      for (DadosCompraProduto p : dados.produtos()) {
        adicionaProduto(dados.numeroNota(), p);
        var dadosControleProduto = produtoService.criaDadosControleProduto(p);
        produtoDao.atualizaEstoque(dadosControleProduto.estoque(), dadosControleProduto.codigo());
        produtoDao.atualizaPrecoCusto(dadosControleProduto.precoCusto(), dadosControleProduto.codigo());
        produtoDao.atualizaPrecoVenda(dadosControleProduto.precoVenda(), dadosControleProduto.codigo());
      }

      con.setAutoCommit(true);
    } catch (Exception e) {
      try {
        con.rollback();
        con.setAutoCommit(true);
      } catch (SQLException ex) {
        throw new RuntimeException(ex);
      }

      if (e instanceof SQLIntegrityConstraintViolationException)
        throw new ValidationException("A nota de número %s já está cadastrada no sistema!".formatted(dados.numeroNota()));

      throw new RuntimeException(e);
    }
  }

  private void adicionaProduto(String numeroNota, DadosCompraProduto dadosProduto) throws SQLException {
    String sql = "INSERT INTO item_nota_compra (numero_nota, codigo_produto, quantidade, preco) VALUES (?,?,?,?)";

    try (PreparedStatement ps = con.prepareStatement(sql)) {
      ps.setString(1, numeroNota);
      ps.setString(2, dadosProduto.codigoProduto());
      ps.setDouble(3, dadosProduto.quantidade());
      ps.setFloat(4, dadosProduto.precoCusto());

      ps.execute();
    } catch (SQLException e) {
      throw e;
    }
  }

  public void exclui(NotaCompra nc) {
    String sql = "DELETE FROM nota_compra WHERE numero = ?";
    try (PreparedStatement ps = con.prepareStatement(sql)) {
      ps.setString(1, nc.getNumero());

      ps.execute();
    } catch (SQLException e) {
      throw new RuntimeException(e);
    }
  }
}
