package EjerciciosImpares;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        //Declaracion de variables
        int puntos;
        String tipoCliente;

        System.out.println("Ingrese el total de puntos");
        puntos = entrada.nextInt();

        if (puntos < 1000) {
            tipoCliente = "Bronce";
        } else if (puntos >= 1000 && puntos <= 3000) {
            tipoCliente = "Plata";
        } else {
            tipoCliente = "Oro";
        }

        // Mostrar el tipo de cliente
        System.out.println("El cliente es de tipo " + tipoCliente);
    }

}


