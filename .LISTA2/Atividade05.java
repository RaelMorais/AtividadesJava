import java.util.Scanner;

public class Atividade05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int QtdAtualEstoque = 45;
        int QtdMinima = 2;
        int QtdMaxima = 99;

        int qtdMeida = (QtdMaxima + QtdMinima) /2;

        if(qtdMeida >= QtdAtualEstoque){
            System.out.println("Não comprar pois a quantidade média é " +qtdMeida);
        } else if (qtdMeida < QtdAtualEstoque) {
            System.out.println("Comprar\nEstoque atual: " + qtdMeida);
        }
    }
}
