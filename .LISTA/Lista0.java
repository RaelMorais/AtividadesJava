import java.util.Scanner;

public class Lista0{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("Escolha uma opção (1-6) ou 0 para sair:");
            System.out.println("1. Converter Fahrenheit para Celsius");
            System.out.println("2. Converter Celsius para Fahrenheit");
            System.out.println("3. Calcular IMC");
            System.out.println("4. Calcular quadrado e cubo de um valor");
            System.out.println("5. Calcular área de um triângulo");
            System.out.println("6. Resolver equação de segundo grau (Bhaskara)");
            opcao = Integer.parseInt(scanner.nextLine().trim());

            switch (opcao) {
                case 1:
                    System.out.println("Digite a temperatura em Fahrenheit:");
                    double fahrenheit = Double.parseDouble(scanner.nextLine().trim());
                    double celsius = (fahrenheit - 32) * 5 / 9;
                    System.out.println("Temperatura em Celsius: " + celsius);
                    break;

                case 2:
                    System.out.println("Digite a temperatura em Celsius:");
                    double celsius2 = Double.parseDouble(scanner.nextLine().trim());
                    double fahrenheit2 = (celsius2 * 9 / 5) + 32;
                    System.out.println("Temperatura em Fahrenheit: " + fahrenheit2);
                    break;

                case 3:
                    System.out.println("Digite o peso (kg):");
                    double peso = Double.parseDouble(scanner.nextLine().trim());
                    System.out.println("Digite a altura (m):");
                    double altura = Double.parseDouble(scanner.nextLine().trim());
                    double imc = peso / (altura * altura);
                    System.out.println("IMC: " + imc);
                    break;

                case 4:
                    System.out.println("Digite um valor:");
                    double valor = Double.parseDouble(scanner.nextLine().trim());
                    double quadrado = valor * valor;
                    double cubo = valor * valor * valor;
                    System.out.println("Quadrado: " + quadrado + ", Cubo: " + cubo);
                    break;

                case 5:
                    System.out.println("Digite a base do triângulo:");
                    double base = Double.parseDouble(scanner.nextLine().trim());
                    System.out.println("Digite a altura do triângulo:");
                    double alturaTriangulo = Double.parseDouble(scanner.nextLine().trim());
                    double area = (base * alturaTriangulo) / 2;
                    System.out.println("Área do triângulo: " + area);
                    break;

                case 6:
                    double a = 1, b = 12, c = -13; 
                    double delta = b * b - 4 * a * c;
                    System.out.println("Delta: " + delta);
                    if (delta >= 0) {
                        double x1 = (-b + Math.sqrt(delta)) / (2 * a);
                        double x2 = (-b - Math.sqrt(delta)) / (2 * a);
                        System.out.println("Raízes: x1 = " + x1 + ", x2 = " + x2);
                    } else {
                        System.out.println("Delta negativo, não há raízes reais.");
                    }
                    break;

                case 0:
                    System.out.println("Saindo...");
                    break;

                default:
                    System.out.println("Opção inválida!");
            }

            if (opcao != 0) {
                System.out.println("Pressione Enter para continuar ou digite 0 para sair...");
                scanner.nextLine().trim();
            }
        } while (opcao != 0);

        scanner.close();
    }
}