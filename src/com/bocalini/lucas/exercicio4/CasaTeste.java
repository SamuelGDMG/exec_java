package com.bocalini.lucas.exercicio4;

import com.bocalini.lucas.exercicio3.Porta;

public class CasaTeste {
    public static void main(String[] args) {

        Casa casa = new Casa();
        Porta porta1 = new Porta();


        porta1.setCor("Verniz");
        porta1.setDimensaoX(4);
        porta1.setDimensaoY(2);
        porta1.setDimensaoZ(0.6);
        porta1.setAberta(false);

        casa.setPorta1(porta1);

        Porta porta2 = new Porta();


        porta2.setCor("Preto");
        porta2.setDimensaoX(8);
        porta2.setDimensaoY(6);
        porta2.setDimensaoZ(1);
        porta2.setAberta(true);

        casa.setPorta2(porta2);


        Porta porta3 = new Porta();


        porta3.setCor("Marrom");
        porta3.setDimensaoX(5);
        porta3.setDimensaoY(3);
        porta3.setDimensaoZ(2);
        porta3.setAberta(true);

        casa.setPorta3(porta3);
        casa.quantasPortasEstaoAbertas();
        System.out.println(casa.quantasPortasEstaoAbertas());
    }
}
