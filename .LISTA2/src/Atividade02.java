import java.util.Scanner;

public class Atividade02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual o valor do produto? ");
        double valorProd = scanner.nextDouble();

        System.out.println("Qual a quantidade? ");
        int qtd = scanner.nextInt();
        double preco = qtd * valorProd;

        if(qtd <= 12){
            System.out.println("O valor total é " + preco);
        } else if (qtd > 12) {
            double precoDesc = preco * 10 / 100;
            double precoFinal = preco - precoDesc;

            System.out.println("O preço original era " + preco);
            System.out.println("Com desconto de 10% é: " + precoFinal);
        }
    }
}
