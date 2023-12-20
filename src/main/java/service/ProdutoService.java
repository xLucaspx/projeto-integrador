package service;

import dao.ProdutoDao;
import models.compra.DadosCompraProduto;
import models.produto.DadosControleProduto;

public class ProdutoService {
	private final ProdutoDao produtoDao;

	public ProdutoService(ProdutoDao produtoDao) {
		this.produtoDao = produtoDao;
	}

	public DadosControleProduto criaDadosControleProduto(DadosCompraProduto dados) {
		var produto = produtoDao.buscaPorCodigo(dados.codigoProduto());

		if (produto == null) return new DadosControleProduto(dados.codigoProduto(), dados.quantidade(), dados.precoCusto());

		var estoque = produto.getEstoque() + dados.quantidade();
		// pega o maior preço de custo:
		var precoCusto = produto.getPrecoCusto() <= dados.precoCusto() ? dados.precoCusto() : produto.getPrecoCusto();

		// calculando 50% de margem no custo
		var precoVendaCalculado = precoCusto + (precoCusto * 0.5f);
		// pega o maior preço de venda
		float precoVenda = produto.getPrecoVenda() <= precoVendaCalculado ? precoVendaCalculado : produto.getPrecoVenda();

		return new DadosControleProduto(dados.codigoProduto(), estoque, precoCusto, precoVenda);
	}
}
