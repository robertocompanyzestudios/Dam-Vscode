/*
Escribe un programa que pida 2 números enteros y muestre un menú de opciones para realizar operaciones.
Cada una de las opciones hará uso de un método creado específicamente para ello. Estas son las opciones que debe mostrar:

1. Sumar

2. Restar

3. Multiplicar

4. Dividir

5. Salir

*/


import java.util.Scanner;

public class Ejer2{
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		int num1;
		int num2;
		int seleccion;

		System.out.println("Introduzca los 2 operandos");	
		System.out.print("x = ");
		num1 = teclado.nextInt();

		System.out.print("y = ");
		num2 = teclado.nextInt();

		System.out.println("1. Sumar \n2. Restar \n3. Multiplicar \n4. Dividir \n5. Salir");
		
		System.out.println("Que operacion desea hacer con ambos numeros:");
		seleccion = teclado.nextInt();


		switch (seleccion){
		case 1:
			System.out.printf("%d + %d = %d \n", num1, num2, sumar(num1, num2));
			
			break;
		case 2:
			System.out.printf("%d - %d = %d \n", num1, num2, restar(num1, num2));
			break;
		case 3:
			System.out.printf("%d x %d = %d \n", num1, num2, multiplicar(num1, num2));
			break;
		case 4:
			System.out.printf("%d / %d = %d \n", num1, num2, dividir(num1, num2));
			break;
		case 5:
			System.out.println("Cerrando el programa");
			break;
		default:
			System.out.println("Numero incorrecto");
		}
	}

	public static int sumar(int x, int y){
		int suma = x + y;
		return suma;
	}

	public static int restar(int x, int y){
		int resta = x - y;
		return resta;
	}

	public static int multiplicar(int x, int y){
		int multiplicacion = x * y;
		return multiplicacion;
	}

	public static int dividir(int x, int y){
		int division= x / y;
		return division;
	}

}