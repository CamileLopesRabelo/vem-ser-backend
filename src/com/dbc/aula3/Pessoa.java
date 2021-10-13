package com.dbc.aula3;

public class Pessoa {
    private String nome;
    private String sobrenome;
    private int idade;
    private String whats;
    private String nomeCompleto;

    public Pessoa() { }

    public Pessoa(String nome,int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public void conversar(Pessoa pessoa) {

        System.out.println(this.nome + " conversou com " + pessoa.nome);
    }
    public String nomecompleto () {
        nomeCompleto = nome + sobrenome;
        return nomeCompleto;
    }
    public boolean ehMaiorDeIdade() {
        if (this.idade >=18) {
            System.out.println("é maior de idade");
            return true;
        } else
            System.out.println("não é maior de idade");
            return false;

    }
    public void mandarWhats(Pessoa pessoa,String mensagem) {
        System.out.println(this.nome + "enviou" + mensagem + " para " + pessoa );
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getWhats() {
        return whats;
    }

    public void setWhats(String whats) {
        this.whats = whats;
    }

    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }
}
