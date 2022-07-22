// Desenvolva um algoritimo para calcular a area de um triangulo.
// pensar nas variaveis que serao necessarias. e no final informar a area total
// do triangulo.

package com.java;

import java.util.Scanner;

public class Aula06 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        float area, base, altura;


        System.out.println("Informe a base e a altura do triangulo: ");
        base = in.nextFloat();
        altura = in.nextFloat();


        area = (base * altura) / 2;

        System.out.println("A area do triangulo e: " + area);
    }
}
