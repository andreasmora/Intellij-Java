// implementar um programa que obtenha a cotacao do dollar (U$) em relacao ao real (R$). e a seguir armazene em vetor A
// com 20 elementos as seguintes conversoes.



package com.java;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex096 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        double[] vetorA = new double[20];
        double cotacao;

        System.out.println("Entre com a cotacao do Dollar: ");
        cotacao = scan.nextDouble();


        for (int i=0; i< vetorA.length; i++) {
            vetorA[i] = cotacao * (i+1);
        }

        DecimalFormat df = new DecimalFormat("###,###.##");

        System.out.print("Vetor A = ");
        for (int i=0; i< vetorA.length; i++) {
            System.out.print(vetorA[i] + " ");
        }
        System.out.println();
    }
}
