/*
Realiza un programa que sume independientemente los pares y los impares de los números
comprendidos entre 100 y 200, y luego muestra por pantalla ambas sumas.

Utiliza un método mostrarSuma() que reciba por parámetros el valor inicial (100) y final (200), y también qué suma queremos realizar (par o impar). Invócalo desde el método main() las veces que consideres adecuadas para el ejercicio.

Mejora el ejercicio solicitando al usuario la introducción de los valores inicial y final, con las comprobaciones necesarias.

*/


import java.util.Scanner;

public class Ejer1{
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		int num1;
		int num2;

		System.out.println("Mostrar los numeros pares entre x e y");
		System.out.println("x = ");
		num1 = teclado.nextInt();

		System.out.println("y = ");
		num2 = teclado.nextInt();
		
		parimpar(num1, num2);
	}

	public static void parimpar(int x, int y){
			int impares = 0;
			int pares = 0;
			for(int i = x; i <= y; i++){
				if(i % 2 == 0){
					pares = pares + i;
				} else if(i % 2 != 0){
					impares = impares + i;
				}
			}

			System.out.printf("Numeros pares: %d \n", pares);
			System.out.printf("Numeros impares: %d \n", impares);
	}

}
