package orientaçãoobjeto.lista1poo.lista1exercicio4poo;

public class Estado {
     private String nome;
     private Cidade[] cidades;

    public Estado() {
    }

    public Estado(String nome, Cidade[] cidades) {
        this.nome = nome;
        this.cidades = cidades;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Cidade[] getCidades() {
        return cidades;
    }

    public void setCidades(Cidade[] cidades) {
        this.cidades = cidades;
    }
}
