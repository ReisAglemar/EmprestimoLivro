package reis.gerenciadoremprestimolivros;

import reis.gerenciadoremprestimolivros.entidades.*;

public class GerenciadorEmprestimoLIvros {

    public static void main(String[] args) {

        DataHora dataHora = new DataHora();
        Livro livro[] = new Livro[3];
        Revista revista[] = new Revista[2];
        Funcionario funcionario[] = new Funcionario[2];
        Cliente cliente[] = new Cliente[2];
        Emprestimo emprestimo = new Emprestimo();

        livro[0] = new Livro(0, "Como Falar Em Público & Influenciar Pessoas No Mundo Dos Negócios",
                "Dale Carnegie.", "Record.", "978-85-01-11207-1", 238, 2023);

        livro[1] = new Livro(0, "Linux A Bíblia", "Chistopher negus & Christiane Bresnahan",
                "Alta Books", "978-85-7608-799-1", 852, 2014);

        livro[2] = new Livro(0, "Engenharia De Software 10ª Ed.", "Ian Sommerville",
                "Pearson", "978-85-430-2497-4", 756, 2018);

        revista[0] = new Revista("Abril", "Estrutura De Dados I", "Autor",
                "Editora", "978-***-", 150, 2023);

        revista[1] = new Revista("Abril", "Estrutura De Dados II", "Autor",
                "Editora", "789-***-", 150, 2023);

        funcionario[0] = new Funcionario(1, "Nicolau Copérnico",
                "098.890.909-67", "Rua terra rara nº 3", "(48)98834-3434");

        funcionario[1] = new Funcionario(2, "Nikola Tesla",
                "098.976.346-12", "Rua terra rara nº 4", "(48)98843-4343");

        cliente[0] = new Cliente(1105, "Manhã", "Erwin Schrödinger",
                "234.908.539-45", "Rua Dos gatos Nº 18", "(48)98433-3535");

        cliente[1] = new Cliente(1107, "Tarde", "Marie Curie",
                "469.234.654-23", "Rua Rádio Nº 45", "(48)98433-5353");

        System.out.println(
                emprestimo.emprestarLivro(livro[1], cliente[1],
                        funcionario[0], dataHora.getDataFormatada())
        );

        System.out.println(
                emprestimo.emprestarRevista(revista[1], cliente[0],
                        funcionario[1], dataHora.getDataFormatada())
        );

    }
}
