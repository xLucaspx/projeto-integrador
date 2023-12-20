package factory;

import controller.CompraController;
import controller.FornecedorController;
import controller.ProdutoController;

public class ControllerFactory {
  private final DaoFactory daoFactory;

  public ControllerFactory() {
    this.daoFactory = new DaoFactory();
  }

  public FornecedorController createFornecedorController() {
    return new FornecedorController(daoFactory.createFornecedorDao());
  }

  public ProdutoController createProdutoController() {
    return new ProdutoController(daoFactory.createProdutoDao());
  }

  public CompraController createCompraController() {
    return new CompraController(daoFactory.createCompraDao());
  }
}
