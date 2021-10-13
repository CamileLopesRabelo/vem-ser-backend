package com.dbc.lista1exercicio6poo;

public class Palavra {
    private String portugues;
    private String ingles;

    public boolean equals(String palavra) {
        if (palavra.equals(portugues) || palavra.equals(ingles)) {
            return true;
        } else return false;
    }
    public String retornaSinonimo(String palavra) {
        if (palavra.equals(portugues)) {
            return ingles;
        } else return portugues;
    }

    public String getPortugues() {
        return portugues;
    }

    public void setPortugues(String portugues) {
        this.portugues = portugues;
    }

    public String getIngles() {
        return ingles;
    }

    public void setIngles(String ingles) {
        this.ingles = ingles;
    }
}
