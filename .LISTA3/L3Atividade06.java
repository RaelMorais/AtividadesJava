import java.util.Scanner;

public class Atividade06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o número: ");
        int Num = scanner.nextInt();
        System.out.println("Tabuada do: " + Num);

        for(int i = 0; i <= 10; i++){
            int tabuada = Num * i;
            System.out.println(Num + " x " + i + " = " + tabuada);
        }

        scanner.close();
    }
}
