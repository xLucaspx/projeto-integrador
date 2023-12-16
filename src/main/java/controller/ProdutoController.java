package controller;

import java.util.List;

import dao.ProdutoDao;
import domain.produto.DadosBasicosProduto;
import domain.produto.Produto;

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
		produtoDao.exclui(produto);
	}

	public List<Produto> listaTodos() {
		return produtoDao.listaTodos();
	}

	public Produto buscaPorCodigo(String codigo) {
		return produtoDao.buscaPorCodigo(codigo);
	}
}
