// Escreva uma classe para representar uma lampada que esta a venda em um
//supermercado....

    package com.java;

    public class VendaLampada {
        public static void main(String[] args) {

            Lampada lampada = new Lampada();
            lampada.modelo = "A60";
            lampada.tensao = "Bivolt";
            lampada.garantiaMeses = 36;
            lampada.potencia = 7;
            lampada.cor = "Amarela";
            lampada.tipoLuz = "Amarela";
            lampada.tipoAbajur = true;

            lampada.tipos = new String[5];
            lampada.tipos[0] = "Abajur";
            lampada.tipos[1] = "Lampeoes";

            System.out.println("Lampada modelo: " + lampada.modelo);
            System.out.println("Garantia meses: " + lampada.garantiaMeses);



        }
    }
