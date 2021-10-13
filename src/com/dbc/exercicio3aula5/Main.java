package com.dbc.exercicio3aula5;

public class Main {
    public static void main(String[] args) {
    Gato pixano = new Gato();
    pixano.mia();
    Cachorro xuxu = new Cachorro();
    xuxu.latir();

    Cachorro c1 = new Cachorro("bolota");
        System.out.println("nome: " + c1.getNome());
        c1.setRaca("maltês");
        System.out.println("Raça: " + c1.getRaca());
    }
}
