// Crie um classe para representar um conta corrente que possui um numero, um
// saldo, um status que informa se ela e especial, ou nao, um  limite. Desenvolva metodos para realizar
//saques( Verificando se o cliente pode realizar saques). depositar dinheiro, consultar saldo, e verificar
// se o cliente esta usando cheque especial ou nao. Desenvolva um programa para testar essa classe.

    package com.java;
    // CLASSE DE TESTE
    public class ContaTeste {
        public static void main(String[] args) {

            Conta conta = new Conta();
            conta.numero = "123456";
            conta.agencia = "1234";
            conta.especial = true;
            conta.limiteEspecial = 500;
            conta.saldo = -10;

            System.out.println("Saldo da conta: " + conta.numero + " = " + conta.saldo);

            boolean saqueEfetuado = conta.realizarSaque(10);

            if (saqueEfetuado){
                System.out.println("saque efetuado com sucesso: ");
                conta.consultarSaldo();
            } else {
                System.out.println("Saldo insuficiente!!");
            }

            saqueEfetuado = conta.realizarSaque(500);
            System.out.println("Tentativa de saque de 500 reais. ");
            if (saqueEfetuado){
                System.out.println("Saque efetuado com sucesso!");
                conta.consultarSaldo();
            } else {
                System.out.println("Nao foi possivel, saldo insuficiente.");
            }

            System.out.println("Deposito de 500 reais.");
            conta.depositar(500);
            conta.consultarSaldo();

            if (conta.verificarUsoChequeEspecial()){
                System.out.println("Esta usando cheque especial");
            } else {
                System.out.println("Nao esta usando cheque especial");
            }

            conta.realizarSaque(600);
            conta.consultarSaldo();
            if (conta.verificarUsoChequeEspecial()){
                System.out.println("Esta usando cheque especial");
            } else {
                System.out.println("Nao esta usando cheque especial");
            }

        }
    }
