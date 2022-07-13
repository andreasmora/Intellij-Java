
package com.java;
    import java.util.Scanner;

    public class Ex013 {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            System.out.println("Entre com o valor/hora: ");
            double valorHora = scan.nextDouble();

            System.out.println("Entre com a quantidade de horas trabalhadas: ");
            double horas = scan.nextDouble();

            double salarioBruto = valorHora * horas;
            double inss = (salarioBruto / 100) * 8;
            double sindicato = (salarioBruto / 100) * 5;
            double ir = (salarioBruto / 100) * 11;
            double totalDescontos = inss + sindicato + ir * 11;
            double salarioLiquido = salarioBruto - totalDescontos;


            System.out.println("Seu salario : " + salarioBruto);
            System.out.println("O INSS e : " + inss);
            System.out.println("O sindicato e : " + sindicato);
            System.out.println("O IR : " + ir);
            System.out.println("O total de descontos : " + totalDescontos);
            System.out.println("O salario liquido : " + salarioLiquido);
        }
    }
