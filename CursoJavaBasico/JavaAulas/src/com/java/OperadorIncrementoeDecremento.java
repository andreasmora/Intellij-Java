package com.java;

public class OperadorIncrementoeDecremento {
    public static void main(String[] args) {

        int x = 10;
        x = x + 1;

        System.out.println("X = " + x);
        x--;

        System.out.println("X = " + x);

        // OUTRA FORMA DE INCREMENTO E DESCREMENTO.
        int y = 10;
        ++y;
        System.out.println("Y = " + y);

        --y;
        System.out.println("Y = " + y);

        int z = 10, w = 5, a = 5;
        z = w++;
        System.out.println("Z = " + z);
        System.out.println("W = " + w);

        z = --a;
        System.out.println("Z = " + z);
        System.out.println("W = " + a);


    }
}
