package com.dbc.lista2;

import java.util.Scanner;

public class Exercicio8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double matriz [][] = new double[5][4];
        int matricula = 0;
        double mp = 0;
        double mt = 0;
        double nf = 0;
        double maiorNotaFinal = 0;
        int matriculaComMaiorNotaFinal = 0;
        double somanf = 0;
        double totmat = 0;

        for (int i = 0;i < matriz.length;i++) {
            for (int j = 0; j < matriz.length;j++){
                if (j == 0) {
                    System.out.println("numero da matricula:");
                    matricula = scanner.nextInt();
                    matriz[i][j] = matricula;
                }else if (j == 1) {
                    System.out.println("media das provas:");
                    mp = scanner.nextDouble();
                    matriz[i][j] = mp;
                } else if (j == 2) {
                    System.out.println("media dos trabalhos");
                    mt = scanner.nextDouble();
                    matriz[i][j] = mt;
                } else {
                    nf = (mp * 0.6 + mt * 0.4);
                    if (nf > maiorNotaFinal){
                        maiorNotaFinal = nf;
                        matriculaComMaiorNotaFinal = matricula;
                    }
                    somanf += nf;
                    totmat += 1;
                }
            }
        }
        double mediaTotalNF = somanf/totmat;

        System.out.println("Matricula com a maior nota final é a : " + matriculaComMaiorNotaFinal);
        System.out.println("Media das notas finais: " + String.format("%.2f",mediaTotalNF));

    }
}
