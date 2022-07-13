    // Faca um programa que peca a temperatura em graus Farenheit, transforme
    // e mostre em graus Celsius.
    package com.java;
    import java.util.Scanner;

    public class Ex009 {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            System.out.println("Entre com a temperatura em Farenheit: ");
            double f = scan.nextDouble();

            double c = (5 * (f-32) / 9);
            System.out.printf("A temperatura " + f + " F e igual a: " + c + " C");
        }
    }
