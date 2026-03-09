import java.util.Scanner;
public class atv6 {
    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {

        int n1, n2;

        System.out.print("digite um numero: ");
        n1 = sc.nextInt();

        System.out.print("digite o segundo numero: ");
        n2 = sc.nextInt();

        if (n2 > n1) {
            System.out.println("soma: " + (n1 + n2));
        } else if (n1 > n2) {
            System.out.println("subtração: " + (n1 - n2));
        } else {
            System.out.println("os numeros são iguais.");
        }
      }
    }
}
