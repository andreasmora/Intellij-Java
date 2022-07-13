// Gerar Aleatoriamente um vetor A com 10 elementos inteiros e iguais a 0 e 1, sugestao: A[i] = math.random() *1);
// Pde-se para implementar um programa que determine o percentual de numeros 0´s e 1´s existentes no vetor A.

package com.java;

import java.util.Scanner;

public class Ex097 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] vetorA = new int[10];
        int qtd0 = 0;
        int qtd1 = 0;


        for (int i=0; i<vetorA.length; i++){
            vetorA[i] = (int) Math.round(Math.random() * 5);

            if (vetorA[i] == 0){
                qtd0++;
            } else {
                qtd1++;
            }
        }
        //10  - 100%
        //qtd - x
        //x = (qtd * 100)/10;

        double porcentagem0 = (qtd0 * 100) / vetorA.length;
        double porcentagem1 = (qtd1 * 100) / vetorA.length;

        System.out.print("Vetor A = ");
        for (int i=0; i<vetorA.length; i++){
            System.out.print(vetorA[i] + " ");
        }

        System.out.println();

        System.out.println("Porcentagem 0 = " + porcentagem0);
        System.out.println("Porcentagem 1 = " + porcentagem1);

    }
}
