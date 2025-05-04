import java.util.ArrayList;
import java.util.Scanner;

public class ArrayDesafio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Criar scanner para ler entrada
        ArrayList<String> nomes = new ArrayList<>(); // Lista para armazenar os nomes
        System.out.println("Digite os nomes (digite 'fim' para encerrar):");
        while (true) {
            String nome = scanner.nextLine().trim(); // Ler nome e remover espaços
            if (nome.equalsIgnoreCase("fim")) break; // Sair do loop ao digitar "fim"
            nomes.add(nome.toLowerCase()); // Converter para minúsculas e adicionar à lista
        }

        if (nomes.isEmpty()) {
            System.out.println("Nenhum nome foi digitado.");
            scanner.close();
            return;
        }

        //2 e 3. Contar quantas vezes cada nome aparece e tratar maiúsculas/minúsculas
        ArrayList<String> nomesUnicos = new ArrayList<>(); 
        ArrayList<Integer> contagem = new ArrayList<>(); 

        for (String nome : nomes) {
            boolean encontrado = false;
            for (int i = 0; i < nomesUnicos.size(); i++) {
                //Comparar nomes ignorando maiúsculas/minúsculas
                if (nomesUnicos.get(i).equals(nome)) {
                    contagem.set(i, contagem.get(i) + 1); //Incrementar contagem
                    encontrado = true;
                    break;
                }
            }
            if (!encontrado) {
                nomesUnicos.add(nome); //Adicionar novo nome único
                contagem.add(1);
            }
        }
        int maxOcorrencias = 0;
        for (int count : contagem) {
            maxOcorrencias = Math.max(maxOcorrencias, count); //Encontrar maior contagem
        }

        //Exibir os nomes que mais apareceram e quantas vezes
        System.out.println("Nomes que mais apareceram (" + maxOcorrencias + " vezes):");
        for (int i = 0; i < contagem.size(); i++) {
            if (contagem.get(i) == maxOcorrencias) {
                System.out.println(nomesUnicos.get(i)); 
            }
        }
        scanner.close(); 
    }
}
