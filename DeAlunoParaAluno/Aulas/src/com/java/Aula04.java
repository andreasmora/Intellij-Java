package com.java;

import java.util.Scanner;

public class Aula04 {
    public static void main(String[] args) {

        int sexo, qtdMulheres = 0, qtdHomens = 0;
        float altura, somaHomens = 0, somaMulheres = 0;
        float mediaHomens = 0, mediaMulheres = 0;
        float maior = 0, menor = 0;


        Scanner scan = new Scanner(System.in);

        for (int i=0; i<3; i++){
            System.out.println("Escolha o sexo da pessoa (1- Mulher, 2- Homem): ");
            sexo = scan.nextInt();
            System.out.println("Digite a altura: ");
            altura = scan.nextFloat();
            if (sexo == 1){
                qtdMulheres++;
            }else if (sexo == 2){
                qtdHomens++;

                somaHomens = somaHomens + altura;
                somaMulheres = somaMulheres + altura;

            } else {
                System.out.println("Opcao de sexo invalida!!");
            }
            if (altura > maior){
                maior = altura;
            } else if (altura < menor) {
                menor = altura;
            }
        }
        mediaHomens = somaHomens / qtdHomens;
        mediaMulheres = somaMulheres / qtdMulheres;

        System.out.println("A maior altura do grupo e de " + maior + " m, e a menor e de " + menor + " m");
        System.out.println("A media de altura dos Homens " + mediaHomens + " m");
        System.out.println("A media de altura das Mulheres " + mediaMulheres + " m");
        System.out.println("O numero de mulheres e " + qtdMulheres);

        scan.close();

    }
}
