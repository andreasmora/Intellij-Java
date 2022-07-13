// Criar um vetor A com 10 elementos inteiros, implementar um programa que determine a soma dos
// elementos armazenados nesse vetor que sao multiplos de 5.


package com.java;

import java.util.Scanner;

public class Ex089 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] vetorA = new int[10];


        for (int i = 0; i<vetorA.length; i++) {
            System.out.println("Entre com o valor da posicao: " + i);
            vetorA[i] = scan.nextInt();
        }

        int qtdSoma = 0;
        for (int i = 0; i<vetorA.length; i++){
            if (vetorA[i] % 5 == 0){
                qtdSoma += vetorA[i];
            }
        }


        System.out.print("Vetor A = ");
        for (int i = 0; i < vetorA.length; i++) {
            System.out.print(vetorA[i] + " ");
        }
        System.out.println();
        System.out.println("Os multiplos de 5 sao: " + qtdSoma);
    }
}
