/*
Escribe un método que utilice un array (vector) de 20 elementos de números enteros e inicialice cada elemento con un valor igual al índice correspondiente del elemento, multiplicado por 5 y que devuelva el array al final.
Se debe crear otro método que reciba el array y los muestre por pantalla utilizando un bucle for.
Se recomienda utilizar todos los modos de inicialización conocidos para un vector int[].
Deben seguirse los principios y estilo del código limpio
*/

public class Ejercicio06{
    public static void main(String[] args) {

        creararray(20);

    }

    public static int[] creararray(int tamaño){
        int[] miarray = new int[tamaño];

        for(int i = 0; i<tamaño; i++){
            miarray[i] = i*5;
        }

        return miarray;
    }

        public static void mostrarArray(int[] arrayx){
        System.out.println("Array: ");

        for(int i = 0; i<10; i++){
            System.out.println(arrayx[i]);
        }
    }
}
