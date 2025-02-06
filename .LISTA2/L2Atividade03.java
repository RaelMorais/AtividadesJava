import java.util.Scanner;

public class L2Atividade03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual a quantidades de gols do time 1: ");
        int timeA = scanner.nextInt();

        System.out.println("Qual a quantidades de gols do time 2: ");
        int timeB = scanner.nextInt();

        if(timeA > timeB){
            System.out.println("Time A venceu de " + timeA + " a " + timeB);
        } else if (timeA == timeB) {
            System.out.println("Empate de " + timeA + " a " + timeB);
        }else{
            System.out.println("Time B venceu de " + timeB + " a " + timeA);
        }
    }
}
