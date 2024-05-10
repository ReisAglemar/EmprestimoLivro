package reis.gerenciadoremprestimolivros.entidades;

import java.util.Date;

public interface Acoes {

    public String emprestarLivro(Livro livro, Cliente cliente, Funcionario funcionario, String datahora);

    public String emprestarRevista(Revista revista, Cliente cliente, Funcionario funcionario, String dataHora);

    public String devolverLivro(Livro livro, Cliente cliente, Funcionario funcionario, String dataHora);

    public String devolverRevista(Revista revista, Cliente cliente, Funcionario funcionario, String dataHora);

    public int aplicarMulta(Cliente cliente, Funcionario funcionario, String dataHora);
}
