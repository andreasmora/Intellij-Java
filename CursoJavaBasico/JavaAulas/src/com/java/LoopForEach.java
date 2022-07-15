package com.java;

import java.util.Random;

public class LoopForEach {
    public static void main(String[] args) {
        //Scanner scan = new Scanner(System.in);

        int[] notas = new int[10];
        Random random = new Random();

        for (int i=0; i<notas.length; i++){
            notas[i] = random.nextInt(10);
        }
        for (int i=0; i< notas.length; i++){ // mesmo resultado do for each
            int nota = notas[i];
            System.out.println(nota);
        }

        System.out.println("Uando o for each"); // uma forma mais simplificada mas nao conseguimos usar
        // Scanner devido a outra teoria do java em questao dos tipos int ser considerado valores. Ex
        // int, char, boolean, float
        // for each pode ser usando para setar output de valores...

        for (int nota : notas){
            System.out.println(nota);
        }

        // exemplo 02

        System.out.println("Exemplo com arrays multidimensionais!!!");
        double[][] notasAlunos = new double[5][4];

        notasAlunos[0][0] = 10;
        notasAlunos[0][1] = 7;
        notasAlunos[0][2] = 8;
        notasAlunos[0][3] = 9.5;

        notasAlunos[1][0] = 9;
        notasAlunos[1][1] = 8;
        notasAlunos[1][2] = 7;
        notasAlunos[1][3] = 8; // mudando a nota

        notasAlunos[2][0] = 8;
        notasAlunos[2][1] = 9;
        notasAlunos[2][2] = 10;
        notasAlunos[2][3] = 7;

        notasAlunos[3][0] = 7;
        notasAlunos[3][1] = 10;
        notasAlunos[3][2] = 7.5;
        notasAlunos[3][3] = 8;

        notasAlunos[4][0] = 5;
        notasAlunos[4][1] = 8;
        notasAlunos[4][2] = 7;
        notasAlunos[4][3] = 8.5;

        for (double[] notasAluno : notasAlunos){
            for (double nota : notasAluno){
                System.out.print(nota + " ");
            }
            System.out.println();
        }

    }
}
