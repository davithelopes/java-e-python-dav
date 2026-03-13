import java.util.Scanner;
public class DiaSemana {

    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Digite um número de 1 a 7: ");
            int dia = sc.nextInt();
            
            switch (dia) {
                case 1 -> System.out.println("Domingo");
                case 2 -> System.out.println("Segunda");
                case 3 -> System.out.println("Terça");
                case 4 -> System.out.println("Quarta");
                case 5 -> System.out.println("Quinta");
                case 6 -> System.out.println("Sexta");
                case 7 -> System.out.println("Sábado");
                default -> System.out.println("Número inválido");
            }
        }
    }
}