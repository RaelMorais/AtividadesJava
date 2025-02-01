import java.util.Scanner;

public class Atividade01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Entre com a sua idade: ");
        int idade = scanner.nextInt();

        if(idade >= 30){
            System.out.println("Adulto");
        } else if (idade >= 18 && idade <= 30) {
            System.out.println("Adulto-Jovem");
        } else if (idade >= 15 && idade <= 17) {
            System.out.println("Adolescente");
        }else{
            System.out.println("Criança");
        }
    }
}
