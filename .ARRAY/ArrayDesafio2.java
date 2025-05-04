import java.text.Normalizer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ArrayDesafio2 {
    /**
     * Remove acentos de uma string e a converte para minúsculas.
     * @param texto String a ser normalizada
     * @return String sem acentos e em minúsculas
     */
    private static String removerAcentos(String texto) {
        return Normalizer.normalize(texto, Normalizer.Form.NFD)
                .replaceAll("[^\\p{ASCII}]", "")
                .toLowerCase();
    }

    /**
     * Embaralha uma lista de strings mantendo a ordem aleatória.
     * @param lista Lista a ser embaralhada
     */
    private static void embaralharLista(ArrayList<String> lista) {
        Collections.shuffle(lista);
    }

    /**
     * Executa o jogo de digitação com limite de tempo.
     * @param tempoLimite Tempo em segundos para o jogo
     */
    public static void jogar(int tempoLimite) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> nomes = new ArrayList<>();
        ArrayList<String> nomesOriginais = new ArrayList<>();

        System.out.println("Digite os nomes (digite 'fim' para encerrar):");
        while (true) {
            String nome = scanner.nextLine().trim();
            if (nome.equalsIgnoreCase("fim")) break;
            nomesOriginais.add(nome);
            nomes.add(removerAcentos(nome));
        }

        if (nomes.isEmpty()) {
            System.out.println("Nenhum nome foi digitado.");
            scanner.close();
            return;
        }

        embaralharLista(nomes);
        embaralharLista(nomesOriginais);

        long tempoInicio = System.currentTimeMillis();
        long tempoFim = tempoInicio + (tempoLimite * 1000);
        int pontuacao = 0;
        int indice = 0;

        System.out.println("Digite o nome que aparece (" + tempoLimite + " segundos):");
        while (System.currentTimeMillis() < tempoFim && indice < nomes.size()) {
            System.out.println("Nome: " + nomesOriginais.get(indice));
            String tentativa = scanner.nextLine().trim();
            if (removerAcentos(tentativa).equals(nomes.get(indice))) {
                pontuacao++;
                System.out.println("Correto! Pontuação: " + pontuacao);
            } else {
                System.out.println("Errado! Pontuação: " + pontuacao);
            }
            indice++;
        }

        System.out.println("Fim do jogo! Pontuação final: " + pontuacao);
        scanner.close();
    }

    public static void main(String[] args) {
        jogar(30);
    }
}
