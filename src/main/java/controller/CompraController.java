package controller;

import dao.NotaCompraDao;
import models.compra.DadosRegistroNotaCompra;

public class CompraController {
  private final NotaCompraDao compraDao;

  public CompraController(NotaCompraDao compraDao) {
    this.compraDao = compraDao;
  }

  public void cadastra(DadosRegistroNotaCompra dados) {
    compraDao.cadastra(dados);
  }

}
