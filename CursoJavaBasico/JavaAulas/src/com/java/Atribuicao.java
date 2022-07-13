package com.java;

public class Atribuicao {
    public static void main(String[] args) {

       /* int x = 10;
        x = x + 15;

        int y = 10;
        y += 15;

        System.out.println(x);
        System.out.println(y); */

        int num = 0;
        int i = 0;


        System.out.println("Valor Original: " + num);
        num +=3;
        System.out.println("Valor de num: " + num);
        num *=4;
        System.out.println("Valor num: " + num);
        num /=2;
        System.out.println("Valor num: " + num);
        num %=2;
        System.out.println("Valor num: " + num);
        num -=3;

        // Todos chegam no mesmo resultado....
        System.out.println(i);
        i++;
        System.out.println(i);
        ++i;
        System.out.println(i);
        i = i + 1;
        System.out.println(i);


    }
}
