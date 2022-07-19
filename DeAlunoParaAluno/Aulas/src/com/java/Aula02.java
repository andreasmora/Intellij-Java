package com.java;

public class Aula02 {
    public static void main(String[] args) {

        // Casting ( Nada mais e do que forcar uma variavel ou um determinado valor a ser de um determinado
        // tipo de data.
        int x = 10, y = 6, z = 3;
        double a = 3.0, b = 1.0;
        double c = (double) x/y; // exemplo de casting. veja o resultado em C =
        int h = (int) c;  // outro exemplo de casting

        System.out.println("X = " + x);
        System.out.println("Y = " + y);
        System.out.println("Z = " + z);
        System.out.println("H = " + h);

        System.out.println("A = " + a);
        System.out.println("B = " + b);
        System.out.println("C = " + c);

    }
}
