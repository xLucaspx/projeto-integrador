package domain.nota;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import domain.produto.Produto;

public abstract class Nota {
	private String numero;
	private LocalDate data;
	private ArrayList<Produto> itens;

	public Nota(String numero, LocalDate data) {
		this.itens = new ArrayList<>();
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public LocalDate getData() {
		return data;
	}

	public void setData(LocalDate data) {
		this.data = data;
	}

	public List<Produto> getItens() {
		return Collections.unmodifiableList(itens);
	}

	public void setItens(ArrayList<Produto> produtos) {
		this.itens = (produtos);
	}

	public void addItens(Produto... produtos) {
		for (Produto produto : produtos) {
			itens.add(produto);
		}
	}
}
