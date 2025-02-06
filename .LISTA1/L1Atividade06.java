import java.util.Scanner;

public class Atividade06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Entre com a nota 1: ");
        double nota1 = scanner.nextDouble();

        System.out.println("Entre com a nota 2: ");
        double nota2 = scanner.nextDouble();

        double PondN1 = (nota1 * 40) / 100;
        double PondN2 = (nota2 * 60) / 100;

        double soma = PondN1 + PondN2;

        System.out.println("A média ponderada de " + nota1 + " + " + nota2 + "   é: " + soma);


    }
}
