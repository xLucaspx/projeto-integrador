package models;

public enum Formato {
	UNIDADE("Unidade"), KILOGRAMA("Kilograma"), GRAMA("Grama"), MILIGRAMA("Miligrama"), LITRO("Litro"),
	MILILITRO("Mililitro");

	private String formato;

	private Formato(String formato) {
		this.formato = formato;
	}

	@Override
	public String toString() {
		return formato;
	}
}
