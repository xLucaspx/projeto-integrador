package models;

public class Produto {
	private String codigo;
	private String descricao;
	private Formato formato;
	private double quantidade;
	private float imposto;
	private float precoCusto;
	private float precoVenda;

	public Produto(String codigo, String descricao, Formato formato, double quantidade, float precoCusto,
			float precoVenda, float imposto) {
		setCodigo(codigo);
		setDescricao(descricao);
		setFormato(formato);
		setQuantidade(quantidade);
		setPrecoCusto(precoCusto);
		setPrecoVenda(precoVenda);
		setImposto(imposto);
	}

	public Produto(String codigo, String descricao, Formato formato, double quantidade, float precoCusto,
			float precoVenda) {
		setCodigo(codigo);
		setDescricao(descricao);
		setFormato(formato);
		setQuantidade(quantidade);
		setPrecoCusto(precoCusto);
		setPrecoVenda(precoVenda);
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public float getPrecoCusto() {
		return precoCusto;
	}

	public void setPrecoCusto(float precoCusto) {
		this.precoCusto = precoCusto;
	}

	public Formato getFormato() {
		return formato;
	}

	public void setFormato(Formato formato) {
		this.formato = formato;
	}

	public double getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(double quantidade) {
		this.quantidade = quantidade;
	}

	public float getImposto() {
		return imposto;
	}

	public void setImposto(float imposto) {
		this.imposto = imposto;
	}

	public float getPrecoVenda() {
		return precoVenda;
	}

	public void setPrecoVenda(float precoVenda) {
		this.precoVenda = precoVenda;
	}

	@Override
	public String toString() {
		String produto = String.format(
				"Código: %s\nDescrição: %s\nQuantidade: %.2f\nFormato: %s\nPreço custo: R$ %.2f\nPreço venda: R$ %.2f\nImposto: ",
				codigo, descricao, quantidade, formato, precoCusto, precoVenda);

		if (imposto > 0)
			produto += String.format("%.0f%%", imposto * 100);
		else
			produto += "não cadastrado!";

		return produto;
	}
}
