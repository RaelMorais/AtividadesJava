import java.util.Scanner;

public class Atividade04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double valorBase = 3000;

        double valorALmoco = valorBase + (valorBase * 100/100);
        double valorSemALmoco = valorBase + (valorBase * 85/100);

        double valorALmoco2 = valorBase + (valorBase * 60/100) + valorBase;
        double valorSemALmoco2 = valorBase + (valorBase * 45/100) + valorBase;

        System.out.println("Onde deseja passar suas ferias?\n" +
                "1 - Maceió\n" +
                "2 - Porto de galinhas\n" +
                "3 - Outro");

        String escolhaViagem = scanner.next();

        if(escolhaViagem.equals("1")){
            System.out.println("Almoço incluso? ");
            scanner.nextLine();
            String almoco = scanner.nextLine();

            if(almoco.equals("sim")){
                System.out.println("O valor com acréscimo de 85%\n" +
                        "Viagem: R$ " + valorALmoco);
            }else{
                System.out.println("Valor da passagem: R$ " + valorSemALmoco);
            }
        }
        if(escolhaViagem.equals("2")){
            System.out.println("Almoço incluso? ");
            scanner.nextLine();
            String almoco = scanner.nextLine();

            if(almoco.equals("sim")){
                System.out.println("O valor com acréscimo de 85%\n" +
                        "Viagem: R$" + valorALmoco2);
            }else{
                System.out.println("Valor da passagem: R$ " + valorSemALmoco2);
            }
        }
        if(escolhaViagem.equals("3")){
            System.out.println("Obrigado, vovlte sempre!");
        }
    }
}
