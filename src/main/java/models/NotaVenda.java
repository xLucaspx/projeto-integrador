package models;

import java.time.LocalDate;

public class NotaVenda extends Nota {

	public NotaVenda(String numero, LocalDate data) {
		super(numero, data);
	}

	public NotaVenda(String numero, LocalDate data, Produto... produtos) {
		super(numero, data);
		addItens(produtos);
	}
}
