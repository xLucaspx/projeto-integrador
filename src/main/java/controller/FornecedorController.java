package controller;

import dao.FornecedorDao;
import java.util.List;
import models.Fornecedor;

public class FornecedorController {

  private final FornecedorDao fornecedorDao;

  public FornecedorController(FornecedorDao dao) {
    this.fornecedorDao = dao;
  }

  public void cadastra(Fornecedor fornecedor) {
    fornecedorDao.cadastra(fornecedor);
  }

  public void edita(Fornecedor fornecedor) {
    fornecedorDao.edita(fornecedor);
  }

  public void exclui(Fornecedor fornecedor) {
    fornecedorDao.exclui(fornecedor);
  }

  public List<Fornecedor> listaTodos() {
    return fornecedorDao.listaTodos();
  }

  public Fornecedor buscaPorCnpj(String cnpj) {
    return fornecedorDao.buscaPorCnpj(cnpj);
  }

}
