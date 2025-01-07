import java.util.Scanner;

/*Roberto Company Zomeño
/*Introduce 10 decimales a un array y calcula la media y los que salen de la media
*/
public class altura{
	public static void main(String[] args){
		Scanner teclado = new Scanner(System.in);


		Double[] myArray = new Double[5];

		for(int i = 0; i<5; i++){
			System.out.printf("Introduzca el %dº numero de la lista: ", i+1);
			myArray[i] = teclado.nextDouble();

			System.out.println("-----------------------------------------");
		} 

		//Calcula el total de cada
		Double total = 0.0;
		for(int i = 0; i < 5; i++){
			total = total + myArray[i];
		}
		System.out.println("-----------------------------------------");

		Double media = total / 5;
		System.out.println("Media = " + media + "    |");
		System.out.println("-----------------------------------------");

		System.out.println("Mayores a la media:");
		for(int i = 0; i < 5; i++){
			if(myArray[i] > media){
				System.out.println(myArray[i]);
			}
		}
		System.out.println("-----------------------------------------");

		System.out.println("Menores a la media:");
		for(int i = 0; i < 5; i++){
			if(myArray[i] < media){
				System.out.println(myArray[i]);
			}
		}









	}
}