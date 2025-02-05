import java.util.Scanner;

public class Atividade05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int pessoa = 0;
        int negativo = 0;
        int positivo = 0;
        System.out.println("Qtd de pessoas: ");
        int pessoas = scanner.nextInt();
        for (int i = 0; i < pessoas; i++) {
            System.out.println("Informe o saldo da pessoa" +i);
            double saldo = scanner.nextDouble();
            pessoa+=saldo;
            if(saldo > 100){
                negativo++;
            }else{
                positivo++;
            }
        }
        System.out.println(pessoa);
    }
}
