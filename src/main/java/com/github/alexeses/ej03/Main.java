package com.github.alexeses.ej03;

// Programa en Java que le pida al usuario la temperatura media del dia en cantidad de grados
//centígrados y la pase a grados Fahrenheit. La fórmula correspondiente es: F = 32 + ( 9 * C / 5)
//Utilizar la clase Scanner y el tipo de variable double.
//
//Imprimir por pantalla “La temperatura de hoy en grados centígrados es” y los grados
//centrigrados
//Y después imprimir por pantalla “La temperatura de hoy en grados Fahrenheit es” y los grados
//Fahrenheit.

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        getGradosCentigrados();
    }

    private static void getGradosCentigrados() {
        System.out.println("Introduce los grados centigrados: ");
        Scanner sc = new Scanner(System.in);
        double gradosCentigrados = sc.nextDouble();
        sc.close();

        System.out.println("La temperatura de hoy en grados centígrados es " + gradosCentigrados);
        gradosFahrenheit(gradosCentigrados);
    }

    private static void gradosFahrenheit(double gradosCentigrados) {
        double gradosFahrenheit = 32 + (9 * gradosCentigrados / 5);
        System.out.println("La temperatura de hoy en grados Fahrenheit es " + gradosFahrenheit);
    }
}
