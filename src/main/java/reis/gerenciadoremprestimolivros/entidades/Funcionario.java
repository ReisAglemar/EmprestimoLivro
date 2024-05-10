package reis.gerenciadoremprestimolivros.entidades;

public final class Funcionario extends Pessoa {

    private int idFuncionario;

    public Funcionario(int idFuncionario, String nome, String cpf, String endereco, String contato) {
        super(nome, cpf, endereco, contato);
        this.idFuncionario = idFuncionario;
    }

    public int getIdFuncionario() {
        return idFuncionario;
    }

    public void setIdFuncionario(int idFuncionario) {
        this.idFuncionario = idFuncionario;
    }

    @Override
    public String toString() {
        return "Funcionario{"
                + super.toString()
                + "idFuncionario=" + idFuncionario
                + '}';
    }

}
