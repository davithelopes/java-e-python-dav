import java.util.Scanner;

public class RestoDivisao {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("digite o primeiro número: ");
        int n1 = sc.nextInt();

        System.out.print("digite o segundo número: ");
        int n2 = sc.nextInt();

        int resto = n1 % n2;

        System.out.println("o resto da divisão é: " + resto);

    }
}