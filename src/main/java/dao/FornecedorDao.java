package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import models.Endereco;
import models.Fornecedor;

public class FornecedorDao {

    private Connection con;

    public FornecedorDao(Connection con) {
        this.con = con;
    }

    public void cadastra(Fornecedor f) {
        String sql = "INSERT INTO fornecedor (cnpj, nome, email, telefone, cep, endereco, numero, complemento, bairro, cidade, uf) VALUES (?,?,?,?,?,?,?,?,?,?,?)";
        try (PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setString(1, f.getCnpj());
            ps.setString(2, f.getNome());
            ps.setString(3, f.getEmail());
            ps.setString(4, f.getTelefone());
            ps.setString(5, f.getEndereco().getCep());
            ps.setString(6, f.getEndereco().getLogradouro());
            ps.setString(7, f.getEndereco().getNumero());
            ps.setString(8, f.getEndereco().getComplemento());
            ps.setString(9, f.getEndereco().getBairro());
            ps.setString(10, f.getEndereco().getCidade());
            ps.setString(11, f.getEndereco().getUf());

            ps.execute();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void edita(Fornecedor f) {
        String sql = "UPDATE fornecedor SET nome=?, email=?, telefone=?, cep=?, endereco=?, numero=?, complemento=?, bairro=?, cidade=?, uf=? WHERE cnpj = ?";
        try (PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setString(1, f.getNome());
            ps.setString(2, f.getEmail());
            ps.setString(3, f.getTelefone());
            ps.setString(4, f.getEndereco().getCep());
            ps.setString(5, f.getEndereco().getLogradouro());
            ps.setString(6, f.getEndereco().getNumero());
            ps.setString(7, f.getEndereco().getComplemento());
            ps.setString(8, f.getEndereco().getBairro());
            ps.setString(9, f.getEndereco().getCidade());
            ps.setString(10, f.getEndereco().getUf());
            ps.setString(11, f.getCnpj());

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

    private List<Fornecedor> transformaResultSet(PreparedStatement ps) {
        List<Fornecedor> fornecedores = new ArrayList<>();
        try(ResultSet rs = ps.executeQuery()){
            while(rs.next()){
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
                
                Fornecedor f = new Fornecedor(cnpj, nome, email, telefone, new Endereco(cep, logradouro, bairro, cidade, uf));
                fornecedores.add(f);
            }
            return Collections.unmodifiableList(fornecedores);
        }catch(SQLException e){
            throw new RuntimeException(e);
        }
            }

}
