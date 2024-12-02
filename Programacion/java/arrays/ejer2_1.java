import java.util.Scanner;

//Roberto Company Zomeño
//Introduce 10 enteros a un array y saca por pantalla todos sus datos

public class ejer2_1{
	public static void main(String[] args){

		Scanner teclado = new Scanner(System.in);

		int[] myArray = new int[10];

		for(int i = 0; i<10; i++){
			System.out.printf("Introduzca el %dº numero de la lista: ", i+1);
			myArray[i] = teclado.nextInt();

			System.out.println("-----------------------------------------");
		} 

		for(int i = 0; i<10; i++){
			System.out.printf("posicion %d = %d", i, myArray[i]);
			System.out.println();
		}

		teclado.close();
	}
}