package com.java;

import java.util.Scanner;

public class Operadores1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int x = 12;
        int y = 5;

        System.out.println("X + Y = " + (x+y));
        System.out.println("X - Y = " + (x-y));
        System.out.println("X * Y = " + (x*y));
        System.out.println("X / Y = " + (x/y));
        System.out.println("X / Y = " + (x/ (double) y));
        System.out.println("X % Y = " + (x%y));
    }
}
