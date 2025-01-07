import java.util.Scanner;

/*Roberto Company Zomeño
*Pide hora minutos y segundos
*Calcula la hora 1 segundo más tarde
*/

public class ejercicio1{
	public static void main(String[] args){
		Scanner teclado = new Scanner(System.in);

		int hora;
		int min;
		int seg;

		//Recogida de datos y comprobacion de errores

		System.out.println("Bienvenido a la calculadora del tiempo");


		//horas 
		while (true){
			System.out.println("Introduzca la hora(0-23): ");
			hora = teclado.nextInt();

			if (hora < 0){
				System.out.println("La hora debe estar entre 0 y 23");
			} else if (hora > 23){
				System.out.println("La hora debe estar entre 0 y 23");
			} else if (hora >= 0){
				break;
			}
		}


		
		//minutos
		while (true){
			System.out.println("Introduzca los minutos(0-59): ");
			min = teclado.nextInt();

			if (min < 0){
				System.out.println("Los minutos deben estar entre 0 y 59");
			} else if (min > 59){
				System.out.println("Los minutos deben estar entre 0 y 59");
			}else if (min >= 0){
				break;
			}
		}


		//segundos
		while (true){
			System.out.println("Introduzca los segundos(0-59): ");
			seg = teclado.nextInt();

			if (seg < 0){
				System.out.println("Los segundos deben estar entre 0 y 59");
			} else if (seg > 59){
				System.out.println("Los segundos deben estar entre 0 y 59");
			} else if(seg >= 0){
				break;
			}

		}

		System.out.println("-----------------------------------");
		System.out.printf("Hora previa = %d:%d:%d \n", hora, min, seg);

		//Calculo

		seg = seg + 1;


		if (seg == 60){
			seg = 0;
			min = min + 1;
		} 

		if (min == 60){
			min = 0;
			hora = hora + 1;
		}

		//Si la hora llega a 24 significa que eran las 23:59:59
		//Igualo a 0 todo para evitar errores
		if (hora == 24){
			seg = 0;
			min = 0;
			hora = 0;
		}


		//Salida por pantalla
		System.out.println("-----------------------------------");
		System.out.printf("Dentro de 1s serán las %d:%d:%d\n", hora, min, seg );


		teclado.close();

	}
}