package models;

public enum Formato {
    UNIDADE("Unidade", 1), KILOGRAMA("Kilograma", 2), GRAMA("Grama", 3), MILIGRAMA("Miligrama", 4), LITRO("Litro", 5),
    MILILITRO("Mililitro", 6);

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
