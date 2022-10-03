package com.github.alexeses.ej01;

// Realizar los siguientes programas en Java
//1.Programa  java  que  declare  cuatro  variables  enteras  A,  B,  C  y  D  y  asígnale  un  valor  acada  una.  A
//continuación realiza las instrucciones necesarias para que: B tome el valor de C, C tome el valor de A, A
//tome el valor de D, D tome el valor de B.. Imprimir por pantalla los valores iniciales y posteriormente los
//valores finales con dos líneas de separación.
//2. Programa Java que declare una variable B de tipo entero y asígnale un valor. A continuación muestra
//un mensaje indicando si el valor de B es positivo o negativo. Consideraremos el 0 como positivo. Utiliza el
//condicional if y el println para resolverlo.
//Realizar los dos apartados en dos paquetes y mostrar al profesor que realizan las operaciones y funciona.

public class Main {

    public static void main(String[] args) {
        // Declaramos las variables
        int A = 1;
        int B = 2;
        int C = 3;
        int D = 4;

        // Mostramos los valores iniciales
        System.out.println("Valores iniciales:");
        System.out.println("A = " + A);
        System.out.println("B = " + B);
        System.out.println("C = " + C);
        System.out.println("D = " + D);

        // Realizamos las operaciones
        int aux = B;
        B = C;
        C = A;
        A = D;
        D = aux;

        // Mostramos los valores finales
        System.out.println("Valores finales:");
        System.out.println("A = " + A);
        System.out.println("B = " + B);
        System.out.println("C = " + C);
        System.out.println("D = " + D);
    }

}