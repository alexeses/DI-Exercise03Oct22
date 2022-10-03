package com.github.alexeses.ej06;

// Ejercicio 4
//Se quiere realizar un programa en Java que sirva para calcular la media de una serie de valores
//numéricos  que  se  leen  por  teclado.Para  ello  se  quiere  que  el  programa  pida  al  usuario  por
//teclado 10 números enteros, tanto positivos como negativos pero no decimales y los guarde en
//un array.
//A  continuación  calcula  y  muestra  por  separado  la  media  de  los  valores  positivos  y  la  de  los
//valores negativos de los valores numéricos que se le han pedido al usuario y se han guardado en
//un array.

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    private static int countPos;
    private static int totalPos;
    private static int totalNeg;
    private static final int MAX_NUM = 10;
    private static final int[] arrayNumbers = new int[MAX_NUM];

    public static void main(String[] args) {
        getNumbers();
        announcer();
    }

    private static void getNumbers() {

        Scanner sc = new Scanner(System.in);
        int aux;

        for (int i = 0; i < MAX_NUM; i++) {
            System.out.print(" > Introduce un número: ");
            try {
                aux = sc.nextInt();
                checkNumber(aux);
                arrayNumbers[i] = aux;
            } catch (InputMismatchException e) {
                System.out.println(" > Error: " + e.getMessage());
                i--;
            }

        }
        sc.close();

    }

    private static void announcer() {

        System.out.println("> El total de números introducidos es de " + MAX_NUM);
        System.out.println("> Hay un total de " + countPos + " números positivos");
        System.out.println("> Hay un total de " + (MAX_NUM - countPos) + " números negativos");

        try {
            System.out.println("> La media de los números negativos es de " + (totalNeg / (MAX_NUM - countPos)));
        } catch (ArithmeticException e) {
            System.out.println("(!) No se puede dividir entre 0");
        }

        System.out.println("> La media de los números positivos es de " + (totalPos / countPos));
    }

    private static void checkNumber(int nextInt) {

        if (nextInt > 0) {
            countPos ++;
            totalPos += nextInt;
        } else {
            totalNeg += nextInt;
        }

    }
}
