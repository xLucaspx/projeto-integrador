package models.produto;

public enum Formato {
	UNIDADE("Unidade", 1), KILOGRAMA("Kilograma", 2), LITRO("Litro", 3);

	private String formato;
	private int codigo;

	private Formato(String formato, int codigo) {
		this.formato = formato;
		this.codigo = codigo;
	}

	public int getCodigo() {
		return codigo;
	}

	@Override
	public String toString() {
		return formato;
	}
}
