
import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        String Nombre, Apellido, Madre, Padre;
    

        System.out.println("Ingresa tu nombre");

        Nombre = teclado.nextLine();
        System.out.println("Ingresa tu apellido");
        Apellido = teclado.nextLine();
        System.out.println("Ingresa el nombre de tu madre");
        Madre = teclado.nextLine();
        System.out.println("Ingresa el nombre de tu padre ");
        Padre = teclado.nextLine();

        System.out.println(
                "Mi nombre es " + Nombre + " " + Apellido + " soy hijo de " + Madre + " y " + Padre);

    }
}
