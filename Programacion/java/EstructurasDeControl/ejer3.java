import java.util.Scanner;

/*Roberto Company Zomeño
Comprueba si se puede construir un triangulo con 3 lados
*/

public class ejer3{
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);

        int a;
        int b;
        int c;

        System.out.println("Introduzca el primer valor: ");
        a = teclado.nextInt();
        System.out.println("Introduzca el segundo valor: ");
        b = teclado.nextInt();
        System.out.println("Introduzca el tercer valor: ");
        c = teclado.nextInt();

        if(a + b > c){
            if(b + c > a){
                if(a + c > b){
                    System.out.println(a+", "+b+" y "+c+" podrian representar los lados de un triangulo");
                } else{System.out.println(a+", "+b+" y "+c+" no podrian representar los lados de un triangulo");;}
            } else{System.out.println(a+", "+b+" y "+c+" no podrian representar los lados de un triangulo");;}
        } else{System.out.println(a+", "+b+" y "+c+" no podrian representar los lados de un triangulo");;}
    }
}