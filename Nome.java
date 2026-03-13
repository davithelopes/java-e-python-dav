import java.util.Scanner;

public class Nome {
    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("igite seu nome: ");
            String nome = sc.nextLine();
            
            System.out.println("seu nome é: " + nome);
        }
    }
}