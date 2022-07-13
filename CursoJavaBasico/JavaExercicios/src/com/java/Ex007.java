    // Faca um programa que calcule a area de um quadrado, em seguida mostre
    // o dobro desta area para o usuario.
    package com.java;
    import java.util.Scanner;

    public class Ex007 {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            System.out.println("Entre com o tamanho do lado do quadrado: ");
            double lado = scan.nextDouble();

            // area = lado * lado
            double area = Math.pow(lado, 2);
            System.out.println("A area do quadrado e: " + area);
            System.out.println("O dobro da area do quadrado e: " + (area * 2));



        }
    }
