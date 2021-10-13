package com.dbc.lista1;

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {

        /*Uma lanchonete precisa de um programa calcule o troco a ser dado para o cliente:
        a. Precisamos de 2 entradas: Valor total consumido e valor pago pelo cliente
        b. Se o valor pago for menor do que o total consumido deve exibir uma mensagem:
        “o valor pago deve ser maior ou igual ao valor consumido”
        c. Se o valor pago for menor ou igual ao total consumido, calcular o troco ao cliente*/

        Scanner ler = new Scanner(System.in);

        float troco;

        System.out.println("Qual o valor total consumido?");
        float vtc = ler.nextFloat();
        ler.nextLine();

        System.out.println("Qual o valor pago pelo cliente?");
        float vpc = ler.nextFloat();
        ler.nextLine();

        if (vpc < vtc){
            System.out.println("o valor pago deve ser maior ou igual ao valor consumido");
        } else if (vpc > vtc){
            troco = (vpc - vtc);
            System.out.println("O valor do troco é:");
            System.out.printf("%.2f",troco);
        } else if (vpc == vtc){
            System.out.println("Pagamento realizado,obrigada pela preferência!");
        }

    }
}
