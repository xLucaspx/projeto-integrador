
package factory;

import controller.FornecedorController;


public class ControllerFactory {
  private final DaoFactory daoFactory;
  
  public ControllerFactory(){
    this.daoFactory = new DaoFactory();
  }
  
  public FornecedorController createFornecedorController(){
    return new FornecedorController(daoFactory.createFornecedorDao());
  }
}
