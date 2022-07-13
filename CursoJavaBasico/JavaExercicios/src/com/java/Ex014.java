    // faca um programa que peca o tamanho de um arquivo para download em MB
    // e a velocidade de um link de internet ( em MBPS) calcule e informe o
    //tempo aproximado de download do arquivo usando este link em minutos.

    package com.java;
    import java.util.Scanner;

    public class Ex014 {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);

            System.out.println("Digite o tamanho do arquivo: ");
                double tamArquivo = scan.nextDouble();
            System.out.println("Entre com a velocidade da internet: ");
                double veloInternet = scan.nextDouble();

            double tempo = tamArquivo / veloInternet;
            System.out.println("O tempo aproximado de download do arquivo e: " + tempo);

        }
    }
