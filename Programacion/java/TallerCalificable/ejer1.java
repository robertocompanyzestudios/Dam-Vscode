import java.util.Scanner;

/*Roberto Company Zomeño
Lee 2 numeros y comprueba el mayor entre ambos*/

public class ejer1{
	public static void main(String[] args){
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduzca el primer numero a comparar: ");
		int num1 = teclado.nextInt();

		System.out.println("Introduzca el segundo numero a comparar: ");
		int num2 = teclado.nextInt();

		int mayor = Math.max(num1, num2);
		System.out.println("El numero mayor es: "+ mayor);

		teclado.close();
	}
}