import java.util.Scanner;

public class Atividade03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira o valor da compra: ");
        double valorCompra = scanner.nextDouble();

        double valorimposto = valorCompra * 0.3;

        double valorGorjeta = valorCompra * 0.2;

        double valorFinal = valorCompra + valorGorjeta + valorimposto;

        System.out.println("Valor original: " + valorCompra);
        System.out.println("Valor imposto: " + valorimposto);
        System.out.println("Valor gorjeta: " + valorGorjeta);
        System.out.println("Voce pagará: " + valorFinal);
    }
}
