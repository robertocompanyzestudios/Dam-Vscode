import java.util.Scanner;

/*Roberto Company Zomeño
/*• Realizar un programa que utilice un estructura array de enteros de 10 posiciones
• Leer 10 enteros por teclado e introducirlos en el array uno a uno
• Recorrer el array y mostrar los enteros pares y sus posiciones por un lado y los enteros impares
y sus posiciones por otro lado
*/
public class ejer6{
	public static void main(String[] args){
		Scanner teclado = new Scanner(System.in);

		int[] myArray = new int[10];

		for(int i = 0; i<10; i++){
			System.out.printf("Introduzca el %dº numero de la lista: ", i+1);
			myArray[i] = teclado.nextInt();

			System.out.println("-----------------------------------------");
		} 

		int num;
		System.out.println("Numeros pares");
		for(int i = 0;i < 10; i++){
			num = myArray[i];

			if((num % 2) == 0){
				System.out.println(num + " ------ " + "Posicion: " + i);
			}
		}

		System.out.println("Numeros impares");
		for(int i = 0; i < 10; i++){
			num = myArray[i];

			if((num % 2) != 0){
				System.out.println(num + " ------ " + "Posicion: " + i);
			}
		}



		

	}
}