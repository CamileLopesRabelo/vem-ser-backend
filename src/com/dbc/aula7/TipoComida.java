package com.dbc.aula7;

import org.junit.Test;

public enum TipoComida {
    JAPONESA(50.00),
    FASTFOOD(30.00),
    TRADICIONAL(20.00);

    private double valor;

    TipoComida(double valor){
        this.valor = valor;
    }

    public double getValor(){
        return this.valor;
    }
}


