package models;

import static utils.Validator.validaString;

import exceptions.ValidationException;

public class Produto {
	private String codigo;
	private String descricao;
	private Formato formato;
	private double quantidade;
	private float imposto;
	private float precoCusto;
	private float precoVenda;

	public Produto(String codigo, String descricao, Formato formato, double quantidade, float precoVenda,
			float precoCusto, float imposto) {
		setCodigo(codigo);
		setDescricao(descricao);
		setFormato(formato);
		setQuantidade(quantidade);
		setPrecoVenda(precoVenda);
		setPrecoCusto(precoCusto);
		setImposto(imposto);
	}

	public Produto(String codigo, String descricao, Formato formato, double quantidade, float precoVenda,
			float precoCusto) {
		setCodigo(codigo);
		setDescricao(descricao);
		setFormato(formato);
		setQuantidade(quantidade);
		setPrecoVenda(precoVenda);
		setPrecoCusto(precoCusto);
	}

	public String getCodigo() {
		return codigo;
	}

	private void setCodigo(String codigo) {
		if (!validaString(codigo)) throw new ValidationException("O código inserido é inválido!");

		this.codigo = codigo;
	}

	public String getDescricao() {
		return descricao;
	}

	private void setDescricao(String descricao) {
		if (!validaString(descricao)) throw new ValidationException("A descrição inserida é inválida!");

		this.descricao = descricao;
	}

	public float getPrecoCusto() {
		return precoCusto;
	}

	private void setPrecoCusto(float precoCusto) {
		if (precoCusto <= 0)
			throw new ValidationException("O preço inserido é inválido; por favor, insira um valor maior do que 0!");
		if (precoCusto >= precoVenda)
			throw new ValidationException("O preço de custo deve ser menor do que o preço de venda!");

		this.precoCusto = precoCusto;
	}

	public Formato getFormato() {
		return formato;
	}

	private void setFormato(Formato formato) {
		if (formato == null) throw new ValidationException("O formato selecionado é inválido!");

		this.formato = formato;
	}

	public double getQuantidade() {
		return quantidade;
	}

	private void setQuantidade(double quantidade) {
		if (quantidade <= 0)
			throw new ValidationException("A quantidade inserida é inválida; por favor, insira um valor maior do que 0!");

		this.quantidade = quantidade;
	}

	public float getImposto() {
		return imposto;
	}

	private void setImposto(float imposto) {
		if (imposto < 0)
			throw new ValidationException("O imposto inserido é inválido; por favor, insira um valor maior ou igual a 0!");

		this.imposto = imposto;
	}

	public float getPrecoVenda() {
		return precoVenda;
	}

	private void setPrecoVenda(float precoVenda) {
		if (precoVenda <= 0)
			throw new ValidationException("O preço de venda inserido é inválido; por favor, insira um valor maior do que 0!");
		if (precoVenda <= precoCusto)
			throw new ValidationException("O preço de venda não pode ser menor do que o preço de custo!");

		this.precoVenda = precoVenda;
	}

	@Override
	public String toString() {
		String produto = String.format(
				"Código: %s\nDescrição: %s\nQuantidade: %.2f\nFormato: %s\nPreço custo: R$ %.2f\nPreço venda: R$ %.2f\nImposto: ",
				codigo, descricao, quantidade, formato, precoCusto, precoVenda);

		if (imposto > 0) produto += String.format("%.0f%%", imposto * 100);
		else produto += "não cadastrado!";

		return produto;
	}
}
