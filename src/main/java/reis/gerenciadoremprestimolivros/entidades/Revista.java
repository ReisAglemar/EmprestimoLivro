package reis.gerenciadoremprestimolivros.entidades;

public final class Revista extends Item {

    private String mes;

    public Revista(String mes, String titulo, String autor, String editora, String isbn, int paginas, int ano) {
        super(titulo, autor, editora, isbn, paginas, ano);
        this.mes = mes;
    }

    public String getMes() {
        return mes;
    }

    public void setMes(String mes) {
        this.mes = mes;
    }

    @Override
    public String toString() {
        return "Revista{"
                + super.toString()
                + "mes=" + mes
                + '}';
    }

}
