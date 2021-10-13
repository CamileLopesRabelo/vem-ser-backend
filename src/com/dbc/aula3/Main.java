package com.dbc.aula3;

public class Main {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa("Joaozinho",20);



        System.out.println(p1.ehMaiorDeIdade());
        System.out.println(p1.getNome());

//        String valores [] = {"01234","5678.8","670.2"};
//
//        Integer codFunc = Integer.valueOf(valores[0]);
//        System.out.println("cod funcionario: " + codFunc);
//
//        Double salario = Double.valueOf(valores[1]);
//        System.out.println("salario: " + salario);
//
//        Double descontos = Double.valueOf(valores[2]);
//        descontos = salario - descontos;
//        System.out.println("salario com descontos: " + descontos);

    }
}
