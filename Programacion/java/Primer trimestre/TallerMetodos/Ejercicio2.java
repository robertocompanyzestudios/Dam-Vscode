/*
Escribe un método que se llame trianguloTexto() que reciba un número entero como parámetro
devuelva una cadena de caracteres con el texto formateado de una pirámide de asteriscos.
NOTA: No es necesario que devuelva la cadena de caracteres, se puede ir imprimiendo por pantalla directamente desde el método.

Por ejemplo si se introduce el 6, la cadena devuelta, al imprimirla, daría:
                      *

                     ***

                    *****

                   *******

                  *********

                 ***********

Prueba el método pedido desde main().
Deben seguirse los principios y estilo del código limpio

Autor: Roberto Company Zomeño
19/12/2024
*/

import java.util.Scanner;

public class Ejercicio2{
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int altura;

        System.out.println("Introduzca la altura del arbol deseado: ");
        altura = teclado.nextInt();

        trianguloTexto(altura);

        teclado.close();
    }


    public static void trianguloTexto(int altura){
        int anchura = (altura * 2) - 1;
        int espacios;
        int asteriscos = 1;
        //Hace 1 vuelta por piso
        for(int i = 0; i < altura; i++){
            if(i == 0){
                asteriscos = 1;
                //Espacios en cada extremo
                espacios = (anchura - 1) / 2;
            } else{
                asteriscos = asteriscos + 2;
                //Espacios en cada extremo
                espacios = (anchura - asteriscos)/2;

            }

            //Salida del piso
            for(int k = 0; k < espacios; k++){
                System.out.print(" ");
            }

            for(int k = 0; k < asteriscos; k++){
                System.out.print("*");
            }

            for(int k = 0; k < espacios; k++){
                System.out.print(" ");
            }
            System.out.println("");
        }


    }
}
