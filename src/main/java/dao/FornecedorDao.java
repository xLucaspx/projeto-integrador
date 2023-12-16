package dao;

import domain.fornecedor.DadosBasicosFornecedor;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import domain.fornecedor.Endereco;
import domain.fornecedor.Fornecedor;

public class FornecedorDao {

  private Connection con;

  public FornecedorDao(Connection con) {
    this.con = con;
  }

  public void cadastra(DadosBasicosFornecedor dados) {
    String sql = "INSERT INTO fornecedor (cnpj, nome, email, telefone, cep, endereco, numero, complemento, bairro, cidade, uf) VALUES (?,?,?,?,?,?,?,?,?,?,?)";

    try (PreparedStatement ps = con.prepareStatement(sql)) {
      ps.setString(1, dados.cnpj());
      ps.setString(2, dados.nome());
      ps.setString(3, dados.email());
      ps.setString(4, dados.telefone());
      ps.setString(5, dados.endereco().cep());
      ps.setString(6, dados.endereco().logradouro());
      ps.setString(7, dados.endereco().numero());
      ps.setString(8, dados.endereco().complemento());
      ps.setString(9, dados.endereco().bairro());
      ps.setString(10, dados.endereco().cidade());
      ps.setString(11, dados.endereco().uf());

      ps.execute();
    } catch (SQLException e) {
      throw new RuntimeException(e);
    }
  }

  public void edita(DadosBasicosFornecedor dados) {
    String sql = "UPDATE fornecedor SET nome = ?, email = ?, telefone = ?, cep = ?, endereco = ?, numero = ?, complemento = ?, bairro = ?, cidade = ?, uf = ? WHERE cnpj = ?";

    try (PreparedStatement ps = con.prepareStatement(sql)) {
      ps.setString(1, dados.nome());
      ps.setString(2, dados.email());
      ps.setString(3, dados.telefone());
      ps.setString(4, dados.endereco().cep());
      ps.setString(5, dados.endereco().logradouro());
      ps.setString(6, dados.endereco().numero());
      ps.setString(7, dados.endereco().complemento());
      ps.setString(8, dados.endereco().bairro());
      ps.setString(9, dados.endereco().cidade());
      ps.setString(10, dados.endereco().uf());
      ps.setString(11, dados.cnpj());

      ps.execute();
    } catch (SQLException e) {
      throw new RuntimeException(e);
    }
  }

  public void exclui(Fornecedor f) {
    String sql = "DELETE FROM fornecedor WHERE cnpj = ?";
    try (PreparedStatement ps = con.prepareStatement(sql)) {
      ps.setString(1, f.getCnpj());

      ps.execute();

    } catch (SQLException e) {
      throw new RuntimeException(e);
    }
  }

  public List<Fornecedor> listaTodos() {
    String sql = "SELECT cnpj, nome, email, telefone, cep, endereco, numero, complemento, bairro, cidade, uf FROM fornecedor";
    try (PreparedStatement ps = con.prepareStatement(sql)) {
      List<Fornecedor> fornecedor = transformaResultSet(ps);
      return fornecedor;
    } catch (SQLException e) {
      throw new RuntimeException(e);
    }
  }

  public Fornecedor buscaPorCnpj(String cnpj) {
    String sql = "SELECT cnpj, nome, email, telefone, cep, endereco, numero, complemento, bairro, cidade, uf FROM fornecedor WHERE cnpj=?";
    try (PreparedStatement ps = con.prepareCall(sql)) {
      ps.setString(1, cnpj);
      List<Fornecedor> fornecedores = transformaResultSet(ps);
      if (fornecedores.isEmpty())
        throw new RuntimeException("Nenhum fornecedor encontrado para o cnpj " + cnpj);

      return fornecedores.toArray(new Fornecedor[1])[0];

    } catch (SQLException e) {
      throw new RuntimeException(e);
    }
  }

  private List<Fornecedor> transformaResultSet(PreparedStatement ps) {
    List<Fornecedor> fornecedores = new ArrayList<>();
    try (ResultSet rs = ps.executeQuery()) {
      while (rs.next()) {
        String cnpj = rs.getString("cnpj");
        String nome = rs.getString("nome");
        String email = rs.getString("email");
        String telefone = rs.getString("telefone");
        String cep = rs.getString("cep");
        String logradouro = rs.getString("endereco");
        String numero = rs.getString("numero");
        String complemento = rs.getString("complemento");
        String bairro = rs.getString("bairro");
        String cidade = rs.getString("cidade");
        String uf = rs.getString("uf");

        var endereco = new Endereco(cep, logradouro, complemento, numero, bairro, cidade, uf);
        var fornecedor = new Fornecedor(cnpj, nome, email, telefone, endereco);
        fornecedores.add(fornecedor);
      }
      return Collections.unmodifiableList(fornecedores);
    } catch (SQLException e) {
      throw new RuntimeException(e);
    }
  }

}
