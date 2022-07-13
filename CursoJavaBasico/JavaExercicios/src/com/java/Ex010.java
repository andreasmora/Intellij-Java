    //Faca um programa que peca a temperatura em graus Celsius, transforme
    //// e mostre em graus Farenheit.
    package com.java;
    import java.util.Scanner;

    public class Ex010 {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            System.out.println("Entre com a temperatura em Celsius:");
            double c = scan.nextDouble();

            double f = (c * 1.8) + 32;
            System.out.println("A temperatura " + c + " C e igual a: " + f + " F");
        }
    }
