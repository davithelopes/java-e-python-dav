import java.time.LocalTime;
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

            
            int hora = LocalTime.now().getHour();
            String cumprimento;

            if (hora < 12) {
                cumprimento = "Bom dia";
            } else if (hora < 18) {
                cumprimento = "Boa tarde";
            } else {
                cumprimento = "Boa noite";
            }

            if (idade >= 18) {
                System.out.println(cumprimento + ", " + nome + "!");
                System.out.println("Você está liberado.");
            } else {
                System.out.println(cumprimento + ", " + nome + "!");
                System.out.println("Você não está liberado.");
            }

        }
    }
}