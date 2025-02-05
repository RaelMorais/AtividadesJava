import java.util.Scanner;

public class Atividade03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o filme que deseja avaliar: ");
        String input = scanner.nextLine();

        System.out.println("Quantas pessoas irá avaliar? ");
        int pessoas = scanner.nextInt();

        int qtdBom = 0;
        int qtdRuim = 0;
        int qtdOtimo = 0;
        int qtdTotal = 0;
        int nota1 = 0;
        int nota2 = 0;
        int nota3 = 0;

        for (int i = 0; i < pessoas; i++){
            System.out.println("Avalie pessoa" + i + "\n"+
                    "1- Ótimo\n" +
                    "2 - Bom\n" +
                    "3 - Ruim\n" +
                    "4 - Sair");
            int escolha = scanner.nextInt();
            if(escolha == 1){
                qtdOtimo++;
                nota1+=10;
                qtdTotal++;
            }
            if(escolha == 2){
                qtdBom++;
                nota2+=7;
                qtdTotal++;
            }
            if (escolha == 3){
                qtdRuim++;
                nota1+=4;
                qtdTotal++;
            }
            if(escolha == 4){
                System.exit(0);
            }
        }
        double soma = (nota1 + nota2 + nota3) / qtdTotal;
        double QtdOtimo =(qtdOtimo * 100) /qtdTotal;
        double QtdBom =  (qtdBom * 100) / qtdTotal;
        double QtdRuim = (qtdRuim * 100) / qtdTotal;
        int somaNotas = qtdOtimo + qtdBom + qtdRuim;

        System.out.println("Quantidade de avaliações: " +qtdTotal);
        System.out.println("Avaliações ótimas: " + qtdOtimo + " Porcentagem: " + QtdOtimo + "%");
        System.out.println("Avaliações boas: " + qtdBom + " Porcentagem: " + QtdBom + "%");
        System.out.println("Avaliações ruins: " + qtdRuim + " Porcentagem: " + QtdRuim + "%");
        System.out.println("Média de avaliação: " +soma);
    }
}
