import java.util.Scanner;

public class NumeroExtenso {

    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Digite um número de 1 a 1000: ");
            int num = sc.nextInt();
            
            String[] unidades = {
                "", "um", "dois", "três", "quatro", "cinco",
                "seis", "sete", "oito", "nove"
            };
            
            String[] dezADezenove = {
                "dez", "onze", "doze", "treze", "quatorze",
                "quinze", "dezesseis", "dezessete", "dezoito", "dezenove"
            };
            
            String[] dezenas = {
                "", "", "vinte", "trinta", "quarenta",
                "cinquenta", "sessenta", "setenta", "oitenta", "noventa"
            };
            
            String[] centenas = {
                "", "cento", "duzentos", "trezentos", "quatrocentos",
                "quinhentos", "seiscentos", "setecentos", "oitocentos", "novecentos"
            };
            
            switch (num) {
                case 1000 -> System.out.println("mil");
                case 100 -> System.out.println("cem");
                default -> {
                    int c = num / 100;
                    int d = (num % 100) / 10;
                    int u = num % 10;
                    String resultado = "";
                    if (c > 0) {
                        resultado += centenas[c];
                    }   if (d == 1) {
                        if (!resultado.equals("")) {
                            resultado += " e ";
                        }
                        resultado += dezADezenove[u];
                    }
                    else {
                        if (d > 1) {
                            if (!resultado.equals("")) {
                                resultado += " e ";
                            }
                            resultado += dezenas[d];
                        }
                        
                        if (u > 0) {
                            if (!resultado.equals("")) {
                                resultado += " e ";
                            }
                            resultado += unidades[u];
                        }
                    }   System.out.println(resultado);
                }
            }
        }
    }
}