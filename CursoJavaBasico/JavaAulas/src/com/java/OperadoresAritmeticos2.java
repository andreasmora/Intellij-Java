package com.java;

import java.util.Scanner;

public class OperadoresAritmeticos2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int a = 3;
        int b = 4;
        int c = 5;
        int x = 0;

        System.out.print("a | b | c | x \n");
        System.out.println("--------------\n");

        System.out.printf("%d | %d | %d | %d \n" , a, b, c, x);

        x = a++ *b;
        System.out.printf("%d | %d | %d | %d \n" , a, b, c, x);

        b = a;
        System.out.printf("%d | %d | %d | %d \n" , a, b, c, x);

        x = 100 / (--b *c);
        System.out.printf("%d | %d | %d | %d \n" , a, b, c, x);

        c++;
        System.out.printf("%d | %d | %d | %d \n" , a, b, c, x);



    }
}
