import java.util.Scanner;

public class Desafio02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String[] nomes = new String[5];
        double[] precos = new double[5];
        int[] quantidades = new int[5];

        for (int i = 0; i < 5; i++) {
            System.out.println("Digite o nome do produto " + (i + 1) + ":");
            nomes[i] = scanner.nextLine().trim();
            
            System.out.println("Digite o preço do produto " + (i + 1) + ":");
            precos[i] = Double.parseDouble(scanner.nextLine().trim());
            
            System.out.println("Digite a quantidade do produto " + (i + 1) + ":");
            quantidades[i] = Integer.parseInt(scanner.nextLine().trim());
        }

        double totalEstoque = 0;
        System.out.println("\nInformações dos produtos:");
        for (int i = 0; i < 5; i++) {
            double valorProduto = precos[i] * quantidades[i];
            totalEstoque += valorProduto;
            System.out.println("Produto: " + nomes[i] + ", Preço: " + precos[i] + ", Quantidade: " + quantidades[i] + ", Valor: " + valorProduto);
        }
        System.out.println("Total do estoque: " + totalEstoque);
        
        scanner.close();
    }
}
