package com.github.alexeses.ej04;

// Apartado 2
//Programa que lee por teclado el valor del radio de una circunferencia y calcula y muestra por
//pantalla la longitud y el área de la circunferencia. Longitud de la circunferencia = 2*PI*Radio,
//Area de la circunferencia = PI*Radio^2
//
//Se pide realizar los dos apartados en proyectos diferentes en el IDE y mostrar al profesor cada
//apartado por separado y que funcione.

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        double radio;
        double area;

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el radio de la circunferencia: ");
        radio = 2 * Math.PI * sc.nextDouble();
        area = Math.PI * Math.pow(radio, 2);
        System.out.println("La longitud de la circunferencia es: " + radio + " y el area es: " + area);
        sc.close();

    }
}
