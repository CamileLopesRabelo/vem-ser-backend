package com.dbc.aula3;

public class Pessoa {
    String nome;
    String sobrenome;
    int idade;
    int whats;
    String nomeCompleto;

    public void conversar(Pessoa pessoa) {
        System.out.println(pessoa.nome + "conversou com " + pessoa.nome);
    }
    public String nomecompleto () {
        nomeCompleto = nome + sobrenome;
        return nomeCompleto;
    }
    public boolean ehMaiorDeIdade() {
        if (this.idade > 18) {
            return true;
        } else
            return false;

    }
    public void mandarWhats(Pessoa pessoa,String mensagem) {
        System.out.println(pessoa.nome + "enviou" + mensagem + pessoa );
    }

}
