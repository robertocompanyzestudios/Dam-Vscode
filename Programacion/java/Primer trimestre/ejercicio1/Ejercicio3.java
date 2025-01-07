import java.util.Scanner;

/*Roberto Company Zomeño
Lee 2 numeros y devuelve sus operaciones y resultados
*/
public class Ejercicio3{
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        double num1;
        double num2;

        System.out.println("Introduzca el primer numero: ");
        num1 = teclado.nextDouble();

        System.out.println("Introduzca el segundo numero: ");
        num2 = teclado.nextDouble();

        System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
        System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
        System.out.println(num1 + " x " + num2 + " = " + (num1 * num2));
        if(num2 == 0){
             System.out.println("No se puede dividir entre 0");
        }
        else{
        System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
        }
    }
}