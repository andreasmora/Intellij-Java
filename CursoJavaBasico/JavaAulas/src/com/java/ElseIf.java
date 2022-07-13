package com.java;

import java.util.Scanner;

public class ElseIf {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("1-Domingo, 2-Segunda, 3-Terca, 4-Quarta, 5-Quinta, 6-Sexta, 7-Sabado!!");
        System.out.println("Entre com um dia da semana: ");

        int diaSemana = scan.nextInt();
        if (diaSemana == 1){
            System.out.println("Domingo");
        } else if (diaSemana == 2) {
            System.out.println("Segunda");
        } else if (diaSemana == 3) {
            System.out.println("Terca");
        } else if (diaSemana == 4) {
            System.out.println("Quarta");
        } else if (diaSemana == 5) {
            System.out.println("Quinta");
        } else if (diaSemana == 6) {
            System.out.println("Sexta");;
        } else if (diaSemana == 7) {
            System.out.println("Sabado");
        } else {
            System.out.println("Nao e um dia da semana valido!!");
        }
    }
}
