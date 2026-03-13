import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Digite o primeiro número: ");
            double n1 = sc.nextDouble();
            
            System.out.print("Digite o segundo número: ");
            double n2 = sc.nextDouble();
            
            System.out.println("Escolha a operação:");
            System.out.println("1 - Soma");
            System.out.println("2 - Subtração");
            System.out.println("3 - Divisão");
            System.out.println("4 - Multiplicação");
            
            int op = sc.nextInt();
            
            switch (op) {
                case 1 -> System.out.println("Resultado: " + (n1 + n2));
                case 2 -> System.out.println("Resultado: " + (n1 - n2));
                case 3 -> System.out.println("Resultado: " + (n1 / n2));
                case 4 -> System.out.println("Resultado: " + (n1 * n2));
                default -> System.out.println("Operação inválida");
            }
        }
    }
}