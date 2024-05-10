package reis.gerenciadoremprestimolivros.entidades;

public final class Livro extends Item {

    private int coletanea;

    public Livro(int coletanea, String titulo, String autor, String editora, String isbn, int paginas, int ano) {
        super(titulo, autor, editora, isbn, paginas, ano);
        this.coletanea = coletanea;
    }

    public int getColetanea() {
        return coletanea;
    }

    public void setColetanea(int coletanea) {
        this.coletanea = coletanea;
    }

    @Override
    public String toString() {
        return "Livro{"
                + super.toString()
                + "coletanea=" + coletanea
                + '}';
    }

}
