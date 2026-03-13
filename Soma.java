import java.util.Scanner;

public class Soma {

    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("digite o primeiro número: ");
            int n1 = sc.nextInt();

            System.out.print("digite o segundo número: ");
            int n2 = sc.nextInt();

            int soma = n1 + n2;

            System.out.println("a soma é: " + soma);
        }

    }
}