import java.util.Scanner;

public class Operacoes {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("digite o primeiro número: ");
        int n1 = sc.nextInt();

        System.out.print("digite o segundo número: ");
        int n2 = sc.nextInt();

        System.out.println("soma: " + (n1 + n2));
        System.out.println("subtração: " + (n1 - n2));
        System.out.println("multiplicação: " + (n1 * n2));
        System.out.println("divisão: " + (n1 / n2));

    }
}