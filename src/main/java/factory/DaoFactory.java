package factory;

import dao.FornecedorDao;
import dao.ProdutoDao;
import java.sql.Connection;
import static factory.ConnectionFactory.getConnection;


public class DaoFactory {
  private final Connection connection;
  
  public DaoFactory(){
    this.connection = getConnection();
  }
  
  public FornecedorDao createFornecedorDao(){
    return new FornecedorDao(connection);
  }
  public ProdutoDao createProdutoDao(){
    return new ProdutoDao(connection);
  }
}
