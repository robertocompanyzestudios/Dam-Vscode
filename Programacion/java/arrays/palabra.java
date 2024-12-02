import java.util.Scanner;

/*Roberto Company Zomeño
/*Separa cada letra de una palabra y las introduce en un array
*/
public class palabra{
	public static void main(String[] args){
		Scanner teclado = new Scanner(System.in);

		System.out.println("Introduzca una palabra: ");
		String word = teclado.nextLine();

		//Analiza la longitud de la palabra
		int longitud = word.length();

		//Inicializa el array con la medida justa y añade 
		char[] myArray = new char[longitud];
		myArray = word.toCharArray();
		System.out.println("Clase: " + myArray.length());

		for(int i = 0; i<longitud; i++){
			System.out.println(myArray[i]);
		}	
		System.out.println("La palabra "+ word +" tiene " + longitud + " letras");
	}
}