    // Faca um programa que peca dois numeros e imprima a soma deles.
    package com.java;
    import java.util.Scanner;

    public class Ex003 {
        public static void main(String[] args) {

            Scanner scan = new Scanner(System.in);
            System.out.println("Digite um numero: ");
            double numero1 = scan.nextDouble();
            System.out.println("Digite outro numero");
            double numero2 = scan.nextDouble();

            double resultado = numero1 + numero2;
            System.out.println("A soma dos dois numeros e: " + resultado);
        }

    }
