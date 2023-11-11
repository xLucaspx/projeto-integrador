package models;

import static utils.Validator.validaString;

import exceptions.ValidationException;

public class Produto {

	private String codigo;
	private String descricao;
	private Formato formato;
	private double estoque;
	private float precoCusto;
	private float precoVenda;

	public Produto(String codigo, String descricao, Formato formato, double estoque, float precoVenda,
			float precoCusto) {
		setCodigo(codigo);
		setDescricao(descricao);
		setFormato(formato);
		setEstoque(estoque);
		setPrecoVenda(precoVenda);
		setPrecoCusto(precoCusto);

	}

	public String getCodigo() {
		return codigo;
	}

	private void setCodigo(String codigo) {
		if (!validaString(codigo))
			throw new ValidationException("O código inserido é inválido!");

		this.codigo = codigo;
	}

	public String getDescricao() {
		return descricao;
	}

	private void setDescricao(String descricao) {
		if (!validaString(descricao))
			throw new ValidationException("A descrição inserida é inválida!");

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
		if (formato == null)
			throw new ValidationException("O formato selecionado é inválido!");

		this.formato = formato;
	}

	public double getEstoque() {
		return estoque;
	}

	private void setEstoque(double estoque) {
		if (estoque < 0)
			throw new ValidationException("A quantidade inserida é inválida; por favor, insira um valor maior do que 0!");

		this.estoque = estoque;
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
				"Código: %s\nDescrição: %s\nQuantidade: %.2f\nFormato: %s\nPreço custo: R$ %.2f\nPreço venda: R$ %.2f",
				codigo, descricao, estoque, formato, precoCusto, precoVenda);

		return produto;
	}
}
