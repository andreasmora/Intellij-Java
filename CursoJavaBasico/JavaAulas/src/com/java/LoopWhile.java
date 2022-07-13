package com.java;

import java.util.Scanner;

public class LoopWhile {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int i = 1; // count ou cont.
        int max = 10;

            System.out.println("Contando ate: " + max);

        while (i <= max){
            System.out.println("Valor de i: " + i);
            i++; // i = i + 1 / i += 1;

        }
            System.out.println("(Proximo numero apos o limite)" + i); // valor de 21

        do {
            i++;
            System.out.println("Valor de i: " + i);
        } while (i < 15);
            System.out.println(i);
    }
}
