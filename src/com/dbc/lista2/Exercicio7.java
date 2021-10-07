package com.dbc.lista2;

import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int matriz [][] = new int[4][4];
        matriz [0][0] = 2;
        matriz [0][1] = 4;
        matriz [0][2] = 6;
        matriz [0][3] = 8;
        matriz [1][0] = 10;
        matriz [1][1] = 1;
        matriz [1][2] = 3;
        matriz [1][3] = 5;
        matriz [2][0] = 7;
        matriz [2][1] = 9;
        matriz [2][2] = 11;
        matriz [2][3] = 12;
        matriz [3][0] = 13;
        matriz [3][1] = 14;
        matriz [3][2] = 15;
        matriz [3][3] = 16;

        int qtd= 0;

        for (int i = 0; i < matriz.length;i++) {
            for (int j = 0; j < matriz.length;j++){
                if (matriz[i][j] > 10) {
                    qtd += 1;
                }
            }
        }
        System.out.println("A matriz recebeu " + qtd + " valores maiores que 10");
    }
}
