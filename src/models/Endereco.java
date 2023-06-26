package models;

import utils.Validator;

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

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		if (!Validator.validaCep(cep))
			throw new IllegalArgumentException("Valor inválido inserido para CEP! Valor inserido: " + cep);

		this.cep = cep;
	}

	public String getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getUf() {
		return uf;
	}

	public void setUf(String uf) {
		uf = uf.toUpperCase();

		if (!Validator.validaUf(uf))
			throw new IllegalArgumentException("Valor inválido inserido para UF! Valor inserido: " + uf);

		this.uf = uf;
	}

	@Override
	public String toString() {
		String endereco = logradouro + ", ";

		if (numero != null && !numero.trim().isEmpty())
			endereco += numero + ", ";

		if (complemento != null && !complemento.trim().isEmpty())
			endereco += complemento + ", ";

		endereco += String.format("bairro %s, %s - %s; CEP: %s", bairro, cidade, uf, cep);

		return endereco;
	}
}
