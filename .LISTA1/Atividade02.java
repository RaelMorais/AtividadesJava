import java.util.Scanner;

public class Atividade02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Entre com o número 1: ");
        double num1 = scanner.nextDouble();

        System.out.println("Entre com o número 2: ");
        double num2 = scanner.nextDouble();

        double soma = num1 + num2;

        double subtracao = num1 - num2;

        double multiplicacao = num1 * num2;

        if(num2 != 0){//desafio 01
            double divisao = num1 / num2;
        } else if (num2 == 0) {

            System.out.println("Divisão não pode ser realizada :(");
        }
        double resto = num1 % num2;

        double potencializacao = Math.pow(num1, num2);//desafio 02

        System.out.println("Adição:" + soma);
        System.out.println("Subtração:" +subtracao);
        System.out.println("Multiplicação: " + multiplicacao);
        System.out.println("Resto: " + resto);
        System.out.println("Potencialização: " + potencializacao);
    }
}
