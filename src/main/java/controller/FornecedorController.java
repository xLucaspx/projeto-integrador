package controller;

import java.util.List;

import dao.FornecedorDao;
import models.fornecedor.DadosBasicosFornecedor;
import models.fornecedor.Fornecedor;

public class FornecedorController {

  private final FornecedorDao fornecedorDao;

  public FornecedorController(FornecedorDao dao) {
    this.fornecedorDao = dao;
  }

	public void cadastra(DadosBasicosFornecedor dados) {
		fornecedorDao.cadastra(dados);
	}

	public void edita(DadosBasicosFornecedor dados) {
		fornecedorDao.edita(dados);
	}

	public void exclui(Fornecedor fornecedor) {
		fornecedorDao.exclui(fornecedor.getCnpj());
	}

	public List<Fornecedor> listaTodos() {
		return fornecedorDao.listaTodos();
	}

	public Fornecedor buscaPorCnpj(String cnpj) {
		return fornecedorDao.buscaPorCnpj(cnpj);
	}
}
