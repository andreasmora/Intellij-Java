// Foi realizado uma pesquisa entre os funcionarios de uma dada empresa, Foram recolhidos od dados de altura, sexo,
// (M/F), e salario de 20 funcionarios. Contrua um programa que informe:

// a media de salario do grupo;
// maior e menor altura
// a quantidade de mulheres com salario ate R$1.000,00


package com.java;

import java.util.Scanner;

public class Ex115 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int contador = 1, qtdMulheres = 0;
        float altura, maiorAltura = 0, menorAltura = 0;
        char sexo;
        double salario, mediaSalario = 0;


        while (contador <= 20){

            // leitura dos dados....
            System.out.println(contador + " funcionario: ");
            System.out.println("Digite a altura: ");
            altura = scan.nextFloat();

            System.out.println("Digite o sexo: ");
            sexo = scan.next().charAt(0);

            System.out.println("Digite seu salario: ");
            salario = scan.nextDouble();

            //Verificacoes...

            mediaSalario += salario;

            if (altura > maiorAltura)
                maiorAltura = altura;
            if (altura < menorAltura || contador == 1)
                menorAltura = altura;
            if (sexo == 'f' && salario < 1000)
                qtdMulheres++;


            contador++;
        }
        mediaSalario /= (contador - 1);

        System.out.println("Media Salarial: " + mediaSalario);
        System.out.println("Maior Altura: " + maiorAltura);
        System.out.println("Menor Altura: " + menorAltura);
        System.out.println("Mulheres com salarios ate 1000 : " + qtdMulheres);

    }
}
