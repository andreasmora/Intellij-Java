    package com.java;

    public class Abajur {

        String modelo;
        String tensao;
        int potencia;
        String cor;
        String tipoLuz;
        int garantiaMes;
        String[] tipos;
        boolean tipoAbajur;

        boolean ligada;

        void ligar(){
            ligada = true;
        }
        void desligar(){
            ligada = false;
        }
        void mostrarEstado() {
            if (ligada) {
                System.out.println("Abajur esta ligado!!");
            } else {
                System.out.println("Abajur esta desligada");
            }
        }
        void mudarEstado() {
              if (ligada){
                  desligar();
              } else {
                  ligar();
              }


        }
    }
