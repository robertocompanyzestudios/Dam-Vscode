import java.util.Scanner;

/*Roberto Company Zomeño
Dibuja un arbol de n tamaño y usa un metodo diferente para cada seccion (piramide, piramide, tronco)*/

public class arbol{
	public static void main(String[] args){
		Scanner teclado = new Scanner(System.in);

		System.out.println("Introduzca el tamaño del arbol deseado: ");
		Integer n = teclado.nextInt();

		//En el ejercicio pone 5 pero el tronco tiene literalmente el doble de anchura ok
		Integer tamaño = n * 2;

		if (tamaño < 3){
			System.out.println("El tamaño no puede ser menor que 3");
		} else if (tamaño > 15){
			System.out.println("El tamaño no puede ser mayor que 15");
		}

		//Primer triangulo
		for(int i = 1; i < (tamaño + 1); i=i+2){

			//Calcula los espacios que tendra la linea a cada lado de los asteriscos
			//Resta i(numero de asteriscos que tendrá la fila) al total de caracteres de la fila(te quedan los espacios totales)
			//Dividido entre 2 para sacar los espacios a cada lado
			//+1 ni me acuerdo por que lo siento chicos si funciona no lo toques
			int espacios = ((tamaño - i) / 2 + 1);
			//System.out.printf("Espacios = %d", espacios);

			//Espacios 
			for(int j = 0; j < espacios ; j++){
				System.out.print(" ");
			}
			//asteriscos
			for(int j = 0; j < i; j++){
			System.out.print("*");	
			}
			//Espacios2
			for(int j = 0; j < espacios ; j++){
				System.out.print(" ");
			}
			System.out.println("");
		}

		//Segundo triangulo
		for(int i = 3; i < (tamaño + 1); i=i+2){

			int espacios = ((tamaño - i) / 2 + 1);
			//System.out.printf("Espacios = %d", espacios);

			//Espacios
			for(int j = 0; j < espacios ; j++){
				System.out.print(" ");
			}
			//asteriscos
			for(int j = 0; j < i; j++){
			System.out.print("*");	
			}
			//Espacios2
			for(int j = 0; j < espacios ; j++){
				System.out.print(" ");
			}
			System.out.println("");
		}



		teclado.close();
	}
}