import java.util.Scanner;

public class Atividade07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("++++++Sejam bem vindo ao jogo de perguntas e respostas++++++");
        System.out.println("Deseja responder:\n1- *********\n2 - *********");
        int opcao = scanner.nextInt();
        scanner.nextLine();
        if (opcao == 1) {
            System.out.println("Qual a capital do Brasil?\n" +
                    "A)- Rio de Janeiro\n" +
                    "B)- Brasil\n" +
                    "C)- Brasília\n");
            String scanner_opcao = scanner.nextLine();
            scanner_opcao = scanner_opcao.toLowerCase();
            if (scanner_opcao.equals("a")) {
                System.out.println("Parabéns, você acertou! Retire seu prémio na Shostners and Shostners");
            } else {
                System.out.println("Você errou! Tente numa próxima");
            }
        }

        if (opcao == 2) {
            System.out.println("Qual é o melhor time?\n" +
                    "A)- Curintia\n" +
                    "B)- Porco\n" +
                    "C)- Atlético Mineiro\n");
            String scanner_opcao = scanner.nextLine();
            scanner_opcao = scanner_opcao.toLowerCase();
            if (scanner_opcao.equals("c")) {
                System.out.println("Parabéns, você acertou! Retire seu prémio na Shostners and Shostners");
            } else {
                System.out.println("Você errou! Tente numa próxima");
            }
        }
        scanner.close();
    }

}

