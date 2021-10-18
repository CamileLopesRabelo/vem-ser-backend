package com.dbc.aula6_listas_pilhas_fila_testes;

import org.junit.Test;

import static org.junit.Assert.*;

public class MeuTest {



    @Test
    public void deveTestarSeONumeroEParComSucesso() {
        //SETUP
        int valor = 10;
        //act ação
        boolean ehpar = valor % 2 == 0;
        //assert verificação
        assertFalse(ehpar);



    }
        @Test
        public void deveTestarSeONUmeroEParComErro() {
        //SETUP
        int valor =11;
        //ACT
        boolean ehpar = valor % 2 == 0;
        //ASSERT
        assertFalse(ehpar);
    }
    }

