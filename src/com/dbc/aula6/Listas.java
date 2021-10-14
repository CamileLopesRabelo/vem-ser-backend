package com.dbc.aula6;

import java.util.ArrayList;
import java.util.Scanner;

public class Listas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nome = "";
        ArrayList<String> listaDeNomes = new ArrayList<>();
        do {
            System.out.println("Digite um nome");
            nome = scanner.next();
            if (!nome.equalsIgnoreCase("sair") ){
                listaDeNomes.add(nome);
            }
        } while (!nome.equalsIgnoreCase("sair"));

        System.out.println(listaDeNomes.get(listaDeNomes.size() - 2));
        System.out.println(listaDeNomes.get(0));
        listaDeNomes.remove(listaDeNomes.size()-1);
        System.out.println(listaDeNomes);
        System.out.println(listaDeNomes.size());



    }


}
