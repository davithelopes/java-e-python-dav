import java.util.Scanner;

public class BomDia {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("digite seu nome: ");
        String nome = sc.nextLine();

        System.out.println("bom dia" + nome);

    }
}