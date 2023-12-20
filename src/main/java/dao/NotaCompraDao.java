package dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import models.compra.DadosCompraProduto;
import models.compra.DadosRegistroNotaCompra;
import models.compra.NotaCompra;

public class NotaCompraDao {
  private final Connection con;

  public NotaCompraDao(Connection con) {
    this.con = con;
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
      }

      con.setAutoCommit(true);
    } catch (SQLException e) {
      try {
        con.rollback();
        con.setAutoCommit(true);
      } catch (SQLException ex) {
        throw new RuntimeException(ex);
      }
      throw new RuntimeException(e);
    }
  }

  private void adicionaProduto(String numeroNota, DadosCompraProduto produto) throws SQLException {
    String sql = "INSERT INTO item_nota_compra (numero_nota, codigo_produto, quantidade, preco) VALUES (?,?,?,?)";

    try (PreparedStatement ps = con.prepareStatement(sql)) {
      ps.setString(1, numeroNota);
      ps.setString(2, produto.codigoProduto());
      ps.setDouble(3, produto.quantidade());
      ps.setFloat(4, produto.precoCusto());

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
