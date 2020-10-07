package com.bocalini.lucas.exercicio3;

public class PortaTeste {
    public static void main(String[] args) {

        Porta porta = new Porta();

        porta.setCor("Verniz");
        porta.setDimensaoX(4);
        porta.setDimensaoY(2);
        porta.setDimensaoZ(0.6);
        porta.setAberta(true);


        System.out.println(porta.isAberta());
        System.out.println(porta.toString());
    }
}
