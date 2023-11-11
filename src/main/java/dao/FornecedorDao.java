
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
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
            ps.setObject(6, f.getEndereco());
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
            ps.setObject(5, f.getEndereco());
            ps.setString(5, f.getEndereco().getNumero());
            ps.setString(7, f.getEndereco().getComplemento());
            ps.setString(8, f.getEndereco().getBairro());
            ps.setString(9, f.getEndereco().getCidade());
            ps.setString(10, f.getEndereco().getUf());
            ps.setString(11, f.getCnpj());
            
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    public void exclui(Fornecedor f){
        String sql = "DELETE FROM fornecedor WHERE cnpj = ?";
        try(PreparedStatement ps = con.prepareStatement(sql)){
            ps.setString(1, f.getCnpj());
            
        }catch (SQLException e){
            throw new RuntimeException(e);
        }
    }

}
