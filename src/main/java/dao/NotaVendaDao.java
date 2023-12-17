package dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import models.produto.Produto;
import models.venda.NotaVenda;

public class NotaVendaDao {
	private final Connection con;

	public NotaVendaDao(Connection con) {
		this.con = con;
	}

	public void cadastra(NotaVenda nv) {
		String sql = "INSERT INTO nota_venda (numero, data_venda) VALUES (?,?)";
		try (PreparedStatement ps = con.prepareStatement(sql)) {
			ps.setString(1, nv.getNumero());
			ps.setDate(2, Date.valueOf(nv.getData()));

			ps.execute();

		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

	public void adicionaProduto(String numeroNota, Produto produto) {
		String sql = "INSERT INTO item_nota_venda (numero_nota, codigo_produto, quantidade, preco) VALUES (?,?,?,?)";
		try (PreparedStatement ps = con.prepareStatement(sql)) {
			ps.setString(1, numeroNota);
			ps.setString(2, produto.getCodigo());
			ps.setDouble(3, produto.getEstoque());
			ps.setFloat(4, produto.getPrecoVenda());

			ps.execute();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

	public void exclui(NotaVenda nv) {
		String sql = "DELETE FROM nota_venda WHERE numero = ?";
		try (PreparedStatement ps = con.prepareStatement(sql)) {
			ps.setString(1, nv.getNumero());

			ps.execute();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
}
