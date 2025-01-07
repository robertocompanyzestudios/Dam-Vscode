import java.util.Scanner;

/*Roberto Company Zomeño
Calcula el area de un cuadrado con la longitud de sus lados
*/
public class Ejercicio2{
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double longitud;
        double area;

        System.out.println("Bienvenido a la calculadora de areas de cuadrados");
        System.out.print("Introduzca la longitud de sus lados(cm): ");
        longitud = teclado.nextDouble();

        area = longitud * longitud;
        System.out.println("Area = "+ area + "cm");
    }
}