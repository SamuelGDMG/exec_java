package com.bocalini.lucas.exercicio4;

import com.bocalini.lucas.exercicio3.Porta;

public class Casa {

    public String cor;
    public Porta porta1;
    public Porta porta2;
    public Porta porta3;

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public Porta getPorta1() {
        return porta1;
    }

    public void setPorta1(Porta porta1) {
        this.porta1 = porta1;
    }

    public Porta getPorta2() {
        return porta2;
    }

    public void setPorta2(Porta porta2) {
        this.porta2 = porta2;
    }

    public Porta getPorta3() {
        return porta3;
    }

    public void setPorta3(Porta porta3) {
        this.porta3 = porta3;
    }


    void pinta(String s){

    }


    int quantasPortasEstaoAbertas(){
        int qtd = 0;
        if(porta1.aberta){
            qtd += 1;
        }
        if(porta2.aberta){
            qtd += 1;
        }
        if(porta3.aberta){
            qtd += 1;
        }
        return qtd;
    }

}
