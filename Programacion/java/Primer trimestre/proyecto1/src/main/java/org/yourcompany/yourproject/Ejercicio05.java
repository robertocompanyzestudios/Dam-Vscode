


/*
Escribe un método que utilice un array (vector) de 10 elementos de números enteros
E inicialice cada elemento con el valor 7 en cada elemento y que devuelva el array al final.

Se debe crear otro método que reciba el array y los muestre por pantalla utilizando un bucle for.
Se recomienda utilizar todos los modos de inicialización conocidos para un vector int[].


*/

public class Ejercicio05{
    public static void main(String[] args) {

        mostrarArray(creararray());

    }

    public static int[] creararray(){
        int[] miarray = new int[10];

        for(int i = 0; i<10; i++){
            miarray[i] = 7;
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