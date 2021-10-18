package com.dbc.aula7;

import org.junit.Test;

public class CalculoTest {
    @Test
    public void deveFazerASoma(){
        Calculo somar = (v1,v2) -> {
            int resultdo = v1 + v2;
            int calcular = somar.calcular(10, 10);
        };
    }
}
