package models;

import utils.Validator;

public class Fornecedor {
	private String cnpj;
	private String razaoSocial;
	private String nomeFantasia;
	private String email;
	private String telefone;
	private Endereco endereco;

	public Fornecedor(String cnpj, String razaoSocial, String nomeFantasia, String email, String telefone,
			Endereco endereco) {
		setCnpj(cnpj);
		setRazaoSocial(razaoSocial);
		setNomeFantasia(nomeFantasia);
		setEmail(email);
		setTelefone(telefone);
		setEndereco(endereco);
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		if (!Validator.validaCnpj(cnpj))
			throw new IllegalArgumentException("Valor inválido inserido para CNPJ! Valor inserido: " + cnpj);

		this.cnpj = cnpj;
	}

	public String getRazaoSocial() {
		return razaoSocial;
	}

	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}

	public String getNomeFantasia() {
		return nomeFantasia;
	}

	public void setNomeFantasia(String nomeFantasia) {
		this.nomeFantasia = nomeFantasia;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		if (!Validator.validaEmail(email))
			throw new IllegalArgumentException("Valor inválido inserido para e-mail! Valor inserido: " + email);

		this.email = email;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		if (!Validator.validaTelefone(telefone))
			throw new IllegalArgumentException("Valor inválido inserido para telefone! Valor inserido: " + telefone);

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
		return String.format("CNPJ: %s\nRazão social: %s\nNome fantasia: %s\nEmail: %s\nTelefone: %s\nEndereço: %s", cnpj,
				razaoSocial, nomeFantasia, email, telefone, endereco);
	}
}
