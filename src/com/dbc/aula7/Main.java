package com.dbc.aula7;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Qual o tipo de comida desejada?");
        String tipoComida = scanner.next();

         TipoComida tp = TipoComida.valueOf(tipoComida.toUpperCase());
         System.out.println("valor da comida " + tipoComida + " é : " + tp.getValor());





    }
}
