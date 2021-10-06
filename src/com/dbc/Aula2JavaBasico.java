package com.dbc;

import java.util.Scanner;

public class Aula2JavaBasico {
    public static void main(String[] args) {
        //vetores
        /*int valores [] = new int [3];

        valores[0] = 3;
        valores[1] = 4;
        valores[2] = 6;

        int soma = (valores[0]+valores[1]+valores[2]);
        System.out.println(soma);

        float media = (soma)/3;
        System.out.printf("A média é: %.2f",media);*/

        //matrizes

        /*int[][] numeros = new int[2][2];
        numeros[0][0]= 29;
        numeros[0][1]= 77;
        numeros[1][0]= 14;
        numeros[1][1]= 67;

        int somaMatriz = (numeros[0][0]+numeros[0][1]+numeros[1][0]+numeros[1][1]);
        System.out.println("soma total " + somaMatriz);

        int somaLinha1 = (numeros[0][0]+numeros[0][1]);
        System.out.println("soma linha 1 " + somaLinha1);

        int somaLinha2 = (numeros[1][0]+numeros[1][1]);
        System.out.println("soma linha 2 " + somaLinha2);

        int subtracao = (somaLinha1 - somaLinha2);
        System.out.println("subtração das linhas " + subtracao);*/

        //for

        //int[] valores = {2,4,6,8};

        /*Scanner scanner = new Scanner(System.in);
        System.out.println("Qual o tamanho do vetor?");
        int numeros = scanner.nextInt();

        int [] vetor = new int[numeros];

        int soma = 0;

        for (int i = 0; i < vetor.length; i++){
            System.out.println("Digite os valores do vetor:" + i);
            vetor[i] = scanner.nextInt();
            soma += vetor[i];

        }


        float mediaValoresVetor = soma / vetor.length;
        System.out.println("media: " + mediaValoresVetor);*/

        /*Scanner scanner = new Scanner(System.in);
        System.out.println("Digite uma palavra: (fim - para encerrar)");
        String palavra = scanner.nextLine();
        while (!palavra.equalsIgnoreCase("fim")){
            System.out.println(palavra);
            System.out.println("Digite uma palavra: (fim - para encerrar)");
            palavra = scanner.nextLine();
        }
*/









    }
}
