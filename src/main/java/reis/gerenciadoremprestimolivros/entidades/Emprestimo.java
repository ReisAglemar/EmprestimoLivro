package reis.gerenciadoremprestimolivros.entidades;

public class Emprestimo implements Acoes {

    private Revista revista;
    private Livro livro;
    private Funcionario funcionario;
    private Cliente cliente;
    private DataHora dataHora;

    public Emprestimo() {
    }

    public Revista getRevista() {
        return revista;
    }

    public void setRevista(Revista revista) {
        this.revista = revista;
    }

    public Livro getLivro() {
        return livro;
    }

    public void setLivro(Livro livro) {
        this.livro = livro;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public DataHora getDataHora() {
        return dataHora;
    }

    public void setDataHora(DataHora dataHora) {
        this.dataHora = dataHora;
    }

    @Override
    public String emprestarLivro(Livro livro, Cliente cliente, Funcionario funcionario, String dataHora) {

        if (livro.isDisponivel()) {

            String comprovante = """
                           
                        \t ================ EMPRÉSTIMO ================
                                
                        \t   1- Livro: %s
                                    
                        \t   2- Cliente: %s
                                    
                        \t   3- Funciońario: %s
                                    
                        \t   4- Data: %s
                           
                        \t+--------------------------------------------+  
                        """.formatted(livro.getTitulo(), cliente.getNome(),
                    funcionario.getNome(), dataHora);

            livro.setDisponivel(false);

            return comprovante;

        } else {

            return livro.getTitulo() + ", já foi emprestado. Aguarde ser devolvido!";
        }
    }

    @Override
    public String emprestarRevista(Revista revista, Cliente cliente, Funcionario funcionario, String dataHora) {

        if (revista.isDisponivel()) {

            String comprovante = """
                           
                        \t ================ EMPRÉSTIMO ================
                                
                        \t   1- Revista: %s
                                    
                        \t   2- Cliente: %s
                                    
                        \t   3- Funciońario: %s
                                    
                        \t   4- Data: %s
                           
                        \t+--------------------------------------------+  
                        """.formatted(revista.getTitulo(), cliente.getNome(),
                    funcionario.getNome(), dataHora);

            revista.setDisponivel(false);

            return comprovante;

        } else {

            return revista.getTitulo() + ", já foi emprestado. Aguarde ser devolvido!";
        }
    }

    @Override
    public String devolverLivro(Livro livro, Cliente cliente, Funcionario funcionario, String dataHora) {

        if (!livro.isDisponivel()) {

            String comprovante = """
                           
                        \t ================ DEVOLUÇÃO ================
                                
                        \t   1- Livro: %s
                                    
                        \t   2- Cliente: %s
                                    
                        \t   3- Funciońario: %s
                                    
                        \t   4- Data: %s
                           
                        \t+--------------------------------------------+  
                        """.formatted(livro.getTitulo(), cliente.getNome(),
                    funcionario.getNome(), dataHora);

            livro.setDisponivel(true);

            return comprovante;

        } else {

            return livro.getTitulo() + " não está emprestado, impossível devolver!";
        }
    }

    @Override
    public String devolverRevista(Revista revista, Cliente cliente, Funcionario funcionario, String dataHora) {

        if (!revista.isDisponivel()) {

            String comprovante = """
                           
                        \t ================ DEVOLUÇÃO ================
                                
                        \t   1- Revista: %s
                                    
                        \t   2- Cliente: %s
                                    
                        \t   3- Funciońario: %s
                                    
                        \t   4- Data: %s
                           
                        \t+--------------------------------------------+  
                        """.formatted(revista.getTitulo(), cliente.getNome(),
                    funcionario.getNome(), dataHora);

            revista.setDisponivel(true);

            return comprovante;

        } else {

            return revista.getTitulo() + " não está emprestada, impossível devolver!";
        }
    }

    @Override
    public int aplicarMulta(Cliente cliente, Funcionario funcionario, String dataHora) {
        return 0;
    }

    @Override
    public String toString() {
        return "Emprestimo{"
                + "revista=" + revista
                + ", livro=" + livro
                + ", funcionario=" + funcionario
                + ", cliente=" + cliente
                + ", dataHora=" + dataHora
                + '}';
    }

}
