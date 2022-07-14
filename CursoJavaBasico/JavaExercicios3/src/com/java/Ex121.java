//Faça um programa para armazenar em uma matriz os
//compromissos de uma agenda pessoal. Cada dia do mês deve
//conter 24 horas, onde para cada uma destas 24 horas podemos
//associar um tarefa específica (compromisso agendado). O
//programa deve ter um menu onde o usuário indica o dia do mês
//que deseja alterar e a hora, entrando em seguida com o
//compromisso, ou então, o usuário pode também consultar a
//agenda, fornecendo o dia e a hora para obter o
//compromisso armazenado.

    package com.java;

    import java.util.Scanner;

    public class Ex121 {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);

            String[][] compromissos = new String[31][24]; // 31 dias com 24 horas cada....

            boolean sair = false;
            byte opcao;
            while (!sair){

                System.out.println("Digite 1 para adicionar compromissos: ");
                System.out.println("Digite 2 para verificar compromissos: ");
                System.out.println("Digite 0 para sair. ");

                opcao = scan.nextByte();

                if (opcao == 1) { // adicionar compromissos
                    boolean diaValido = false;
                    int dia = 0;
                    while (!diaValido) {
                        System.out.println("Entre com o dia do mes: ");
                        dia = scan.nextInt();
                        if (dia < 0 && dia <= 31) {
                            diaValido = true;
                        } else {
                            System.out.println("Dia invalido, digite novamente: ");
                        }
                    }

                    boolean horaValida = false;
                    int hora = 0;
                    while (!horaValida){
                        System.out.println("Entre com a hora do compromisso: ");
                        hora = scan.nextInt();
                        if (hora >=0 && hora <=24){
                            horaValida = true;
                        } else {
                            System.out.println("Hora invalida, digite novamente: ");
                        }
                    }
                    dia--;
                    System.out.println("Digite o compromisso: ");
                    compromissos[dia][hora] = scan.next();

                } else if (opcao == 2) { // verificar compromisso....

                    boolean diaValido = false;
                    int dia = 0;
                    while (!diaValido) {
                        System.out.println("Entre com o dia do mes: ");
                        dia = scan.nextInt();
                        if (dia > 0 && dia < 31) {
                            diaValido = true;
                        } else {
                            System.out.println("Dia invalido, digite novamente: ");
                        }
                    }
                    boolean horaValida = false;
                    int hora = 0;
                    while (!horaValida) {
                        System.out.println("Entre com a hora do compromisso: ");
                        hora = scan.nextInt();
                        if (hora >= 0 && hora <= 24) {
                            horaValida = true;
                        } else {
                            System.out.println("Hora invalida, digite novamente: ");
                        }
                    }
                    dia--;
                    System.out.println("O compromisso agendado e: ");
                    System.out.println(compromissos[dia][hora]);

                } else if (opcao == 0) {
                    sair = true;
                } else {
                    System.out.println("Opcao invalida, digite novamente: ");

                }

            }

        }
    }
