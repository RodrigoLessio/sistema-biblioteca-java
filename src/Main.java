import model.Livro;
import model.Usuario;
import service.Biblioteca;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Biblioteca biblioteca = new Biblioteca();
        Scanner scanner = new Scanner(System.in);

        int opcao = -1;

        while (opcao != 0) {

            System.out.println("\n====================");
            System.out.println("       BIBLIOTECA");
            System.out.println("====================");
            System.out.println("1 - Cadastrar livro");
            System.out.println("2 - Cadastrar usuário");
            System.out.println("3 - Emprestar livro");
            System.out.println("4 - Devolver livro");
            System.out.println("5 - Consultar livro");
            System.out.println("6 - Consultar usuário");
            System.out.println("0 - Sair");
            System.out.print("Escolha: ");

            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    System.out.println("Titulo: ");
                    String titulo = scanner.nextLine();

                    System.out.println("Autor: ");
                    String autor = scanner.nextLine();

                    System.out.println("Ano de publicação: ");
                    int anoPublicacao = scanner.nextInt();
                    scanner.nextLine();

                    System.out.println("ISBN: ");
                    String isbn = scanner.nextLine();

                    Livro livro = new Livro(titulo, autor, anoPublicacao, isbn);
                    biblioteca.adicionarLivro(livro);
                    System.out.println("Livro cadastrado.");
                    break;
                case 2:
                    System.out.println("Nome: ");
                    String nome = scanner.nextLine();

                    System.out.println("CPF: ");
                    String cpf = scanner.nextLine();

                    System.out.println("Matricula: ");
                    String matricula = scanner.nextLine();

                    Usuario usuario = new Usuario(nome, cpf, matricula);
                    biblioteca.adicionarUsuario(usuario);
                    System.out.println("Usuário cadastrado.");
                    break;
                case 3:
                    System.out.println("Digite a ISBN do livro: ");
                    isbn = scanner.nextLine();

                    livro = (biblioteca.procurarLivro(isbn));
                    livro.emprestarLivro(livro);
                    break;
                case 4:
                    System.out.println("Digite a ISBN do livro: ");
                    isbn = scanner.nextLine();

                    livro = (biblioteca.procurarLivro(isbn));
                    livro.devolverLivro(livro);
                    break;
                case 5:
                    System.out.println("Digite a ISBN do livro: ");
                    isbn = scanner.nextLine();

                    livro = biblioteca.procurarLivro(isbn);
                    if (livro != null) {
                        livro.imprimeLivro();
                    }
                    break;
                case 6:
                    System.out.println("Digite a Matricula do usuario: ");
                    matricula = scanner.nextLine();

                    usuario = biblioteca.procurarUsuario(matricula);
                    if (usuario != null) {
                        usuario.imprimeUsuario();
                    }
                    break;
                case 0:
                    opcao = 0;
                    break;
                default:
                    System.out.println("Opção indisponível.");
                    break;
            }
        }
    }
}