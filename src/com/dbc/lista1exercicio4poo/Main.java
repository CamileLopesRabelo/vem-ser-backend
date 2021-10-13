package com.dbc.lista1exercicio4poo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Estado estados[] = getListaEstados();

        System.out.println("Escolha um estado: ");

        for (int i=0;i < estados.length;i++) {
            System.out.println(i + 1 + " - " + estados[i].getNome());
        }
        int est = scanner.nextInt(); //Ceara
        est = est-1;

        System.out.println("Escolha uma cidade:");
        for (int i =0;i < estados[est].getCidades().length;i++) {
            System.out.println(i + 1 + " - " + estados[est].getCidades()[i].getNome());
        }
        int cid = scanner.nextInt();
        cid = cid - 1;
        System.out.println(estados[est].getCidades()[cid].getNome());
        System.out.println(estados[est].getCidades()[cid].getQtdPopulação());
        System.out.println(estados[est].getCidades()[cid].getIdh());
        System.out.println(estados[est].getCidades()[cid].getPontosTuristicos());

    }

    public static Estado[] getListaEstados(){
        Estado est1 = new Estado();
        est1.setNome("Ceará");

        Cidade ceara1 = new Cidade();
        ceara1.setNome("Fortaleza");
        ceara1.setQtdPopulação("2,7 milhões de habitantes");
        ceara1.setIdh("Idh: 0.754 em 2010");
        ceara1.setPontosTuristicos("Ponto turistico: Praia de Iracema");

        Cidade ceara2 = new Cidade();
        ceara2.setNome("Jijoca");
        ceara2.setQtdPopulação("20.087 Habitantes");
        ceara2.setIdh("Idh: 0.623");
        ceara2.setPontosTuristicos("Ponto turistico: Praia de Jericoacoara");

        Cidade cidadeCeara[] = {ceara1,ceara2};

        Estado est2 = new Estado();
        est2.setNome("Pernambuco");

        Cidade pe1 = new Cidade();
        pe1.setNome("Recife");
        pe1.setQtdPopulação("1.661.017 Habitantes");
        pe1.setIdh("Idh: 0.772");
        pe1.setPontosTuristicos("Ponto turistico: Praça do Marco Zero");

        Cidade pe2 = new Cidade();
        pe2.setNome("Olinda");
        pe2.setQtdPopulação("393.115 Habitantes");
        pe2.setIdh("Idh: 0.735");
        pe2.setPontosTuristicos("Ponto turistico: Centro Histórico de Olinda");

        Cidade cidpe[] ={pe1,pe2};

        Estado est3 = new Estado();
        est3.setNome("Bahia");

        Cidade ba1 = new Cidade();
        ba1.setNome("Salvador");
        ba1.setQtdPopulação("3.957.123 Habitantes");
        ba1.setIdh("Idh: 0.660");
        ba1.setPontosTuristicos("Ponto turistico: Elevador Lacerda");

        Cidade ba2 = new Cidade();
        ba2.setNome("Vitória da Conquista");
        ba2.setQtdPopulação("341.128 Habitantes");
        ba2.setIdh("Idh: 0.678");
        ba2.setPontosTuristicos("Ponto turistico: Reserva Poço Escuro");

        Cidade cidBa[] = {ba1,ba2};

        est1.setCidades(cidadeCeara);
        est2.setCidades(cidpe);
        est3.setCidades(cidBa);

        Estado estados[] = {est1,est2,est3};

        return estados;
    }
}
