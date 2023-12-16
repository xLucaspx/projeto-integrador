package domain.produto;

import static utils.Validator.validaString;

import exceptions.ValidationException;

public record DadosBasicosProduto(String codigo, String descricao, Formato formato) {

	public DadosBasicosProduto {
		if (!validaString(codigo)) throw new ValidationException("O código inserido é inválido!");

		if (!validaString(descricao)) throw new ValidationException("A descrição inserida é inválida!");

		if (formato == null) throw new ValidationException("O formato selecionado é inválido!");
	}
}
