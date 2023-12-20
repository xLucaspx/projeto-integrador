package models.produto;

import static utils.Validator.validaString;

import exceptions.ValidationException;

public record DadosControleProduto(String codigo, double estoque, float precoCusto, float precoVenda) {

	public DadosControleProduto(String codigo, double estoque, float precoCusto) {
		// calculando 50% de margem a partir do preço de custo:
		this(codigo, estoque, precoCusto, (precoCusto + (precoCusto * 0.5f)));
	}

	public DadosControleProduto {
		if (!validaString(codigo)) throw new ValidationException("O código inserido é inválido!");

		if (estoque < 0) throw new ValidationException("O estoque dos produtos não pode ser negativo!");

		if (precoCusto < 0) throw new ValidationException("O preço de custo dos produtos não pode ser negativo!");

		if (precoVenda < 0) throw new ValidationException("O preço de venda dos produtos não pode ser negativo!!");

		if (precoVenda <= precoCusto) throw new ValidationException("O preço de venda deve ser maior que o preço de custo");
	}
}
