import java.util.Scanner;
/*Roberto Company Zomeño
Lee el radio de un circulo y devuelve su longitud, su area y el volumen de una esfera con ese radio
*/
public class Ejercicio4{
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        double radio;

        System.out.println("Introduzca la longitud del radio(cm): ");
        radio = teclado.nextDouble();

        System.out.println("Longitud = " + (2 * radio * Math.PI + "(cm)"));
        System.out.println("Area = " + (radio * radio * Math.PI + "(cm2)"));
        System.out.println("Volumen esfera = " + (4 / 3 * Math.PI * radio * radio * radio + "(cm3)"));

    }
}