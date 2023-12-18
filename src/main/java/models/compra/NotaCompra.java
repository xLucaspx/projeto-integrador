package models.compra;

import java.time.LocalDate;

import models.fornecedor.Fornecedor;
import models.nota.Nota;

public class NotaCompra extends Nota {
  private Fornecedor fornecedor;

  public NotaCompra(String numero, LocalDate data) {
    super(numero, data);
  }

  public NotaCompra(String numero, LocalDate data, Fornecedor fornecedor) {
    super(numero, data);
    setFornecedor(fornecedor);
  }

  public Fornecedor getFornecedor() {
    return fornecedor;
  }

  public void setFornecedor(Fornecedor fornecedor) {
    this.fornecedor = fornecedor;
  }
}
