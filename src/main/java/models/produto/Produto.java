package models.produto;

import static utils.Validator.validaString;

import exceptions.ValidationException;

public class Produto {

	private String codigo;
	private String descricao;
	private Formato formato;
	private double estoque;
	private float precoCusto;
  private float precoVenda;
  private boolean ativo;
	
	public Produto(DadosBasicosProduto dados) {
		this.codigo = dados.codigo();
		this.descricao = dados.descricao();
		this.formato = dados.formato();
	}

	public Produto(String codigo, String descricao, Formato formato, double estoque, float precoVenda, float precoCusto, boolean ativo) {
		this.codigo = codigo;
		this.descricao = descricao;
		this.formato = formato;
		this.estoque = 0;
		this.precoVenda = 0;
		this.precoCusto = 0;
    this.ativo = ativo;
	}

	public String getCodigo() {
		return codigo;
	}

	public String getDescricao() {
		return descricao;
	}

	public float getPrecoCusto() {
		return precoCusto;
	}

	public Formato getFormato() {
		return formato;
	}

	public double getEstoque() {
		return estoque;
	}

	public float getPrecoVenda() {
		return precoVenda;
	}

  public boolean isAtivo() {
    return ativo;
  }
  
	@Override
	public String toString() {
		return String.format(
				"Código: %s%nDescrição: %s%nQuantidade: %.2f%nFormato: %s%nPreço custo: R$ %.2f%nPreço venda: R$ %.2f", codigo,
				descricao, estoque, formato, precoCusto, precoVenda);
	}
}
