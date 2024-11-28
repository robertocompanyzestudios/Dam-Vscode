import java.util.Scanner;

/*Roberto Company Zomeño
Devuelve una escalera de n escalones*/


public class ejer3{
	public static void main(String[] args){

		Scanner teclado = new Scanner(System.in);

		System.out.println("Cuantos escalones desea que tenga su escalera: ");
		int max = teclado.nextInt();

		for(int i = 1; i < max + 1; i++){
			for(int j = 0; j < i; j++){
				System.out.print(i);
			}
			System.out.println();
		}

		teclado.close();

	}
}