
import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        String nombreMascota, tipoMascota, nombre, apellido;
        int edadMascota;

        System.out.println("Ingresa tu nombre");
        nombre = teclado.nextLine();

        System.out.println("Ingresa tu apellido");
        apellido = teclado.nextLine();
        System.out.println("Ingresa el  nombre de tu mascota");
        nombreMascota = teclado.nextLine();

        System.out.println("Ingresa el tipo de mascota ");
        tipoMascota = teclado.nextLine();

        System.out.println("Ingresa la  edad de tu mascota");
        edadMascota = teclado.nextInt();

       

      
      

        System.out.println(
            nombreMascota + " es un  " + tipoMascota + "  el cual, tiene " + edadMascota + " años de edad y " + nombre + "  " + apellido + " es actualmente su dueño(a).");

    }
}
