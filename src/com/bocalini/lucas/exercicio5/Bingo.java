package com.bocalini.lucas.exercicio5;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Bingo {
    public static void main(String[] args) {
        int acertos = 0;

        int matriz[][] = new int[6][4];
        Random random = new Random();

        List<Integer> numerosexistente = new ArrayList<Integer>();

        int contagem = 0;

        for(int i = 0; i < 6; i++){
            for (int j = 0; j < 4; j++) {

                boolean response;
                int aux;

                do {
               aux = random.nextInt(75);
               response = verificarVetor(numerosexistente, aux);
               if (!response){
                   numerosexistente.add(aux);
               }
           }   while (response);

                matriz[i][j] = aux;


            }
        }

        List<Integer> listanumeros = new ArrayList<Integer>();

        for(int i = 0; i < 6; i++){
            for (int j = 0; j < 4; j++) {

                System.out.print(matriz[i][j]+"|");
            }
            System.out.println();
        }

        List<Integer> listarodadas = new ArrayList<Integer>();


        while (acertos <= 24){

            int nrandom = random.nextInt(75);

            boolean response = verificar(matriz,nrandom);
            boolean verificarRodadaValida;





                verificarRodadaValida = verificarVetor(listarodadas, nrandom);



                if (!verificarRodadaValida){

                    listarodadas.add(nrandom);
                    contagem++;
                    System.out.println(listarodadas.toString());

                }





            if (response){
                acertos+=1;
                listanumeros.add(nrandom);

            }
        }
        listarodadas.sort(null);
        Collections.sort(listarodadas);

        System.out.println(listarodadas.toString());

        for(int i = 0; i < 6; i++){
            for (int j = 0; j < 4; j++) {

                System.out.print(matriz[i][j]+"|");
            }
            System.out.println();
        }

        System.out.println("Quantidade de Rodadas: " + contagem);

    }

    static boolean verificar (int[][] matriz, int number ){

        boolean numeroexiste = false;

        for(int i = 0; i < 6; i++){
            for (int j = 0; j < 4; j++) {

                if (matriz [i][j] == number){
                    numeroexiste = true;
                }
            }

        }
        return numeroexiste;
    }


    static boolean verificarVetor (List<Integer> list, int numeroaleatorio){
    for (int i = 0; i < list.size(); i++){

        if(list.get(i)==(numeroaleatorio)){

            return true;
        }
    }
    return false;

    }



}
