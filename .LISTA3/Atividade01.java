import java.util.Scanner;

public class Atividade01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Quantas números deseja adicionar?\n");
        int numeros = scanner.nextInt();
        int[] num = new int[numeros];

        System.out.println("Digite os " + numeros);
        for (int i = 0; i < numeros; i++){
            System.out.println("Numero " + (i + 1) + ":");
            num[i] = scanner.nextInt();
            scanner.nextLine();
        }

        while(true){
            System.out.println("Esclha uma opção:\n" +
                    "a. Numeros pares\n" +
                    "b. Numeros impares\n" +
                    "c. Numeros positivos\n" +
                    "d. Numeros negativos\n" +
                    "e. Sair");
            String escolha = scanner.nextLine();
            switch (escolha){
                case "a":
                    for (int i = 0; i < numeros; i++){
                        if(num[i] % 2 ==0){
                            System.out.println(num[i]);
                        }
                    }
                    break;
                case "b":
                    for (int i = 0; i < numeros; i++){
                        if(num[i] % 2 != 0){
                            System.out.println(num[i]);
                        }
                    }
                    break;
                case "c":
                    for (int i = 0; i < numeros; i++){
                        if(num[i] % 2 > 0){
                            System.out.println(num[i]);
                        }
                    }
                    break;
                case "d":
                    for (int i = 0; i < numeros; i++){
                        if(num[i] % 2 < 0){
                            System.out.println(num[i]);
                        }
                    }
                    break;
                case "e":
                    System.out.println("Saindo...");
                    System.exit(0);
                    break;

            }
        }
    }
}
