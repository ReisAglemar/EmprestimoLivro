package reis.gerenciadoremprestimolivros.entidades;

public final class Cliente extends Pessoa {

    private int turma;
    private String turno;

    public Cliente(int turma, String turno, String nome, String cpf, String endereco, String contato) {
        super(nome, cpf, endereco, contato);
        this.turma = turma;
        this.turno = turno;
    }

    public int getTurma() {
        return turma;
    }

    public void setTurma(int turma) {
        this.turma = turma;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    @Override
    public String toString() {
        return "Cliente{"
                + super.toString()
                + "turma=" + turma
                + ", turno=" + turno
                + '}';
    }

}
