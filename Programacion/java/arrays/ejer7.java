import java.util.Scanner;

//Roberto Company Zomeño
// Comprueba si un numero se encuentra en un array y en que posicion

public class ejer7{
	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		int[] myArray = new int[10];

		for(int i = 0; i<10; i++){
			System.out.printf("Introduzca el %dº numero de la lista: ", i+1);
			myArray[i] = teclado.nextInt();

			System.out.println("-----------------------------------------");
		} 

		System.out.println("Introduzca el numero que desea buscar en la lista: ");
		Integer num = teclado.nextInt();

		Boolean found = false;
		int contador = 0;
		for(int i:myArray){
			if(i == num){
				System.out.printf("El numero %d se encuentra en posicion %d", i, contador);
				found = true;
				break;
			}
			contador = contador + 1;
		} 
		

		if(found == false){
			System.out.printf("El numero %d no se encuentra en el array", num);
		}


		teclado.close();
	}
}