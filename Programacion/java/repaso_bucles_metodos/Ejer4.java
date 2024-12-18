	/*
Realiza un programa donde el usuario "piensa" un número del 1 al 100 y el ordenador intenta
adivinarlo. Es decir, el ordenador irá proponiendo números una y otra vez hasta adivinarlo (para cada número que proponga el ordenador, el usuario deberá indicarle al ordenador si es mayor, menor o igual al número que ha pensado).
*/

import java.util.Scanner;

public class Ejer4{
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		int mayormenor;s
		int acertado;
		int min = 0;
		int max = 100;

		//separa en 2 mitades el rango
		int eleccion = 0;

		while (true){
			eleccion = min + (max - min) / 2;

			System.out.println("Mi eleccion es " + eleccion);

			System.out.println("¿He acertado el numero?(1.Si   2. No)");
			acertado = teclado.nextInt();
			if(acertado == 1){
				break;
			} else {
				System.out.println("¿Tu numero es mayor o menor que " + eleccion +  "?(1.Mayor   2. Menor)");
				mayormenor = teclado.nextInt();
				if( mayormenor == 1 && eleccion == 99){
					eleccion = 100;
					break;
					
				} else if (mayormenor == 1 ){
					min = eleccion;

				} else if( mayormenor == 2 && eleccion == 1){
					eleccion = 0;
					break;

				} else if (mayormenor == 2){
					max = eleccion;
				}
			}

		}

		System.out.println("Final del programa, tu numero era el " + eleccion);

		teclado.close();

	}
}