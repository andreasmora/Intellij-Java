package com.java;

import java.util.Scanner;

public class BreakEContinue {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num;
        int max;

        System.out.println("Entre com um numero: ");
        num = scan.nextInt();

        System.out.println("Entre com um limite: ");
        max = scan.nextInt();

        for (int i=num; i<=max; i ++){
            System.out.println(i);
            if (i % 7 == 0){
                System.out.println("O Valor de i e: " + i);
                break;
            }
        }



    }
}
