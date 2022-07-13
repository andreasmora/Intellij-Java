package com.java;

import java.util.Scanner;

public class Condicionais {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Entre com sua idade: ");

        int idade = scan.nextInt();
        if (idade >= 18){
            System.out.println("Voce e maior de idade!!");
        } else {
            System.out.println("Voce e menor de idade!!");
        }
        // barato <=10
        // 10 < valor < 15 - pedir desconto
        //15 <= valor 17 - pesquisar mais
        //>= 17 - muito caro



    }
}
