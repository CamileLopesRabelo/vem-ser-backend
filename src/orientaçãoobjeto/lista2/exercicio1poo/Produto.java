package orientaçãoobjeto.lista2.exercicio1poo;

public class Produto {
    private String nome;
    private float preco;

    public Produto(String nome, float preco) {
        this.nome = nome;
        this.preco = preco;
    }
    public float aplicarDesconto(float percentualDesconto){
        float desconto = this.preco * percentualDesconto;
        float vcd =  this.preco - desconto;
        return vcd;
    }
    public float descQtd(float percentualDesc,int qtd){
        //float desconto = this.preco * percentualDesc;
        float vcd =  aplicarDesconto((percentualDesc));
        float vtd = vcd * qtd;
        return vtd;
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }
}

