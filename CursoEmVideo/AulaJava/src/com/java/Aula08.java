package com.java;

import java.util.Scanner;

public class Aula08 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int valorA, valorB;
        valorA = 5;
        valorB = 3;
        int resultado;

        resultado = valorA + valorB;
        System.out.printf("%d + %d = %d\n", valorA, valorB, resultado);

        resultado = valorA / valorB;
        System.out.printf("%d / %d = %d\n", valorA, valorB, resultado);

        resultado = valorA * valorB;
        System.out.printf("%d * %d = %d\n", valorA, valorB, resultado);

        resultado = valorA - valorB;
        System.out.printf("%d - %d = %d\n", valorA, valorB, resultado);

        // cuidados com int vs Float/Double...

        float floatA, floatB;
        floatA = 5;
        floatB = 3.0f;
        float result;

        result = floatA + floatB;
        System.out.printf("%f + %f = %f\n", floatA, floatB, result);

        result = floatA / floatB;
        System.out.printf("%f / %f = %f\n", floatA, floatB, result);

        result = floatA * floatB;
        System.out.printf("%f * %f = %f\n", floatA, floatB, result);

        result = floatA - floatB;
        System.out.printf("%f - %f = %f\n", floatA, floatB, result);






    }
}
