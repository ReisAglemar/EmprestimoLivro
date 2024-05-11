package reis.gerenciadoremprestimolivros.entidades;

public class Item {

    protected String titulo, autor, editora, isbn;
    protected int paginas, ano;
    protected boolean disponivel;

    public Item(String titulo, String autor, String editora, String isbn, int paginas, int ano) {
        this.titulo = titulo;
        this.autor = autor;
        this.editora = editora;
        this.isbn = isbn;
        this.paginas = paginas;
        this.ano = ano;
        this.disponivel = true;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public int getPaginas() {
        return paginas;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }

    @Override
    public String toString() {
        return "Item{"
                + "titulo=" + titulo
                + ", autor=" + autor
                + ", editora=" + editora
                + ", isbn=" + isbn
                + ", paginas=" + paginas
                + ", ano=" + ano
                + '}';
    }

}
