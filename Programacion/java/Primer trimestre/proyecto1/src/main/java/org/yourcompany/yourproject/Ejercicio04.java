  	package org.yourcompany.yourproject;

	// Multiplo1.java
	// Fecha: 14/10/2013
	// Autor/a:.......
	// Escribe en pantalla los múltiplos de 2 por debajo de un TOPE, 16.

	import java.util.Scanner;

	public class Ejercicio04 	{
		public static void main(String argumentos[]) {

			// Declaración de variables
			//Scanner teclado = new Scanner(System.in);

			mostrarMultiplos2(pedirTope());

			//teclado.close();
		}

        public static int pedirTope(){
            Scanner teclado = new Scanner(System.in);

            System.out.println("(Introduzca el tope: )");
            int TOPE = teclado.nextInt();

            teclado.close();
            return TOPE;
        }

		public static void mostrarMultiplos2(int tope){
			int mult  ;							// Almacena el múltiplo calculado
			int cont  ;							// Contador utilizado en el cálculo

			// Inicializa las variables
			mult = 0 ;
			cont = 0 ;

			System.out.println("\t Múltiplos de 2\n");
			while (mult < tope)					// Bucle de cálculo y visualización
			{
				mult = cont * 2;
				System.out.println("\t  " +    '#' + (cont+1) + '\t' + mult);
				++cont;
			}
		}


	}