import java.time.LocalTime;
import java.util.Scanner;

public class Função1 {

    public static void saudacao(String nome) {

        int hora = LocalTime.now().getHour();

        if (hora < 12) {
            System.out.println("Bom dia, " + nome);
        } else if (hora < 18) {
            System.out.println("Boa tarde, " + nome);
        } else {
            System.out.println("Boa noite, " + nome);
        }
    }

    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Digite seu nome: ");
            String nome = sc.nextLine();
            
            saudacao(nome);
        }
    }
}