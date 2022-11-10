
import java.util.Scanner;
public class App {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        String Nombre, Apellido;

        System.out.println("Ingresa tu nombre");

        Nombre = teclado.nextLine();
        System.out.println("Ingresa tu apellido");
        Apellido = teclado.nextLine();

System.out.println("su nombre es " + Nombre + " " + Apellido );

    }
}
