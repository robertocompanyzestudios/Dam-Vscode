import java.util.Scanner; 	

public class ejer4{
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


        if(a*a == b*b+c*c){
        	System.out.println("Los valores si pueden conformar un triangulo rectangulo");
        } else if(b*b == a*a+c*c){
        	System.out.println("Los valores si pueden conformar un triangulo rectangulo");
        } else if(c*c == a*a+b*b){
        	System.out.println("Los valores si pueden conformar un triangulo rectangulo");
        } else{
        	System.out.println("Los valores no pueden conformar un triangulo rectangulo");
        }
    }
}