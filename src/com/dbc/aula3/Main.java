package com.dbc.aula3;

public class Main {
    public static void main(String[] args) {
        /*Pessoa p1 = new Pessoa();
        p1.ehMaiorDeIdade();
        p1.nome = "Camile";
        p1.sobrenome = "Lopes";
        p1.idade = 33;
        p1.conversar(p1);

        System.out.println(p1.ehMaiorDeIdade());
        System.out.println(p1.nomecompleto());*/

        String valores [] = {"01234","5678.8","670.2"};

        Integer codFunc = Integer.valueOf(valores[0]);
        System.out.println("cod funcionario: " + codFunc);

        Double salario = Double.valueOf(valores[1]);
        System.out.println("salario: " + salario);

        Double descontos = Double.valueOf(valores[2]);
        descontos = salario - descontos;
        System.out.println("salario com descontos: " + descontos);

    }
}
