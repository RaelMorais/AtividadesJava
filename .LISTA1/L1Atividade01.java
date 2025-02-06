import java.util.Scanner;
public class L1Atividade01 {
    public static void main(String[] args) {
        int diaAtual = 31;
        int mesAtual = 01;
        int anoAtual = 2025;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Bem vindo ao SmartRecruters.");

        System.out.print("Digite seu nome: ");
        String nomeUser = scanner.nextLine();

        System.out.print("Digite seu sobrenome: ");
        String sobreNome = scanner.nextLine();

        System.out.print("Dia de nascimento: ");
        int diaNasc = scanner.nextInt();

        System.out.print("Mês de nascimento: ");
        int mesNasc = scanner.nextInt();

        System.out.print("Ano de nascimento: ");
        int anoNasc = scanner.nextInt();

        int idade = anoAtual - anoNasc;

        if(diaNasc >= diaAtual && mesNasc >= mesAtual && anoNasc >= anoAtual){
            idade--;
        }
        scanner.nextLine();

        System.out.println("Grau de escolaridade:");
        System.out.println("> Médio");
        System.out.println("> Técnico");
        System.out.println("> Superior");
        String grauEsc = scanner.nextLine();

        System.out.print("Cargo pretendido: ");
        String cargo = scanner.nextLine();

        System.out.print("Categoria da CNH: A, B, C, D ou Não Possui:");
        String Cnh = scanner.nextLine();

        System.out.println("Olá " + nomeUser + " " + sobreNome);
        System.out.println("Data de nascimento: " + diaNasc + "/" + mesNasc + "/" + anoNasc);
        System.out.println("Voce tem" + idade);
        System.out.println("Grau de escolaridade: " + grauEsc);
        System.out.println("Cargo pretendido: " + cargo);
        System.out.println("Possui CNH: " + Cnh);
        System.out.println("++++++++++++++Cadastro concluído🆗++++++++++++++");

        scanner.close();

        //Atividade 2

    }
}
