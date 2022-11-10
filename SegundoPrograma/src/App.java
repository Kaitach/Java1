
import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        String Nombre, Apellido;
        int Edad, Estatura;

        System.out.println("Ingresa tu nombre");

        Nombre = teclado.nextLine();
        System.out.println("Ingresa tu apellido");
        Apellido = teclado.nextLine();
        System.out.println("Ingresa tu Edad");
        Edad = teclado.nextInt();
        System.out.println("Ingresa tu Estatura");
        Estatura = teclado.nextInt();

        System.out.println(
                "su nombre es " + Nombre + " " + Apellido + " Tu edad es " + Edad + " años  y medis " + Estatura);

    }
}
