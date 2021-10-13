package com.dbc.exercicio3aula5;

public class Cachorro extends Animal{
    public Cachorro() {
    }

    public Cachorro(String nome) {
        super(nome);
    }

    public void latir() {
        System.out.println("au, au");
    }
}
