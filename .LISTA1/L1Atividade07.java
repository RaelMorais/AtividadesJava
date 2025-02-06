import java.util.Scanner;

public class L1Atividade07 {
    public static void main(String[] args) {
        double totalVendas = 0;
        double salarioPadrao = 1500;

        System.out.println("++++++++++Calculo salarial++++++++++");
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nome: ");
        String nome = scanner.nextLine();

        System.out.println("Entre com o mes:  ");
        String mes = scanner.nextLine();

        System.out.println("Numero de carros vendidos: ");
        int numCarros = scanner.nextInt();

        for(int i =1; i <= numCarros; i++){
            System.out.println("Digite o preço do " + i + "º carro: R$ ");
            double precoCarro = scanner.nextDouble();
            totalVendas += precoCarro;
        }

        double comicao = numCarros * 350;
        double totalVendasComicao = totalVendas * 0.001;
        double salario = comicao + totalVendasComicao + salarioPadrao;

        System.out.println("Olá " + nome);
        System.out.println("No mes de " + mes);
        System.out.println("Voce vendeu " + numCarros + " carros");
        System.out.println("Sua comição foi de " + comicao);
        System.out.println("Comição total " + totalVendasComicao);
        System.out.println("Seu salario foi " + salario);


    }
}
