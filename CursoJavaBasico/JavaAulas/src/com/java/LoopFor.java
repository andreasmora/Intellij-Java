package com.java;

public class LoopFor {
    public static void main(String[] args) {

        // System.out.println("FOR COM UMA VARIAVEL");

       /* System.out.println("Com ordem crescente!");

        for (int i = 0; i <= 5; i++){
            System.out.println("i tem valor: " + i);

        }
            System.out.println("Agora com ordem decrescente!");

        for (int i = 5; i >= 0; i--){
            System.out.println("i tem valor: " + i);

        } */

        // FOR COM MAIS DE UMA VARIAVEL

        // System.out.println("comando ( FOR ) com mais de uma variavel!!");

        // for (int i = 0, j = 10; i < j; i ++, j --) {
        //  System.out.println("i tem valor: " + i + " ; j tem valor: " + j);
        // }

        // COMANDO FOR COM PARTES AUSENTES.

        //System.out.println("COMANDO FOR COM PARTES AUSENTES");

        /*int count = 0;
        for (; count < 10 ;){
            System.out.println("count tem valor: " + count);
            count += 2;
        } */

        // OUTRA FORMA DE CHEGAR NO MESMO RESULTADO

        System.out.println("OUTRA FORMA DE CHEGAR NO MESMO RESULTADO");
        for (int cont = 0; cont < 10; cont += 2){
            System.out.println("cont tem valor: " + cont);
        }
       // LOOP SEM CORPO

        int soma = 0;
        for (int i = 1; i < 5; soma += i++){
            System.out.println("O valor da soma e: " + soma);
        }

    }
}
