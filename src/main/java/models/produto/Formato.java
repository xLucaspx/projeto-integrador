package models.produto;

public enum Formato {
  UNIDADE("Unidade", "un.", 1), KILOGRAMA("Kilograma", "kg.", 2), LITRO("Litro", "l", 3);

  private final String formato;
  private final String sigla;
  private final int codigo;

  private Formato(String formato, String sigla, int codigo) {
    this.formato = formato;
    this.sigla = sigla;
    this.codigo = codigo;
  }

  public int getCodigo() {
    return codigo;
  }

  public String getSigla() {
    return sigla;
  }

  @Override
  public String toString() {
    return formato;
  }
}
