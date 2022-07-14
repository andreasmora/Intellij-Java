// Faça um programa para jogar o jogo da velha. O programa deve
//permitir que dois jogadores façam uma partida do jogo da velha,
//usando o computador para ver o tabuleiro. Cada jogador vai
//alternadamente informando a posição onde deseja colocar a sua
//peça (‘O’ ou ‘X’). O programa deve impedir jogadas inválidas e
//determinar automaticamente quando o jogo terminou e quem foi o
//vencedor (jogador1 ou jogador2). A cada nova jogada, o programa
//deve atualizar a situação do tabuleiro na tela.

    package com.java;

    import java.util.Scanner;

    public class Ex123 {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);

            char[][] jogoDaVelha = new char[3][3];

            System.out.println("Jogador 1 = X ");
            System.out.println("Jogador 2 = O ");

            boolean ganhou = false;
            int jogada = 1;
            char sinal;
            int linha = 0, coluna = 0;

            while (!ganhou) {
                if (jogada % 2 == 1) { // jogador 1

                    System.out.println("Vez do jogador 1. Escolha linha e coluna (1-3) ");
                    sinal = 'x';
                } else {
                    System.out.println("Vez do jogador 2. Escolha linha e coluna (1-3) ");
                    sinal = 'O';

                }

                boolean linhaValida = false;
                while (!linhaValida) {
                    System.out.println("Entre com a linha (1,2 ou 3)");
                    linha = scan.nextInt();
                    if (linha >= 1 && linha <= 3) {
                        linhaValida = true;
                    } else {
                        System.out.println("Entrada invalida, digite novamente.");
                    }
                }

                boolean colunaValida = false;
                while (!colunaValida) {
                    System.out.println("Entre com a coluna (1,2 ou 3) ");
                    coluna = scan.nextInt();
                    if (coluna >= 1 && coluna <= 3) {
                        colunaValida = true;
                    } else {
                        System.out.println("Entrada invalida, digite novamente.");
                    }
                }
                linha--;
                coluna--;

                if (jogoDaVelha[linha][coluna] == 'X' || jogoDaVelha[linha][coluna] == 'O') {
                    System.out.println("Posicao ja usada, tente novamente: ");
                } else { // jogada valida......
                    jogoDaVelha[linha][coluna] = sinal;
                    jogada++;

                }
                // imprimir tabuleiro....
                for (int i = 0; i < jogoDaVelha.length; i++) {
                    for (int j = 0; j < jogoDaVelha[i].length; j++) {
                        System.out.print(jogoDaVelha[i][j] + " | ");
                    }
                    System.out.println();
                }

                // verifica se tem ganhador...
                if ((jogoDaVelha[0][0] == 'X' && jogoDaVelha[0][1] == 'X' && jogoDaVelha[1][2] == 'X') || // linha 1
                        (jogoDaVelha[1][0] == 'X' && jogoDaVelha[1][1] == 'X' && jogoDaVelha[1][2] == 'X') || //linha 2
                        (jogoDaVelha[2][0] == 'X' && jogoDaVelha[2][1] == 'X' && jogoDaVelha[2][2] == 'X') || //linha 3
                        (jogoDaVelha[0][0] == 'X' && jogoDaVelha[1][0] == 'X' && jogoDaVelha[2][0] == 'X') || //coluna 1
                        (jogoDaVelha[0][1] == 'X' && jogoDaVelha[1][1] == 'X' && jogoDaVelha[2][1] == 'X') || //coluna 2
                        (jogoDaVelha[0][2] == 'X' && jogoDaVelha[1][2] == 'X' && jogoDaVelha[2][2] == 'X') || //coluna 3
                        (jogoDaVelha[0][0] == 'X' && jogoDaVelha[1][1] == 'X' && jogoDaVelha[2][2] == 'X') || //diagonal
                        (jogoDaVelha[0][2] == 'X' && jogoDaVelha[1][1] == 'X' && jogoDaVelha[2][0] == 'X')) {  //diagonal inversa
                    ganhou = true;
                    System.out.println("Parabens, jogador 1 ganhou!!!");
                } else if ((jogoDaVelha[0][0] == 'O' && jogoDaVelha[0][1] == 'O' && jogoDaVelha[0][2] == 'O') ||     //linha 1
                        (jogoDaVelha[1][0] == 'O' && jogoDaVelha[1][1] == 'O' && jogoDaVelha[1][2] == 'O') || //linha 2
                        (jogoDaVelha[2][0] == 'O' && jogoDaVelha[2][1] == 'O' && jogoDaVelha[2][2] == 'O') || //linha 3
                        (jogoDaVelha[0][0] == 'O' && jogoDaVelha[1][0] == 'O' && jogoDaVelha[2][0] == 'O') || //coluna 1
                        (jogoDaVelha[0][1] == 'O' && jogoDaVelha[1][1] == 'O' && jogoDaVelha[2][1] == 'O') || //coluna 2
                        (jogoDaVelha[0][2] == 'O' && jogoDaVelha[1][2] == 'O' && jogoDaVelha[2][2] == 'O') || //coluna 3
                        (jogoDaVelha[0][0] == 'O' && jogoDaVelha[1][1] == 'O' && jogoDaVelha[2][2] == 'O') || //diagonal
                        (jogoDaVelha[0][2] == 'O' && jogoDaVelha[1][1] == 'O' && jogoDaVelha[2][0] == 'O')) {  //diagonal inversa
                    ganhou = true;
                    System.out.println("Parabens, jogador 2 ganhou!!!");


                } else if (jogada > 9) {
                    ganhou = true;
                    System.out.println("Ninguem ganhou essa partida!!!");
                }
            }

        }

    }
    
