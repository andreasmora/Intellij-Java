// Criar um vetor A com 10 elementos inteiros, implementar um programa que defina e escreva a soma de todos os
// elementos armazenados nesse vetor.


package com.java;

import java.util.Scanner;

public class Ex088 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] vetorA = new int[10];


        for (int i = 0; i<vetorA.length; i++) {
            System.out.println("Entre com o valor da posicao: " + i);
            vetorA[i] = scan.nextInt();
        }

        int qtdSoma = 0;
        for (int i = 0; i<vetorA.length; i++){
            qtdSoma += vetorA[i];

        }


        System.out.print("Vetor A = ");
        for (int i = 0; i < vetorA.length; i++) {
            System.out.print(vetorA[i] + " ");
        }
        System.out.println();
        System.out.println("A soma de todos os elementos: " + qtdSoma);
    }
}
