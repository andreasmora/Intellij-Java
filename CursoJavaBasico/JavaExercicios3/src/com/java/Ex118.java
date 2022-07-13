//Gere e imprima uma matriz M 4x4 com valores aleatórios entre 0-
//9. Após isso determine o maior número da matriz e a sua posição
//(linha, coluna).

    package com.java;

    import java.util.Random;
    import java.util.Scanner;

    public class Ex118 {
        public static void main(String[] args) {
            //Scanner scan = new Scanner(System.in);

            int[][] numerosAleatorios = new int[4][4];

            Random numeroRandom = new Random(); // funcao valores aleatorios

            for (int i=0; i<numerosAleatorios.length; i++){
                for (int j=0; j<numerosAleatorios[i].length; j++) {
                numerosAleatorios[i][j] = numeroRandom.nextInt(100);

                }
            }

            int maior = 0;
            int linha = 0;
            int coluna = 0;

            for (int i=0; i<numerosAleatorios.length; i++){
                for (int j=0; j<numerosAleatorios[i].length; j++) {
                    if (numerosAleatorios[i][j] > maior){
                        maior = numerosAleatorios[i][j];
                        linha = i;
                        coluna = j;
                    }

                }
            }

            System.out.println("Maior valor: " + maior);
            System.out.println("Linha: " + linha);
            System.out.println("Coluna: " + coluna);






        }
    }
