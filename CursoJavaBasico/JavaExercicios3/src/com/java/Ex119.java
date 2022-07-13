//. Gere e imprima uma matriz M 10x10 com valores aleatórios entre
//0-9. Após isso indique qual é o maior e o menor valor da linha 5 e
//qual é o maior e o menor valor da coluna 7.

    package com.java;

    import java.util.Random;
    import java.util.Scanner;

    public class Ex119 {
        public static void main(String[] args) {
            //Scanner scan = new Scanner(System.in);

            int[][] numerosAleatorios = new int[10][10];

            Random numerosRandom = new Random();

            for (int i=0; i<numerosAleatorios.length; i++){
                for (int j=0; j<numerosAleatorios[i].length; j++){
                    numerosAleatorios[i][j] = numerosRandom.nextInt(100);
                }
            }

            for (int i=0; i<numerosAleatorios.length; i++) {
                for (int j = 0; j < numerosAleatorios[i].length; j++) {
                    System.out.print(numerosAleatorios[i][j] + " ");

                }
                System.out.println();
            }

            int maiorLinha5 = 0;
            int menorLinha5 = 101;
            int linha5 = 5;

            for (int i=0; i<numerosAleatorios[linha5].length; i++){
                if (numerosAleatorios[linha5][i] > maiorLinha5) {
                    maiorLinha5 = numerosAleatorios[linha5][i];
                }
                if (numerosAleatorios[linha5][i] < menorLinha5){
                    menorLinha5 = numerosAleatorios[linha5][i];

                }
            }
            System.out.println("Maior valor da linha 5: " + maiorLinha5);
            System.out.println("Menor valor da linha 5: " + menorLinha5);


            int maiorColuna7 = 0;
            int menorColuna7 = 101;
            int coluna7 = 7;

            for (int i=0; i<numerosAleatorios.length; i++){
                if (numerosAleatorios[i][coluna7] > maiorColuna7) {
                    maiorColuna7 = numerosAleatorios[i][coluna7];
                }
                if (numerosAleatorios[i][coluna7] < menorColuna7){
                    menorColuna7 = numerosAleatorios[i][coluna7];

                }
            }

            System.out.println("Maior valor da coluna 7: " + maiorColuna7);
            System.out.println("Menor valor da coluna 7: " + menorColuna7);


    }
}
