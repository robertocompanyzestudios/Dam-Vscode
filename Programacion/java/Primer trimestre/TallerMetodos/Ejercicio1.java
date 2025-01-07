/*
Escribe un programa Java para calcular los salarios semanales de empleados a los que se les paga 15 euros por hora hasta el limite de las 35 horas. Cada hora por encima de 35 se considerará extra y se paga a 22 €.
El programa pide las horas del trabajador, realiza el calculo, muestra el resultado y vuelve a pedir otro si se quiere seguir. El salario que se le debe pagar se calcula utilizando un método especializado llamado calcularSalario().
El método  calcularSalario() recibe las horas como parámetro y devuelve el sueldo que corresponde.
Deben seguirse los principios y estilo del código limpio.

Autor: Roberto Company Zomeño
19/12/2024
*/

import java.util.Scanner;
public class Ejercicio1{
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int horas;

        System.out.println("Introduzca la cantidad de horas semanales del empleado: ");
        horas = teclado.nextInt();

        System.out.println("Salario semanal = " + calcularSalario(horas));

        teclado.close();
    }


    public static int calcularSalario(int horas){
        int salarioSemanal;

        if(horas > 35){
            salarioSemanal = 35 * 15;
            horas = horas - 35;

            salarioSemanal = salarioSemanal + (horas * 22);

            return salarioSemanal;

        } else if (horas<= 35 && horas > 0){
            salarioSemanal = horas * 15;

            return salarioSemanal;
        }

        return 0;
    }
}