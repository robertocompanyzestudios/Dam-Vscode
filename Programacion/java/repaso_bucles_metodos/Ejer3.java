/*
Realiza un programa que lea un número positivo N y calcule y visualice su factorial N!
Siendo el factorial:
0! = 1
1! = 1
2! = 2 * 1
3! = 3 * 2* 1
N! = N * (N-1) * (N-2)........* 3*2*1
*/

import java.util.Scanner;

public class Ejer3{
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		int num;

		System.out.println("Mostrar el factorial del numero: ");
		num = teclado.nextInt();

		System.out.println("factorial = " + factorial(num));
	}

	public static int factorial(int x){

		if(x == 0 || x == 1){
			return 1;
		} else {
			return x * factorial(x - 1);
		}
	}
}