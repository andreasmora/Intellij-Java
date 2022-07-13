package com.java;

import java.util.Scanner;

    public class Continue {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);

            int num;
            int max;

            System.out.println("Entre com um numero: ");
            num = scan.nextInt();

            System.out.println("Entre com um limite: ");
            max = scan.nextInt();

            for (int i=num; i<=max; i ++){
                if (i % 7 == 0){
                    continue;
                }
                System.out.println("O valor de i e->" + i);

            }
        }
    }
