package models;

public class Fornecedor {
	private String cnpj;
	private String razaoSocial;
	private String nomeFantasia;
	private String email;
	private String telefone;
	private Endereco endereco;

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		if (cnpj.length() != 14)
			throw new IllegalArgumentException("Valor inválido para CNPJ; insira apenas números!");
		
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
		if (!email.matches("^(?=.{1,64}@)[A-Za-z0-9_-]+(\\\\.[A-Za-z0-9_-]+)*@[^-][A-Za-z0-9-]+(\\\\.[A-Za-z0-9-]+)*(\\\\.[A-Za-z]{2,})$"))
			throw new IllegalArgumentException("O email inserido é inválido");
		
		this.email = email;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		if (!telefone.matches("^\\(?(?:[14689][1-9]|2[12478]|3[1234578]|5[1345]|7[134579])\\)? ?(?:[2-8]|9[1-9])[0-9]{3}\\-?[0-9]{4}$"))
			throw new IllegalArgumentException("O telefone inserido é inválido");
		
		this.telefone = telefone;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
}
