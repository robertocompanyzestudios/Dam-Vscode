/*Roberto Company Zomeño
Devuelve la suma y multiplicacion de los primeros 10 numeros naturales*/

public class ejer2{
	public static void main(String[] args){

		int suma = 0;
		int producto = 1;

		for(int i = 1; i < 11; i++){
			suma = suma + i;
		}
		System.out.println("Suma = " + suma);

		for(int i = 1; i < 11; i++){
			producto = producto * i;
		}
		System.out.println("Producto = " + producto);

	}
}