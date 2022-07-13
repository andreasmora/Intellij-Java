    // contrua um programa que leia 15 numeros inteiros e ao final mostre qual foi o maior valor fornecido.

    package com.java;

    import java.util.Scanner;

    public class Ex114 {
        public static void main(String[] args) {

            int numero, numeroMaior = 0, contador = 1;

            Scanner scan = new Scanner(System.in);

            while (contador <=15){
                System.out.println("Digite o "+contador+ " numero: ");
                numero = scan.nextInt();

                if (numero > numeroMaior)
                    numeroMaior = numero;

                    contador++;


            }

            System.out.println("O maior numero e: " + numeroMaior);


        }
    }
