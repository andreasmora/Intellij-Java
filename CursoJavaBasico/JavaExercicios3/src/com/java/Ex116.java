// Construa um programa que leia 15 numeros inteiros e, ao final, mostre qual foi o maior valor fornecido.


package com.java;

import java.util.Scanner;

public class Ex116 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numero, maiorNumero = 0;
        int contador = 1;

        while (contador <=15){
            System.out.println("Digite o "+contador+" Numero: ");
            numero = scan.nextInt();

            if (numero > maiorNumero){
                maiorNumero = numero;
            }

            contador++;
        }
        System.out.println("O maior numero e: " + maiorNumero);
    }
}
