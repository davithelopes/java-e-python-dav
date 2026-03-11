import java.util.Scanner;
public class atv2 {
    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {
            int a, b, c;
            int maior, menor;

            System.out.print("digite o primeiro numero: ");
            a = sc.nextInt();

            System.out.print("digite o segundo numero: ");
            b = sc.nextInt();

            System.out.print("digite o terceiro numero: ");
            c = sc.nextInt();

            maior = a;
            menor = a;

            if (b > maior) maior = b;
            if (c > maior) maior = c;

            if (b < menor) menor = b;
            if (c < menor) menor = c;

            System.out.println("maior: " + maior);
            System.out.println("menor: " + menor);
        }
    }
}