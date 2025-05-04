import java.util.Scanner;

public class L3Atividade07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Qunantas pessoas irá participar? ");
        int NumP = scanner.nextInt();
        scanner.nextLine();
        String nomemaiorAltura = "";
        String nomemaiorPeso = "";
        String nomeMenorAltura = "";
        String nomeMenorPeso = "";

        double menorAltura = Double.MAX_VALUE;
        double menorPeso = Double.MAX_VALUE;
        double maiorAltura = 0;
        double maiorPeso =0;

        for (int i = 0; i < NumP; i++) {
            System.out.println("Digite o nome da" + (i + 1) +"° pessoa");
            String nome = scanner.nextLine();

            System.out.println("Digite o peso da" + (i + 1) +"° pessoa");
            double peso = scanner.nextDouble();
            scanner.nextLine();

            System.out.println("Digite a altura da" + (i + 1) +"° pessoa");
            double altura = scanner.nextDouble();
            scanner.nextLine();

            if (altura > maiorAltura) {
                maiorAltura = altura;
                nomemaiorAltura = nome;
            }

            if (peso > maiorPeso) {
                maiorPeso = peso;
                nomemaiorPeso = nome;
            }
            if (altura < menorAltura) {
                menorAltura = altura;
                nomeMenorAltura = nome;
            }

            // Verificando o menor peso
            if (peso < menorPeso) {
                menorPeso = peso;
                nomeMenorPeso = nome;
            }
        }
        System.out.println("Nome da pessoa com maior altura: " + nomemaiorAltura + " E sua altura de " + maiorAltura);
        System.out.println("Nome da pessoa com maior peso: " + nomemaiorPeso + " E seu peso de " + maiorPeso);
        System.out.println("Nome da pessoa com menor peso: " + nomeMenorPeso + " E seu peso de " + menorPeso);
        System.out.println("Nome da pessoa com menor altura: " + nomeMenorAltura + " E sua altura de " + menorAltura);
    }
}

