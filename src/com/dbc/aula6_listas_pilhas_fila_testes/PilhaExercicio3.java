package com.dbc.aula6_listas_pilhas_fila_testes;

import java.util.Scanner;
import java.util.Stack;

public class PilhaExercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Stack<Integer> pilha = new Stack<>();

        for (int i = 0;i < 15;i++) {
            System.out.println("Digite um numero");
             Integer numero = scanner.nextInt();
            if (numero % 2 == 0){
                pilha.add(numero);
                System.out.println("adicionou" + numero);
            } else if (!pilha.isEmpty()){
               Integer numeroRemovido = pilha.pop();
                System.out.println("removeu" + numeroRemovido);
            }
        }
        for (int i = 0;i < 15;i++) {
            if (!pilha.isEmpty()) {
                pilha.pop();
            }
            System.out.println(pilha);
        }


    }
}
