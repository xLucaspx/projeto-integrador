package models;

public class Produto {
	private String codigo;
	private String descricao;
	private Formato formato;
	private double quantidade;
	private float imposto;
	private float precoCusto;
	private float precoVenda;

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
}
