/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import models.Produto;

/**
 *
 * @author 182220008
 */
public class ProdutoDao {

    private Connection con;

    public ProdutoDao(Connection con) {
        this.con = con;
    }

    public void cadastra(Produto p) {
        String sql = "INSERT INTO produto (codigo, descricao, preco_custo, preco_venda, formato, estoque) VALUES (?,?,?,?,?,?)";
        try (PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setString(1, p.getCodigo());
            ps.setString(2, p.getDescricao());
            ps.setFloat(3, p.getPrecoCusto());
            ps.setFloat(4, p.getPrecoVenda());
            ps.setInt(5, p.getFormato().getCodigo());
            ps.setDouble(6, p.getEstoque());
            ps.execute();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void edita(Produto p) {
        String sql = "UPDATE produto SET descricao=?, preco_custo=?, preco_venda=?, formato=?, estoque=? WHERE codigo = ?";
        try (PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setString(1, p.getDescricao());
            ps.setFloat(2, p.getPrecoCusto());
            ps.setFloat(3, p.getPrecoVenda());
            ps.setInt(4, p.getFormato().getCodigo());
            ps.setDouble(5, p.getEstoque());
            ps.setString(6, p.getCodigo());
            ps.execute();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    public void exclui(Produto p){
        String sql = "DELETE FROM produto WHERE codigo =?";
        try (PreparedStatement ps = con.prepareStatement(sql)){
            ps.setString(1, p.getCodigo());
            
        }catch (SQLException e){
            throw new RuntimeException(e);
        }
    }
    
}
