import java.util.Scanner;

/*Roberto Company Zomeño
*Solicita un numero entero (n)
*Hace una piramide de n escalones
*Primera mitad (1, 22, 333)
*Segunda mitad (1, 12, 123)
*/

public class ejercicio3{
	public static void main(String[] args){
		Scanner teclado = new Scanner(System.in);

		System.out.println("Cuantos escalones desea que tenga su piramide: ");
		int escalones = teclado.nextInt();
		System.out.println("------------------------------------");


		// Primera mitad

		for (int i = 1; i < escalones + 1; i++){

			if (i == 1){
				System.out.println("*");
			}

			for (int j = 1; j < i+1; j++){
				System.out.print(i + " ");
			}
			System.out.print("*");
			System.out.println("");
		}


		// Segunda mitad

		for (int i = escalones; i > 0; i = i -1){

			for (int j = 1; j < i+1; j++){
				System.out.print(j + " ");
			}
			System.out.print("*");
			System.out.println("");

			if (i == 1){
				System.out.println("*");
			}
		}

		teclado.close();

	}
}