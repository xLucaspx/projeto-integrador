package domain.fornecedor;

import static utils.Validator.validaCep;
import static utils.Validator.validaString;

import exceptions.ValidationException;
import utils.Validator;

public record Endereco(String cep, String logradouro, String complemento, String numero, String bairro, String cidade, String uf) {

  public Endereco       {
    if (!validaCep(cep))
      throw new ValidationException("Valor inválido inserido para CEP! Valor inserido: " + cep);

    if (!validaString(logradouro))
      throw new ValidationException("Valor inválido inserido para logradouro!");

    if (!validaString(bairro))
      throw new ValidationException("Valor inválido inserido para bairro!");

    if (!validaString(cidade))
      throw new ValidationException("Valor inválido inserido para cidade!");

    if (!Validator.validaUf(uf))
      throw new IllegalArgumentException("Valor inválido inserido para UF! Valor inserido: " + uf);
  }
}
