import java.util.Random;
import java.util.Scanner;

public class L2Atividade06 {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int numeroSorte = random.nextInt(100) + 1;
        int tentativas = 0;
        boolean acertou = false;
        int palpite = 0;

        while (tentativas < 3 && !acertou) {
            tentativas++;
            System.out.print("Tentativa " + tentativas + " de 3. Tente adivinhar o número da sorte (entre 1 e 100): ");
            palpite = scanner.nextInt();

            if (palpite == numeroSorte) {
                System.out.println("Você acertou!");
                acertou = true;
            } else {
                if (tentativas < 3) {
                    System.out.println("Você errou! Tente novamente.");
                } else {
                    System.out.println("Você errou! O número da sorte era: " + numeroSorte);
                }
            }
        }

        scanner.close();
    }
}
