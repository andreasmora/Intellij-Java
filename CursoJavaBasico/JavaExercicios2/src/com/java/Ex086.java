//Criar um vetor A com 10 elementos inteiros. Construir um vetor B de mesmo tipo e tamanho sendo que cada elemento
// do vetor B devera ser o resto da divisao do respectivo elementos de A por 2 ou seja: B[i] := A[i] % 2.

package com.java;


import java.util.Scanner;

public class Ex086 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int[] vetorA = new int[10];
        int[] vetorB = new int[vetorA.length];



        for (int i = 0; i < vetorA.length; i++) {
            System.out.println("Entre com o valor da posicao: " + i);
            vetorA[i] = scan.nextInt();

            vetorB[i] = vetorA[i] % 2;

        }

        System.out.print("Vetor A = ");
        for (int i = 0; i < vetorA.length; i++) {
            System.out.print(vetorA[i] + " ");
        }
        System.out.println();


        System.out.print("Vetor B = ");
        for (int i = 0; i < vetorB.length; i++) {
            System.out.print(vetorB[i] + " ");
        }
        System.out.println();


    }
}
