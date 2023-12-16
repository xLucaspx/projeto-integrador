package controller;

import dao.ProdutoDao;
import java.util.List;
import models.Produto;

public class ProdutoController {
  private final ProdutoDao produtoDao;

  public ProdutoController(ProdutoDao produtoDao) {
    this.produtoDao = produtoDao;
  }

  public void cadastra(Produto produto) {
    produtoDao.cadastra(produto);
  }

  public void edita(Produto produto) {
    produtoDao.edita(produto);
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
