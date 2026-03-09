import java.util.Scanner;
public class atv4 {
    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {
            int a, b, c, temp;

            System.out.print("Digite o primeiro numero: ");
            a = sc.nextInt();

            System.out.print("Digite o segundo numero: ");
            b = sc.nextInt();

            System.out.print("Digite o terceiro numero: ");
            c = sc.nextInt();

            if (a > b) {
                temp = a;
                a = b;
                b = temp;
            }

            if (a > c) {
                temp = a;
                a = c;
                c = temp;
            }

            if (b > c) {
                temp = b;
                b = c;
                c = temp;
            }

            System.out.println("Ordem crescente:");
            System.out.println(a + " " + b + " " + c);
        }
    }
}
