import java.util.Random;
import java.util.Scanner;

/*Escribe un método que se llame maxima3() que recibe una matriz rectangular de tamaño (n,m) con datos.
Devuelve una una submatriz de tamaño (3,3), cuyos valores sumen el valor máximo dentro de la matriz recibida.
Modifica el ejemplo de submatriz máxima del capitulo 7. Arrays de los apuntes.
Deben seguirse los principios y estilo del código limpio.

Roberto Company Zomeño
*/


public class ejer16{
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int altura, anchura;

        System.out.println("Introduzca las dimensiones de la matriz deseada");

        System.out.println("Altura: ");
        altura = teclado.nextInt();

        System.out.println("Anchura: ");
        anchura = teclado.nextInt();

        int[][] matriz = generarMatriz(altura, anchura);

        mostrarMatriz(matriz);


        mostrarMatriz(maxima3(matriz));

    }

    public static int[][] maxima3(int[][] matriz){

        int[][] matriz_resultado = new int[3][3];
        int suma;
        int mayor = 0;
        int[] identificador = {0,0};


        //-2 para situarse en el 1er cuadrado de los 3 (arriba izquierda)
        //|
        //V
        //[][][]
        //[][][]
        //[][][]
        //recorre filas
        for(int i = 0; i < matriz[i].length - 2; i++){
            suma = 0;
            //recorre columnas
            for(int j = 0; j < matriz.length - 2; j++){
                suma = 0;
                //situa los 3x3 selectores
                for (int k = 0; k < 3; k++){
                    for(int z = 0; z < 3; z++){
                        suma = suma + matriz[i + k][j + z];
                    }


                }
                if(suma > mayor){
                    mayor = suma;
                    identificador[0] = i;
                    identificador[1] = j;
                }
                System.out.println("["+ i +"]["+ j +"] = " + suma);
            }

        }
        //Comprobaciones posicion con mayor valor
        //System.out.print("Posicion mayor = ");
        //mostrarArray(identificador);

        for(int i = identificador[1]; i < identificador[1] + 3; i++){
            for(int j = identificador[0]; j < identificador[0] + 3; j++){
                matriz_resultado[i - identificador[1]][j - identificador[0]] = matriz[i][j];
            }
        }  

        return matriz_resultado;
    }

     public static int[][] generarMatriz(int altura, int anchura){
        Random random = new Random();
        int[][] matriz = new int[altura][anchura];

        //recorre cada columna
        for(int i = 0; i< altura; i++){
            //System.out.println("Columna: " + i);
            ///recorre cada fila de la columna
            for(int k = 0; k < anchura; k++){
                //System.out.println("Fila: " + k);
                matriz[i][k] = random.nextInt(11);
            }
        }

        return matriz;
    }

    public static void mostrarArray(int[] array){
        for(int i = 0; i< array.length; i++){
            System.out.print("[" + array[i] +"]" );
        }
    }

    public static void mostrarMatriz(int[][] matriz){

        System.out.println("Matriz: ");
        for (int i = 0; i < matriz.length; i++) {
            for (int k = 0; k < matriz[i].length; k++) {
                System.out.print("["+ matriz[i][k] + "] ");
            }
            System.out.println();
        }

    }

}