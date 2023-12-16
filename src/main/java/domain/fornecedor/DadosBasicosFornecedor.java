package domain.fornecedor;

import exceptions.ValidationException;
import static utils.Validator.validaCnpj;
import static utils.Validator.validaEmail;
import static utils.Validator.validaString;
import static utils.Validator.validaTelefone;

public record DadosBasicosFornecedor(String cnpj, String nome, String email, String telefone, Endereco endereco) {

  public DadosBasicosFornecedor     {
    if (!validaCnpj(cnpj))
      throw new ValidationException("Valor inválido inserido para CNPJ! Valor inserido: " + cnpj);

    if (!validaString(nome))
      throw new ValidationException("Valor inválido inserido para nome: " + nome);

    if (!validaEmail(email))
      throw new ValidationException("Valor inválido inserido para e-mail! Valor inserido: " + email);

    if (!validaTelefone(telefone))
      throw new ValidationException("Valor inválido inserido para telefone! Valor inserido: " + telefone);

    if (endereco == null)
      throw new ValidationException("O endereço deve ser informado!");
  }
}
