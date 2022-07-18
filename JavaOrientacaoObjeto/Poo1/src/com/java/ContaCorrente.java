// Crie um classe para representar um conta corrente que possui um numero, um
// saldo, um status que informa se ela e especial, ou nao, um  limite.

    package com.java;

    public class ContaCorrente {
        public static void main(String[] args) {

            Conta conta = new Conta();
            conta.numero = "123456";
            conta.agencia = "1234";
            conta.especial = true;
            conta.limiteEspecial = 500;
            conta.saldo = -10;

            System.out.println("Saldo da conta: " + conta.numero + " = " + conta.saldo);

        }
    }
