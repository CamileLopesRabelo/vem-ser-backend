package com.dbc.aula6_listas_pilhas_fila_testes.exercicio2filas;

import java.util.LinkedList;
import java.util.Queue;

public class FilasExercicio2 {
    public static void main(String[] args) {
        Senha senha = new Senha();
        Queue<Pessoa>fila = new LinkedList<>();

        for (int i = 0;i < 5;i++) {
            Pessoa p1 = new Pessoa();
            p1.setNumSenha(senha.getNumeroSenha());
            fila.add(p1);
        }
        System.out.println("entrar 5 pessoas " + fila.size());

        fila.poll();
        fila.poll();
        for (Pessoa pessoa:fila) {
            System.out.println("atender 2 pessoas " + pessoa.getNumSenha());
        }


        fila.poll();
        for (Pessoa pessoa:fila) {
            System.out.println("Atender 1 pessoa: " + pessoa.getNumSenha());
        }

        for (int i = 0;i < 3;i++) {
            Pessoa p1 = new Pessoa();
            p1.setNumSenha(senha.getNumeroSenha());
            fila.add(p1);
        }
        for (Pessoa pessoa:fila) {
            System.out.println("Entrou mais 3 pessoas: "+pessoa.getNumSenha());
        }

        fila.poll();
        fila.poll();
        fila.poll();


        for (Pessoa pessoa:fila) {
            System.out.println("Atendeu 3 pessoas " + pessoa.getNumSenha());
        }

    }
}
