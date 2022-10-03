package com.github.alexeses.ej02;

// 2. Programa Java que declare una variable B de tipo entero y asígnale un valor. A continuación muestra
//un mensaje indicando si el valor de B es positivo o negativo. Consideraremos el 0 como positivo. Utiliza el
//condicional if y el println para resolverlo.
//Realizar los dos apartados en dos paquetes y mostrar al profesor que realizan las operaciones y funciona.

import java.util.Scanner;

public class Main {

    // Declaramos la variable
    public int B;

    public static void main(String[] args) {

        getRandomNumber();

    }

    private static void getRandomNumber() {
        Scanner sc = new Scanner(System.in);
        System.out.print("> Introduce un numero: ");
        int B = sc.nextInt();
        sc.close();
        System.out.println(checkNumber(B));
    }

    private static String checkNumber(int b) {

        String error = "";

        if (b >= 0) {
            error = "El numero es positivo";
        } else {
            error = "El numero es negativo";
        }

        return error;
    }

}
