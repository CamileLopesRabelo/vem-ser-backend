package com.dbc.aula6_listas_pilhas_fila_testes;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Mapas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, String> nomesPorCpf = new HashMap<>();
        String cpf;
        do {
            System.out.println("Digite o cpf:");
             cpf = scanner.next();
             if (cpf.equalsIgnoreCase("sair")){
                 break;
             }
            System.out.println("Digite o nome:");
            String nomes = scanner.next();
            nomesPorCpf.put(cpf,nomes);
        } while (!cpf.equalsIgnoreCase("sair"));

        System.out.println("Consulte um cpf:");
        String valor = nomesPorCpf.get(scanner.next());
        System.out.println(valor);
        System.out.println("Remova um cpf cadastrado: ");
        String cpfRemovido = scanner.next();

        if (nomesPorCpf.containsKey(cpfRemovido)) {
            System.out.println(nomesPorCpf.get(cpfRemovido));
            nomesPorCpf.remove(cpfRemovido);
        } else {
            System.out.println("o cpf cadastrado não existe");
        }



        System.out.println(nomesPorCpf);
    }
}
