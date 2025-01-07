import java.util.Scanner;
/*Roberto Company Zomeño
Pregunta su nombre y da los buenos dias
*/

public class Ejercicio1{
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String nombre;

        System.out.print("Introduzca su nombre y apellidos: ");
        nombre = teclado.nextLine();

        System.out.println("Buenos dias "+nombre);
    }
}