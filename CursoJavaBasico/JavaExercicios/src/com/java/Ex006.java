    // Faca um programa que peca o raio de um circulo, calcule e mostre sua area.
    package com.java;
    import java.util.Scanner;

    public class Ex006 {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            System.out.println("Entre com o raio do circulo: ");
            double raio = scan.nextDouble();

            double area = Math.PI * Math.pow(raio, 2);
            System.out.println("A area do circulo e: " + area);


        }
    }
