import java.util.Scanner;

public class L3Atividade05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int negativo = 0;
        int positivo = 0;
        int total = 0;
        System.out.println("Qtd de pessoas: ");
        int pessoas = scanner.nextInt();
        for (int i = 0; i < pessoas; i++) {
            System.out.println("Informe o saldo da pessoa" +i);
            double saldo = scanner.nextDouble();
           saldo += saldo;
            if(saldo > 0){
                positivo++;
                total++;
            }
            if(saldo <= 0){
                negativo++;
                total++;
            }
        }
        System.out.println("Quantidade de pessoas cadastradas: " +total);
        System.out.println("Quantidade de pessoas negativadas: " +negativo);
        System.out.println("Quantidade de pessoas negativadas: " +positivo);
        if(positivo >= total){
            System.out.println("Nenhum risco!");
        } else if (positivo == negativo) {
            System.out.println("Não há nada a temer!");
        }else{
            System.out.println("Risco ao banco!");
        }
    }
}
