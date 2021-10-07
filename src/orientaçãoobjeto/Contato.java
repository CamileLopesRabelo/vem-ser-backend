package orientaçãoobjeto;

public class Contato {

    public Contato(String descricao, String telefone, int tipo){
        this.descricao = descricao;
        this.telefone = telefone;
        this.tipo = tipo;
    }

    public String descricao;
    public String telefone;
    public int tipo; // 1 res 2 com

    public void imprimirContato() {
        System.out.println(this.descricao + this.telefone + this.tipo);
    }
}
