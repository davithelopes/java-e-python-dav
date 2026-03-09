import java.util.Scanner;
public class atv5 {
    public static void main(String[] args) {

       try (Scanner sc = new Scanner(System.in)) {

        String nome;
        int ano;

        System.out.print("Digite seu nome: ");
        nome = sc.nextLine();

        System.out.print("Digite seu ano de nascimento: ");
        ano = sc.nextInt();

        int idade = 2026 - ano;

        if (idade >= 18) {
            System.out.println("salve, " + nome);
            System.out.println("cê tá liberado.");
        } else {
            System.out.println("opa, " + nome);
            System.out.println("pode ir vazando, cê não tá liberado.");
        }

        }
    }
}
