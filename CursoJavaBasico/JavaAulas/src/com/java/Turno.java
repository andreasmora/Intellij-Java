package com.java;

import java.util.Scanner;

public class Turno {
    public static void main(String[] args) {
        int turno;
        int opcao = 0;

        System.out.println("1- MATUTINO, 2- VESPERTINO, 3- NOTURNO");
        opcao = new Scanner(System.in).nextInt();
        switch (opcao) {
            case 1:
                System.out.println("Bom Dia!!");
                break;
            case 2:
                System.out.println("Boa Tarde!!");
                break;
            case 3:
                System.out.println("Boa Noite");
                break;
        }
    }
}