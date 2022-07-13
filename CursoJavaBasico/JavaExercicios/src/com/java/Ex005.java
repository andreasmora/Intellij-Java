    // Faca um programa que converta metros para centimetros
    package com.java;
    import java.util.Scanner;

    public class Ex005 {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            System.out.println("Entre com a quantidade de metros: ");
            double metros = scan.nextDouble();

            double cm = metros * 100;
            System.out.println(metros + " M e igual a " + cm + " CM");

        }
    }
