package models;

import static utils.Validator.validaCep;
import static utils.Validator.validaString;

import exceptions.ValidationException;
import utils.Validator;

;

public class Endereco {
  private String cep;
  private String logradouro;
  private String complemento;
  private String numero;
  private String bairro;
  private String cidade;
  private String uf;

  public Endereco(String cep, String logradouro, String bairro, String cidade, String uf) {
    setCep(cep);
    setLogradouro(logradouro);
    setBairro(bairro);
    setCidade(cidade);
    setUf(uf);
  }

  public Endereco(String cep, String logradouro, String bairro, String cidade, String uf, String numero, String complemento) {
    setCep(cep);
    setLogradouro(logradouro);
    setBairro(bairro);
    setCidade(cidade);
    setUf(uf);
    setNumero(numero);
    setComplemento(complemento);
  }

  public String getCep() {
    return cep;
  }

  private void setCep(String cep) {
    if (!validaCep(cep))
      throw new ValidationException("Valor inválido inserido para CEP! Valor inserido: " + cep);

    this.cep = cep;
  }

  public String getLogradouro() {
    return logradouro;
  }

  private void setLogradouro(String logradouro) {
    if (!validaString(logradouro))
      throw new ValidationException("Valor inválido inserido para logradouro!");

    this.logradouro = logradouro;
  }

  public String getComplemento() {
    return complemento;
  }

  public void setComplemento(String complemento) {
    if (!validaString(complemento))
      throw new ValidationException("Valor inválido inserido para complemento!");

    this.complemento = complemento;
  }

  public String getNumero() {
    return numero;
  }

  public void setNumero(String numero) {
    if (!validaString(numero))
      throw new ValidationException("Valor inválido inserido para número!");

    this.numero = numero;
  }

  public String getBairro() {
    return bairro;
  }

  private void setBairro(String bairro) {
    if (!validaString(bairro))
      throw new ValidationException("Valor inválido inserido para bairro!");

    this.bairro = bairro;
  }

  public String getCidade() {
    return cidade;
  }

  private void setCidade(String cidade) {
    if (!validaString(cidade))
      throw new ValidationException("Valor inválido inserido para cidade!");

    this.cidade = cidade;
  }

  public String getUf() {
    return uf;
  }

  private void setUf(String uf) {
    if (!validaString(uf))
      throw new ValidationException("Valor inválido inserido para UF!");

    uf = uf.toUpperCase();

    if (!Validator.validaUf(uf))
      throw new IllegalArgumentException("Valor inválido inserido para UF! Valor inserido: " + uf);

    this.uf = uf;
  }

  @Override
  public String toString() {
    String endereco = logradouro + ", ";

    if (numero != null && !numero.trim().isEmpty()) endereco += numero + ", ";

    if (complemento != null && !complemento.trim().isEmpty())
      endereco += complemento + ", ";

    endereco += String.format("bairro %s, %s - %s; CEP: %s", bairro, cidade, uf, cep);

    return endereco;
  }
}
