package com.github.alexeses.ej05;

// Programa que lea una variable entera mes y compruebe si el valor corresponde a un mes de 30
//días, de 31 o de 28. Supondremos que febrero tiene 28 días. Se debe comprobar que el valor
//introducido esté comprendido entre 1 y 12.
//
//Después de obtener la variable entera el programa debe imprimir por pantalla el número de
//dias del mes correspondiente y se mostrará además el nombre del mes. P.e si el usuario
//introduce 5 se imprimirá por pantalla 31 y el nombre del mes mayo.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Introduce un numero del 1 al 12: ");
        Scanner sc = new Scanner(System.in);

        try {
            int month = sc.nextInt();
            sc.close();
            checkMonth(month);
        } catch (Exception e) {
            System.out.println("El numero introducido no es valido");
        }

        sc.close();
    }

    private static void checkMonth(int month) {
        String monthName = "";
        int days = 0;

        switch (month) {
            case 1:
                monthName = "Enero";
                days = 31;
                break;
            case 2:
                monthName = "Febrero";
                days = 28;
                break;
            case 3:
                monthName = "Marzo";
                days = 31;
                break;
            case 4:
                monthName = "Abril";
                days = 30;
                break;
            case 5:
                monthName = "Mayo";
                days = 31;
                break;
            case 6:
                monthName = "Junio";
                days = 30;
                break;
            case 7:
                monthName = "Julio";
                days = 31;
                break;
            case 8:
                monthName = "Agosto";
                days = 31;
                break;
            case 9:
                monthName = "Septiembre";
                days = 30;
                break;
            case 10:
                monthName = "Octubre";
                days = 31;
                break;
            case 11:
                monthName = "Noviembre";
                days = 30;
                break;
            case 12:
                monthName = "Diciembre";
                days = 31;
                break;
            default:
                System.out.println("El numero introducido no es valido");
                break;
        }

        System.out.println("El mes de " + monthName + " tiene " + days + " dias");
    }

}
