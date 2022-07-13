    // Faca um programa que peca dois numeros e imprima o maior deles.
    package com.java;
    import java.util.Scanner;

    public class Ex015 {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            System.out.println("Digite o primeiro numero: ");
            double primeiroNumero = scan.nextDouble();

            System.out.println("Digite o segundo numero: ");
            double segundoNumero = scan.nextDouble();

            if (primeiroNumero > segundoNumero) {
                System.out.println("O primeiro numero e maior que o segundo: " + primeiroNumero);
            } else if (primeiroNumero < segundoNumero) {
                System.out.println("O segundo numero e menor que o primeiro: " + segundoNumero);
            } else {
                System.out.println("Voce digitou numeros iguais: " + (primeiroNumero + segundoNumero));
            }
        }
    }
