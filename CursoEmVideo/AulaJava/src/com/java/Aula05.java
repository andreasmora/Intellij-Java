package com.java;

import java.util.Scanner;

public class Aula05 {
    public static void main(String[] args) {
        Scanner in;
        in = new Scanner(System.in);

        int idade;
        String apelido;

        System.out.println("Qual sua idade? ");
        idade = in.nextInt();
        System.out.println("Qual seu apelido: ");
        apelido = in.next();

        //System.out.println("Sua idade e: " + idade);
        System.out.println(apelido + " tem " + idade + " anos de idade!!!");



        in.close();

    }
}
