import java.util.Scanner;
import java.lang.Math;
public class ejer5{
	public static void main(String[] args){
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Conversor de binario a entero, introduzca el numero a convertir: ");
		String cadena = teclado.nextLine();

		int longitud = cadena.length();
		System.out.println("Longitud= " + longitud);

		int num = Integer.parseInt(cadena);
		
		int total = 0;
		for(int i = 0; i < longitud; i++){
			int digito = num % 10;
			num = num / 10;

			System.out.println("Digito= " + digito);
			Double potencia = Math.pow(2,i);
			int potenciaEntera = (int) Math.round(potencia); 
			if(digito == 1){
				total = total + potenciaEntera;
			} else{
				continue;
			}
		}
		System.out.println("Numero decimal=" + total);



	}
}