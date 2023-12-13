package dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import models.NotaCompra;
import models.Produto;

public class NotaCompraDao {
	private Connection con;

	public NotaCompraDao(Connection con) {
		this.con = con;
	}

	public void cadastra(NotaCompra nc) {
		String sql = "INSERT INTO nota_compra (numero, data_compra, fornecedor) VALUES (?,?,?)";
		try (PreparedStatement ps = con.prepareStatement(sql)) {
			ps.setString(1, nc.getNumero());
			ps.setDate(2, Date.valueOf(nc.getData()));
			ps.setString(3, nc.getFornecedor().getNome());

			ps.execute();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

	public void adicionaProduto(String numeroNota, Produto produto) {
		String sql = "INSERT INTO item_nota_compra (numero_nota, codigo_produto, quantidade, preco) VALUES (?,?,?,?)";
		try (PreparedStatement ps = con.prepareStatement(sql)) {
			ps.setString(1, numeroNota);
			ps.setString(2, produto.getCodigo());
			ps.setDouble(3, produto.getEstoque());
			ps.setFloat(4, produto.getPrecoCusto());

			ps.execute();

		} catch (SQLException e) {
			throw new RuntimeException(e);
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
