import java.util.Scanner;

public class L3Atividade02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Quantas pessoas deseja adicionar?");
        int idadeAcima50 =0;
        int alturaAcima160 =0;
        int pesoAbaixo80 =0;
        int pessoas = scanner.nextInt();
        for (int i = 0; i < pessoas; i++){
            System.out.println("Pessoa " + i);

            System.out.println("Idade");
            int idade = scanner.nextInt();

            System.out.println("Peso");
            double peso = scanner.nextDouble();

            System.out.print("Digite a altura (em metros, ex: 1.75): ");
            double altura = scanner.nextDouble();

            if(idade > 50){
                idadeAcima50++;
            }
            if(altura > 1.60){
                alturaAcima160++;
            }
            if(peso < 80){
                pesoAbaixo80++;
            }
        }
        System.out.println("Qtd de pessoas com idade acima de 50:" +idadeAcima50);
        System.out.println("Qtd de pessoas com altura acima de 1.60:" +alturaAcima160);
        System.out.println("Qtd de pessoas com peso abaixo de 80kg:" +pesoAbaixo80);
    }
}
