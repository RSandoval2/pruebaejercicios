package EjerciciosImpares;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);


        //Declaración de variables
    double respuestasCorrectas, respuestasIncorrectas, respuestasVacias;
    double puntaje;

        //Captura de datos

        System.out.println("Escriba el numero de respuestas correctas: ");
        respuestasCorrectas = entrada.nextDouble();

        System.out.println("Escriba el número de respuestas incorrectas: ");
        respuestasIncorrectas = entrada.nextDouble();

        System.out.println("Escriba el numero de respuestas vacías: ");
        respuestasVacias = entrada.nextDouble();

        puntaje = (respuestasCorrectas * 5) + (respuestasIncorrectas * -2);

        System.out.println("El total de puntos obtenidos es de: " + puntaje );

    }
}
