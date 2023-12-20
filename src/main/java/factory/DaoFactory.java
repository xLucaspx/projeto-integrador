package factory;

import static factory.ConnectionFactory.getConnection;

import java.sql.Connection;

import dao.FornecedorDao;
import dao.NotaCompraDao;
import dao.ProdutoDao;

public class DaoFactory {
	private final Connection connection;

	public DaoFactory() {
		this.connection = getConnection();
	}

	public FornecedorDao createFornecedorDao() {
		return new FornecedorDao(connection);
	}

	public ProdutoDao createProdutoDao() {
		return new ProdutoDao(connection);
	}

	public NotaCompraDao createCompraDao() {
		return new NotaCompraDao(connection);
	}
}
