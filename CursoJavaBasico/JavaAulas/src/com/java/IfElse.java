package com.java;// barato <=10
// 10 < valor < 15 - pedir desconto
//15 <= valor 17 - pesquisar mais
//>= 17 - muito caro

import java.util.Scanner;

public class IfElse {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Ente com o preco do produto: ");
        double valor = scan.nextDouble();
        if (valor <= 10) {
            System.out.println("Aproveita para levar que o produto esta barato! ");
        } else if (valor > 10 && valor < 15 ){
            System.out.println("Pedir desconto! ");
        } else if (valor >= 15 && valor < 17) {
            System.out.println("Pesquisar mais! ");
        } else {  // valor >= 17
            System.out.println("Muito caro, compre em outro lugar! ");
        }

    }
}
