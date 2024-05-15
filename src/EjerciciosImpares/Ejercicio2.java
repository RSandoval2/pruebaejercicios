package EjerciciosImpares;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        //Declaracion de variables

        int num, i = 1;

        System.out.println("Escriba un numero entero positivo");
        num = entrada.nextInt();

        while (i < num) {
            System.out.println(i);
            i += 2;


        }
    }
}
