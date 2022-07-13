// Criar um vetor A com 10 elementos inteiros, implementar um programa que defina e escreva a media aritimetica simples
// dos elementos impares armazenadas nesse vetor.


package com.java;

import java.util.Scanner;

public class Ex090 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] vetorA = new int[10];


        for (int i = 0; i<vetorA.length; i++) {
            System.out.println("Entre com o valor da posicao: " + i);
            vetorA[i] = scan.nextInt();
        }

        int soma = 0;
        int impar = 0;
        for (int i = 0; i<vetorA.length; i++){
            if (vetorA[i] % 2 != 0){
                soma += vetorA[i];
                impar++;

            }
        }


        System.out.print("Vetor A = ");
        for (int i = 0; i < vetorA.length; i++) {
            System.out.print(vetorA[i] + " ");
        }
        System.out.println();
        System.out.println("Soma: " + soma);
        System.out.println("Media: " + soma/impar);
    }
}
