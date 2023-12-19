package models.fornecedor;

import utils.Validator;

public class Fornecedor {

	private String cnpj;
	private String nome;
	private String email;
	private String telefone;
	private Endereco endereco;

	public Fornecedor(String cnpj, String nome, String email, String telefone, Endereco endereco) {
		setCnpj(cnpj);
		setNome(nome);
		setEmail(email);
		setTelefone(telefone);
		setEndereco(endereco);
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		if (!Validator.validaCnpj(cnpj)) {
			throw new IllegalArgumentException("Valor inválido inserido para CNPJ! Valor inserido: " + cnpj);
		}

		this.cnpj = cnpj;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		if (!Validator.validaString(nome)) {
			throw new IllegalArgumentException("Valor inválido inserido para nome: " + nome);
		}
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		if (!Validator.validaEmail(email)) {
			throw new IllegalArgumentException("Valor inválido inserido para e-mail! Valor inserido: " + email);
		}

		this.email = email;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		if (!Validator.validaTelefone(telefone)) {
			throw new IllegalArgumentException("Valor inválido inserido para telefone! Valor inserido: " + telefone);
		}

		this.telefone = telefone;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	@Override
	public String toString() {
		return nome;
	}
}
