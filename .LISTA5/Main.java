import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Biblioteca biblioteca = new Biblioteca();
        int opcao;

        do {
            System.out.println("\n=== Sistema de Gerenciamento de Biblioteca ===");
            System.out.println("\n=== Biblioteca da Agdá ===");
            System.out.println("1. Cadastrar livro");
            System.out.println("2. Emprestar livro");
            System.out.println("3. Devolver livro");
            System.out.println("4. Listar livros disponíveis");
            System.out.println("5. Listar livros emprestados");
            System.out.println("6. Buscar livros por título ou autor");
            System.out.println("7. Sair");
            System.out.print("Escolha uma opção: ");

            try {
                opcao = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Erro: Digite um número válido!");
                opcao = 0;
                continue;
            }

            switch (opcao) {
                case 1:
                    System.out.print("Digite o título do livro: ");
                    String titulo = scanner.nextLine();
                    System.out.print("Digite o autor do livro: ");
                    String autor = scanner.nextLine();
                    System.out.print("Digite o ISBN do livro: ");
                    String isbn = scanner.nextLine();
                    biblioteca.cadastrarLivro(titulo, autor, isbn);
                    break;

                case 2:
                    System.out.print("Digite o ISBN do livro para emprestar: ");
                    biblioteca.emprestarLivro(scanner.nextLine());
                    break;

                case 3:
                    System.out.print("Digite o ISBN do livro para devolver: ");
                    biblioteca.devolverLivro(scanner.nextLine());
                    break;

                case 4:
                    biblioteca.listarDisponiveis();
                    break;

                case 5:
                    biblioteca.listarEmprestados();
                    break;

                case 6:
                    System.out.print("Digite o termo para busca (título ou autor): ");
                    biblioteca.buscarLivro(scanner.nextLine());
                    break;

                case 7:
                    System.out.println("Saindo do sistema. Até logo!");
                    break;

                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }
        } while (opcao != 7);

        scanner.close();
    }
}
