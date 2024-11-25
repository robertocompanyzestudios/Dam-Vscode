import java.util.Scanner;

public class Nombre1{

    public static void main(String[] args) {
        String nombre1;
        int edad1;
        String nombre2;
        int edad2;

        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduzca el nombre de la persona 1: ");
        nombre1 = teclado.nextLine();
        System.out.println("Introduzca la edad de la persona 1: ");
        edad1 = teclado.nextInt();

        System.out.println("Introduzca el nombre de la persona 2: ");
        nombre2 = teclado.nextLine();
        System.out.println("Introduzca la edad de la persona 2: ");
        edad2 = teclado.nextInt();

        System.out.println("Los datos introducidos son: ");
        System.out.println("Nombre de la primera persona: " + nombre1);
        System.out.println("Edad de la primera persona; " + edad1);

        System.out.println("Nombre de la segunda persona: " + nombre2);
        System.out.println("Edad de la segunda persona; " + edad2);
    }
}
