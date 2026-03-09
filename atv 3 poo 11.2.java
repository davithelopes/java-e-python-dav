import java.time.LocalTime;
public class atv3 {
    public static void main(String[] args) {

        int hora = LocalTime.now().getHour();

        if (hora < 12) {
            System.out.println("bom dia");
        } else if (hora < 18) {
            System.out.println("boa tarde");
        } else if (hora < 22) {
            System.out.println("boa noite");
        } else {
            System.out.println("vai dormir fela duma gaita");
        }

    }
}
