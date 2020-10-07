package com.bocalini.lucas.exercicio3;

public class Porta {
    public boolean aberta;
    public String cor;
    public double dimensaoX;
    public double dimensaoY;
    public double dimensaoZ;

    public boolean isAberta() {
        return aberta;
    }

    public void setAberta(boolean aberta) {
        this.aberta = aberta;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public double getDimensaoX() {
        return dimensaoX;
    }

    public void setDimensaoX(float dimensaoX) {
        this.dimensaoX = dimensaoX;
    }

    public double getDimensaoY() {
        return dimensaoY;
    }

    public void setDimensaoY(float dimensaoY) {
        this.dimensaoY = dimensaoY;
    }

    public double getDimensaoZ() {
        return dimensaoZ;
    }

    public void setDimensaoZ(double dimensaoZsaoZ) {
        this.dimensaoZ = dimensaoZ;
    }


    void abre(){
    aberta = true;
    }


    void fecha(){
    aberta = false;
    }


    void pinta(String s){
    cor = s;
    }


    String estaAberta(){
       if (aberta){
       return "aberta";
       }
       else{
           return "fechada";
       }
    }

    @Override
    public String toString() {
        return "Porta{" +
                "aberta=" + aberta +
                ", cor='" + cor + '\'' +
                ", dimensaoX=" + dimensaoX +
                ", dimensaoY=" + dimensaoY +
                ", dimensaoZ=" + dimensaoZ +
                '}';
    }
}
