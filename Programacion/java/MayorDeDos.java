import java.util.Scanner;

public class MayorDeDos{

    public static void main(String[] args) {
        String num1;
        String num2;

        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduzca el primer numero a comparar: ");
        num1 = teclado.nextLine();
        System.out.println("Introduzca el segundo numero a comparar: ");
        num2 = teclado.nextLine();

        int mayor = Math.max((Integer.parseInt(num1)), (Integer.parseInt(num2)));

        System.out.println("El mayor es: " + mayor);

    }
}