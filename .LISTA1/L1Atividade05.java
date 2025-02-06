import java.util.Scanner;

public class L1Atividade05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Entre com as horas: ");
        int hora = scanner.nextInt();

        System.out.println("Entre com os minutos: ");
        int minutos = scanner.nextInt();

        System.out.println("Entre com os segundos: ");
        int segundos = scanner.nextInt();

        int horaEmS = hora * 3600;

        int minEmS = minutos * 60;

        int somaHeM = horaEmS + minEmS;

        int segundosTotais = somaHeM + segundos;

        System.out.println(hora + " Horas, " + minutos + " Minutos, " + segundos + " São: " + segundosTotais + " Segundos");
    }
}
