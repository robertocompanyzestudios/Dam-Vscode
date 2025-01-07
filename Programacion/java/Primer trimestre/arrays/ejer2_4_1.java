import java.util.Scanner;

/*Roberto Company Zomeño
/*Introduce 10 enteros a un array y saca por pantalla todos sus datos
*/
public class ejer2_4_1{
	public static void main(String[] args){
		Scanner teclado = new Scanner(System.in);


		int[] myArray= new int[10];

		for(int i = 0; i<10; i++){
			System.out.printf("Introduzca el %dº numero de la lista: ", i+1);
			myArray[i] = teclado.nextInt();

			System.out.println("-----------------------------------------");
		} 

		int max = myArray[0];
		int min = myArray[0];

		for(int i = 0; i<10; i++){
			int num = myArray[i];

			if(num > max){
				max = num;
			} else if (num < min) {
				min = num;
			}
		}

		System.out.printf("max = %d | min = %d", max, min);

	}
}