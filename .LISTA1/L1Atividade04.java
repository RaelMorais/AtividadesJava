import java.util.Scanner;

public class L1Atividade04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insira o número: ");
        int num = scanner.nextInt();

        int numSoma = num + 1;
        int numSub = num -1;

        System.out.println("O número informado foi " + num + " e seu sucessor é " + numSoma + ", seu antecessor é " + numSub);
    }
}
