package models.compra;

import exceptions.ValidationException;
import java.time.LocalDate;
import java.util.List;
import static utils.Validator.validaCnpj;
import static utils.Validator.validaString;

public record DadosRegistroNotaCompra(String numeroNota, LocalDate dataCompra, String cnpjFornecedor,
  List<DadosCompraProduto> produtos) {

  public DadosRegistroNotaCompra    {
    if (!validaString(numeroNota))
      throw new ValidationException("O numero da nota inserido é inválido!");

    if (dataCompra == null)
      throw new ValidationException("A data de compra inserida é inválida!");

    if (!validaCnpj(cnpjFornecedor))
      throw new ValidationException("O CNPJ do fornecedor inserido é inválido!");

    if (produtos == null)
      throw new ValidationException("Ocorreu um erro com a lista de produtos!");

    if (produtos.isEmpty())
      throw new ValidationException("A nota deve possuir ao menos um produto!");
  }
}
