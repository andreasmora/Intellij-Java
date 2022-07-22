package com.java;

import java.util.Scanner;

public class Aula09 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        float valor1, valor2, resultado;

        System.out.println("Digite uma nota: ");
        valor1 = in.nextFloat();

        System.out.println("Digite outra nota: ");
        valor2 = in.nextFloat();

        resultado = (valor1 + valor2) / 2;

        boolean valorLogico = resultado >=7;
        System.out.println(valorLogico);

        if (valorLogico){
            System.out.println("Voce foi aprovado");
        }
        if (!valorLogico){
            System.out.println("Voce foi reprovado");

            System.out.println("Qual a nota da recuperacao: ");
            float novaNota = in.nextFloat();

            if (novaNota >= 7){
                System.out.println("Parabens voce conseguiu nova aprovacao!!");
            } else {
                System.out.println("Infelizmente vc foi reprovado!!");
            }

        }

       in.close();
    }
}
