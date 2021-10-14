package com.dbc.aula6;

import java.util.Scanner;
import java.util.Stack;

public class Pilha {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Integer numero = 0;
        Stack<Integer> pilha = new Stack<>();

        for (int i = 0;i < 15;i++) {
            System.out.println("Digite um numero");
            numero = scanner.nextInt();
            if (numero % 2 == 0){
                pilha.add(numero);
                System.out.println();
            } else {
                pilha.pop();
            }
        }



    }
}
