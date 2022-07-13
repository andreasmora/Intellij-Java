package com.java;

import java.util.Scanner;

    public class Array {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);

            double[] temperaturas = new double[365];
            temperaturas[0] = 31.3;
            temperaturas[1] = 33;
            temperaturas[2] = 33.7;
            temperaturas[3] = 34.3;
            temperaturas[4] = 33.1;

            System.out.println("O valor da temperatura do dia 1 e: " + temperaturas[0]);
            System.out.println("O tamanho do array: " + temperaturas.length);
            System.out.println("Valores de array: ");

            for (int i=0; i<temperaturas.length; i++){
                System.out.println("O valor da temperatura do dia " + (i+1) + " e-> " + temperaturas[i]);
            }
            for (double temp : temperaturas){
                System.out.println(temp);
            }
        }
    }
