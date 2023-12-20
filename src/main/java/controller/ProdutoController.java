package controller;

import java.util.List;

import dao.ProdutoDao;
import models.produto.DadosBasicosProduto;
import models.produto.Produto;

public class ProdutoController {
	private final ProdutoDao produtoDao;

	public ProdutoController(ProdutoDao produtoDao) {
		this.produtoDao = produtoDao;
	}

	public void cadastra(DadosBasicosProduto dados) {
		produtoDao.cadastra(dados);
	}

	public void edita(DadosBasicosProduto dados) {
		produtoDao.edita(dados);
	}

	public void exclui(Produto produto) {
		produtoDao.exclui(produto.getCodigo());
	}

	public List<Produto> listaTodos() {
		return produtoDao.listaTodos();
	}

	public Produto buscaPorCodigo(String codigo) {
		return produtoDao.buscaPorCodigo(codigo);
	}

  public boolean existePorCodigoAndAtivo(String codigo) {
    var produto = buscaPorCodigo(codigo);
    
    return produto.isAtivo();
  }
  
}
