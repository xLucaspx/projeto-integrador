package models.compra;

import static utils.Validator.validaString;

import exceptions.ValidationException;

public record DadosCompraProduto(String codigoProduto, double quantidade, float precoCusto) {

	public DadosCompraProduto {
		if (!validaString(codigoProduto)) throw new ValidationException("O código do produto inserido não é válido!");

		if (quantidade <= 0) throw new ValidationException("A quantidade dos produtos comprados deve ser maior do que 0!");

		if (precoCusto < 0)
			throw new ValidationException("O preço de custo dos produtos comprados não pode ser menor do que 0!");
	}
}
