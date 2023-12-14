package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import models.Produto;

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

	public void exclui(Produto p) {
		String sql = "DELETE FROM produto WHERE codigo =?";
		try (PreparedStatement ps = con.prepareStatement(sql)) {
			ps.setString(1, p.getCodigo());

			ps.execute();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

	public List<Produto> listaTodos() {
		String sql = "SELECT codigo, descricao, preco_custo, preco_venda, formato, estoque FROM produto";
		try (PreparedStatement ps = con.prepareStatement(sql)) {
			List<Produto> produtos = transformaResultSet(ps);
			return produtos;
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

	public Produto buscaPorCodigo(String codigo) {
		String sql = "SELECT codigo, descricao, preco_custo, preco_venda, formato, estoque FROM produto WHERE codigo =?";
		try (PreparedStatement ps = con.prepareCall(sql)) {
			ps.setString(1, codigo);
			List<Produto> produtos = transformaResultSet(ps);

			if (produtos.isEmpty()) throw new RuntimeException("Nenhum produto encontrado para o código " + codigo);

			return produtos.toArray(new Produto[1])[0];

		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

	private List<Produto> transformaResultSet(PreparedStatement ps) {
		List<Produto> produtos = new ArrayList<>();
		try (ResultSet rs = ps.executeQuery()) {
			while (rs.next()) {
				String codigo = rs.getString("codigo");
				String descricao = rs.getString("descricao");
				float precoCusto = rs.getFloat("preco_custo");
				float precoVenda = rs.getFloat("preco_venda");
				String formato = rs.getString("formato");
				double estoque = rs.getFloat("estoque");

				Produto p = new Produto(codigo, descricao, null, estoque, precoVenda, precoCusto);
				produtos.add(p);
			}
			return Collections.unmodifiableList(produtos);
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
}
