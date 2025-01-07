/*
Escribe un método llamado muestraCuadrado() que muestra un cuadrado en modo texto.

Hay que tener en cuenta que:
-El método recibe un número para el tamaño del lado y un carácter para utilizarlo en el contorno del cuadrado.
-El algoritmo utilizado debe formatear todo sobre una sola cadena de texto que será devuelta.

Prueba exhaustivamente el método pedido desde main().
Deben seguirse los principios y estilo del código limpio..¡

Autor: Roberto Company Zomeño
19/12/2024
*/


import java.util.Scanner;

public class Ejercicio3{
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduzca la medida del lado del cuadrado deseado: ");
        int lado = teclado.nextInt();

        teclado.nextLine();

        //Control de formato
        System.out.println("Solo se tomará el primer caracter del parametro introducido");
        System.out.println("Introduzca el caracter para construir los lados del cuadrado: ");
        char caracter = (teclado.nextLine()).charAt(0);

        System.out.printf(muestraCuadrado(lado, caracter));

        teclado.close();
    }

    public static String muestraCuadrado(int lado, char caracter){
        String cuadrado = "";

        //Por cada fila
        for(int i = 0; i < lado; i++){
            //Primera y última fila
            if(i == 0 || i == lado - 1){
                //por cada caracter
                for(int k = 0; k < lado; k++){
                    cuadrado = cuadrado + caracter;
                }
                cuadrado = cuadrado + "\n";

            //Todas las demás filas
            } else if(i > 0 && i < lado - 1){
                cuadrado = cuadrado + caracter;

                //caracteres en blanco
                for(int k = 0; k < lado -2 ; k++){
                    cuadrado = cuadrado + " ";
                }

                cuadrado = cuadrado + caracter;
                cuadrado = cuadrado + "\n";

            }

        }

        return cuadrado;
    }


}