package com.java;

import java.util.Scanner;

public class Aula11 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // ESTRUTURA DE REPETIÇÃO....

        int numero;

        // enquanto o input for >=0, repito...
        /*
        while (numero >= 0) {
            System.out.println("informe um valor: ");
            numero = in.nextInt();

        }
        System.out.println("Estou fora da repeticao..");*/

        //REPITA/FACA.... ENQUANTO O INPUT FOR >= 0.

        do {
            System.out.println("Informe um valor: ");
            numero = in.nextInt();
        } while (numero >=0);

        System.out.println("Fim da repeticao!!");
    }
}
