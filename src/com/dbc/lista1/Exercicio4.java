package com.dbc.lista1;

import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        /*Criar um algoritmo onde o usuário possa escolher o estado, escolhido haverá uma lista com determinadas
        cidades onde ele colocará o nome da cidade e poderá aparecer dados sobre a cidade escolhida
        (população, principal festa, IDH...). OBS: Deverá conter 3 estados e para cada estado 2 cidades.
         */


        int populacaoFortaleza = 2643247;
        int populacaoMaracanau = 213404;
        int populacaoRecife = 1653461;
        int populacaoOlinda = 393115;
        int populacaoSalvador = 3957123;
        int populacaoVitoriaConq = 341128;

        float idhFor = 0.754f;
        float idhMar = 0.736f;
        float idhRec = 0.772f;
        float idhOlin = 0.735f;
        float idhSalv = 0.660f;
        float idhVC = 0.678f;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Escolha um Estado:");
        System.out.println("(1) Ceará");
        System.out.println("(2) Pernambuco");
        System.out.println("(3) Bahia");

        int estado = scanner.nextInt();


        switch (estado) {

            case 1:
                System.out.println("Escolha uma cidade:");
                System.out.println("(1) Fortaleza");
                System.out.println("(2) Maracanaú");
                int cidadeCeara = scanner.nextInt();
                 if(cidadeCeara == 1) {
                     System.out.println("População de Fortaleza: "+ populacaoFortaleza);
                     System.out.println("Indice de Desenvolvimento Humano: " + idhFor);
                 } else if (cidadeCeara == 2) {
                     System.out.println("População de Maracanaú: " + populacaoMaracanau);
                     System.out.println("Indice de Desenvolvimento Humano: " + idhMar);
                 }
                 break;

            case 2:
                System.out.println("Escolha uma cidade:");
                System.out.println("(1) Recife");
                System.out.println("(2) Olinda");
                int cidadePernambuco = scanner.nextInt();
                if (cidadePernambuco == 1) {
                    System.out.println("População de Recife: " +populacaoRecife);
                    System.out.println("Indice de Desenvolvimento Humano: " + idhRec);
                } else if (cidadePernambuco == 2) {
                System.out.println("População de Olinda:" + populacaoOlinda);
                    System.out.println("Indice de Desenvolvimento Humano: " + idhOlin);
            }
                break;

            case 3:
                System.out.println("Escolha uma cidade:");
                System.out.println("(1) Salvador");
                System.out.println("(2) Vitória da Conquista");
                int cidadeBahia = scanner.nextInt();
                if (cidadeBahia == 1) {
                    System.out.println("População de Salvador: " + populacaoSalvador);
                    System.out.println("Indice de Desenvolvimento Humano: " + idhSalv);
                } else if(cidadeBahia == 2) {
                    System.out.println("População de Vitória da Conquista: " + populacaoVitoriaConq);
                    System.out.println("Indice de Desenvolvimento Humano: " + idhVC);
                }

                break;



        }
    }
}
