
import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        String Capital, Pais;
    

        System.out.println("Ingresa una capital");

        Capital = teclado.nextLine();
        System.out.println("Ingresa el país al que corresponde la capital ");
        Pais = teclado.nextLine();
    

        System.out.println(
                "La ciuidad  " + Capital + ", es la capital del país " + Pais );

    }
}
