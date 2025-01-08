/*
Escribe un método que se llame contarIntConsecutivos() que recibe un vector de enteros.
Devuelve cuantos valores -entre sus elementos- están ordenados.
Si  todos los elementos son diferentes devuelve 0.
*/


public class ejer11{
    public static void main(String[] args) {
        int[] numeros = {5, 2, 3, 1, 4, 5, 2, 3, 1, 4};

        System.out.println("maximo numeros ordenados = "+ contarIntConsecutivos(numeros));


    }

    public static int contarIntConsecutivos(int[] vector){
        int streak = 0;
        int maxStreak = 0;

        for(int i = 1; i < vector.length; i++){

            //calcula la racha de datos ordenados
            if(vector[i] == (vector[i-1] + 1)){
                streak = streak + 1;

                //System.out.println(vector[i-1]);
                //System.out.println(vector[i]);

                if(streak > maxStreak){
                    maxStreak = streak;
                }

            }else if(vector[i] != vector[i-1] + 1){
                streak = 0;
            }
        }


        return maxStreak;
    }

}