import java.util.Scanner;

/*Roberto Company Zomeño
*Pide un multiplo de 5
*Devuelve su desglose en los minimos billetes posibles
*/



public class ejercicio2{
	public static void main(String[] args){
		Scanner teclado = new Scanner(System.in);

		int dinero = 0;

		while (true){
			System.out.println("Introduzca la cantidad de dinero a desglosar: ");
			dinero = teclado.nextInt();

			if (dinero % 5 == 0){
				break;
			} else {
				System.out.println("El dinero debe ser un multiplo de 5");
			}
		}


		//n billetes
		int b500 = 0;
		int b200 = 0;
		int b100 = 0;
		int b50 = 0;
		int b20 = 0;
		int b10 = 0;
		int b5 = 0;


		//Calculo billetes

		while (dinero >= 500){
			dinero = dinero - 500;
			b500 = b500 + 1;
		}

		while (dinero >= 200){
			dinero = dinero - 200;
			b200 = b200 + 1;
		}

		while (dinero >= 100){
			dinero = dinero - 100;
			b100 = b100 + 1;
		}

		while (dinero >= 50){
			dinero = dinero - 50;
			b50 = b50 + 1;
		}

		while (dinero >= 20){
			dinero = dinero - 20;
			b20 = b20 + 1;
		}

		while (dinero >= 10){
			dinero = dinero - 10;
			b10 = b10 + 1;
		}

		while (dinero >= 5){
			dinero = dinero - 5;
			b5 = b5 + 1;
		}

		//Salida por pantalla
		System.out.println("-------------------------------------");
		System.out.println("Billetes:");

		if (b500 > 0) {
			System.out.printf("500 = %d\n", b500);
		}
		if (b200 > 0) {
			System.out.printf("200 = %d\n", b200);
		}
		if (b100 > 0) {
			System.out.printf("100 = %d\n", b100);
		}
		if (b50 > 0) {
			System.out.printf("50 = %d\n", b50);
		}
		if (b20 > 0) {
			System.out.printf("20 = %d\n", b20);
		}
		if (b10 > 0) {
			System.out.printf("10 = %d\n", b10);
		}
		if (b5 > 0) {
			System.out.printf("5 = %d\n", b5);
		}		

		teclado.close();
	}
}