    // faca um programa que peca 02 numeros inteiros e um numero real. Calcule e mostre
    // a. o produto do dobro do primeiro com metade do segundo.
    // b. a soma do triplo do primeiro com o terceiro.
    // c. o terceiro elevado ao cubo.
    package com.java;
    import java.util.Scanner;

    public class Ex011 {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            System.out.println("Digite um numero inteiro: ");
            int num1 = scan.nextInt();
            System.out.println("Digite outro numero inteiro: ");
            int num2 = scan.nextInt();
            System.out.println("Entre com um numero real: ");
            double num3 = scan.nextDouble();

            int resultado1 = (num1 * 2) * (num2 / 2);
            double resultado2 = (num1 * 3) + num3;
            double resultado3 = Math.pow (num3, 3);

            System.out.println("Resultado 1: " + resultado1 + (" ( O dobro do primeiro com metade do segundo )."));
            System.out.println("Resultado 2: " + resultado2 + (" ( A soma do triplo do primeiro com o terceiro )."));
            System.out.println("Resultado 3: " + resultado3 + (" ( O terceiro elevado ao cubo )."));

        }
    }
