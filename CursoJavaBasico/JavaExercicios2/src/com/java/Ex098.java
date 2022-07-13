// Criar um vetor A com 10 elementos inteiros. Desenvolver um programa que verifique se todos os elementos do vetor A sao pares.
// Se pelo menos um elemento do vetor nao for par, o processo de repeticao para percorrer os elementos do vetor deve ser
// encerrado como sugestao: Utilize uma variavel do tipo Flag para atingir este proposito.


package com.java;

import java.util.Scanner;

public class Ex098 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] vetorA = new int[10];

        for (int i=0; i<vetorA.length; i++){
            System.out.println("Entre com um numero para a posicao " + i);
            vetorA[i] =scan.nextInt();

            if (vetorA[i] % 2 != 0){
                break;
            }
        }

    }
}
