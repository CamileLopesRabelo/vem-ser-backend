package com.dbc.lista2;

import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nome do produto: ");
        String produto = scanner.nextLine();
        System.out.println("Valor do produto: ");
        float valorproduto = scanner.nextFloat();
        float desconto = 0.05f;
        float calcdesc;
        float valorComDesconto;
        float valorTotalComDesconto;

        for (int i = 0;i <10;i++) {
            calcdesc = valorproduto * desconto; // calcula o valor do desconto de acordo com o preço do produto
            valorComDesconto = valorproduto - calcdesc; // diminui o valor do desconto do valor produto
            valorTotalComDesconto = valorComDesconto * (i + 1); // pega o valor do produto com desconto e multiplica pela quantidaade
            desconto += 0.05f;//soma e atribui 5% no desconto a cada leitura
            System.out.println((i + 1) +" x R$ " + String.format("%.2f",valorComDesconto) + " = " +
                    String.format("%.2f",valorTotalComDesconto));

        }

    }
}
