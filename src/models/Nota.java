package models;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Nota {
	private String numero;
	private LocalDate data;
	private ArrayList<Produto> itens;
	
	public Nota() {
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
}
