/* lfmrad
Actividad Semana 4 Parte 3
1. Escribir un programa en Java que, dados 2 números con decimales por el usuario, 
muestre por pantalla la suma, resta, multiplicación, división y módulo de los mismos.  
(Subir archivo: Ejercicio1.java) */

import java.util.Scanner;
import java.util.InputMismatchException;

public class Ejercicio1 {
    static Scanner dataInput = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Introduce dos números para calcular su suma, resta, multiplicación, división y módulo.");
        System.out.println("Introduce el primer número:");
        double a = getNumber();
        System.out.println("Introduce el segundo número:");
        double b = getNumber();

        System.out.printf("Suma: %.2f \n", a + b);
        System.out.printf("Resta: %.2f \n", a - b);
        System.out.printf("Multiplicación: %.2f \n", a * b);
        System.out.printf("Devisión: %.2f \n", a / b);
        System.out.printf("Módulo: %.2f \n", a % b);
    }

    static double getNumber() {
        while(true) {
            try {
                return dataInput.nextFloat();
            } catch (InputMismatchException e) {
                dataInput.next();
                System.out.println("La entrada no es válida. Introduce un número decimal.");
            }
        }
    }
}