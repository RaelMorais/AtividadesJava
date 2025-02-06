import java.util.Scanner;

public class L3Atividade04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o número: ");
        int num = scanner.nextInt();
        System.out.println("Digite o incremento: ");
        int incre = scanner.nextInt();
        for (int i = 0; i <= num; i+=incre){
            System.out.println(i);
        }
    }
}
