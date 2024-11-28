import java.util.Scanner;

public class ejer6{
	public static void main(String[] args){
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Conversor de binario a entero, introduzca el numero a convertir: ");
		int num = teclado.nextInt();

		String resultado = "";
		while (num > 0){
			int digito = num % 10;
			num = num / 10;
			digito = (digito + 7) % 10;
			resultado = digito + resultado;
			System.out.println("Resultado -" + resultado);
		}

		num = Integer.parseInt(resultado);
		System.out.println(num);

		int dig4 = num % 10;
		num = num/10;
		int dig3 = num % 10 ;
		num = num/10;
		int dig2 = num % 10 ;
		num = num/10;
		int dig1 = num % 10;

		int aux = 0;
		
		aux = dig2;
		dig2 = dig4;
		dig4 = aux; 
		aux = dig1;
		dig1 = dig3;
		dig3 = aux; 

		resultado = "";
		resultado = resultado + dig1 + dig2 + dig3 + dig4;
		System.out.println("Resultado = " + resultado);
	}
}