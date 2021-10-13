package orientaçãoobjeto;

public class Contato {

    public Contato(String descricao, String telefone, int tipo){
        this.descricao = descricao;
        this.telefone = telefone;
        this.tipo = tipo;
    }

    private String descricao;
    private String telefone;
    private int tipo; // 1 res 2 com

    public void imprimirContato() {
        System.out.println("Descrição: " + this.descricao + "\n Nº telefone " + this.telefone + "\n Tipo: " + this.tipo);
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }
}
