import java.util.Scanner;

//Roberto Company Zomeño
// Comprueba si un numero se encuentra en un array y en que posicion hasta que el usuario pulse 0

public class ejer9{
	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		int[] myArray = new int[10];

		for(int i = 0; i<10; i++){
			System.out.printf("Introduzca el %dº numero de la lista: ", i+1);
			myArray[i] = teclado.nextInt();

			System.out.println("-----------------------------------------");
		} 

		Integer num = 1;
		while (num != 0) {

			System.out.println("Introduzca el numero que desea buscar en la lista: ");
			num = teclado.nextInt();

			if (num == 0){
				break;
			}

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
				System.out.printf("El numero %d no se encuentra en el array\n", num);
			}
		}


		teclado.close();


	}
}