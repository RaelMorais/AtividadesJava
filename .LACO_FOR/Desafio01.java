import java.util.Scanner;

public class Desafio01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            try {
                System.out.println("Escolha a operação (+, -, *, /) ou 'sair' para encerrar:");
                String operacao = scanner.nextLine().trim();

                if (operacao.equalsIgnoreCase("sair")) {
                    break;
                }

                if (!operacao.matches("[+\\-*/]")) {
                    System.out.println("Operação inválida!");
                    continue;
                }

                System.out.println("Digite o primeiro número:");
                double num1 = Double.parseDouble(scanner.nextLine().trim());

                System.out.println("Digite o segundo número:");
                double num2 = Double.parseDouble(scanner.nextLine().trim());

                double resultado = 0;
                switch (operacao) {
                    case "+":
                        resultado = num1 + num2;
                        break;
                    case "-":
                        resultado = num1 - num2;
                        break;
                    case "*":
                        resultado = num1 * num2;
                        break;
                    case "/":
                        if (num2 == 0) {
                            throw new ArithmeticException("Divisão por zero!");
                        }
                        resultado = num1 / num2;
                        break;
                }

                System.out.println("Resultado: " + resultado);

            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida! Digite apenas números.");
            } catch (ArithmeticException e) {
                System.out.println(e.getMessage());
            } catch (Exception e) {
                System.out.println("Ocorreu um erro inesperado: " + e.getMessage());
            }

            System.out.println("Deseja continuar? (Digite 'sair' para encerrar ou pressione Enter para continuar)");
            scanner.nextLine().trim();
        }

        scanner.close();
    }
}
