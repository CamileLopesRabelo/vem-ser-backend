package orientaçãoobjeto.lista2exercicio3poo;

public class DadosDosJogadores {
    private Jogadores jogadores[];

    public DadosDosJogadores(Jogadores[] jogadores) {
        this.jogadores = jogadores;
    }

    public Jogadores[] getJogadores() {
        return jogadores;
    }

    public void setJogadores(Jogadores[] jogadores) {
        this.jogadores = jogadores;
    }

    public int qtdJogadores() {
        return jogadores.length;
    }

    public float alturaMaiorJogador() {
        float ma = 0;
        for (int i = 0;i < jogadores.length;i++) {
            if (jogadores[i].getAltura() > ma) {
                ma = jogadores[i].getAltura();
            }
        }
        return ma;
    }
    public String jogadorMaisVelho() {
        int mi = 0;
        String jmv = "";
        for (int i = 0; i < jogadores.length;i++) {
            if (jogadores[i].getIdade() > mi) {
                mi = jogadores[i].getIdade();
                jmv = jogadores[i].getNome();
            }
        }
        return jmv;
    }
    public String jogadorMaisPesado() {
        float mp = 0;
        String jmp = "";
        for (int i = 0; i < jogadores.length;i++) {
            if (jogadores[i].getPeso() > mp) {
                mp = jogadores[i].getPeso();
                jmp = jogadores[i].getNome();
            }
        }
        return jmp;
    }
    public float mediaDasAlturas() {
        float somaDasAlturas = 0;
        for (int i = 0;i < jogadores.length;i++) {
           somaDasAlturas += jogadores[i].getAltura();
        }
        float ma = somaDasAlturas/jogadores.length;
        return ma;
    }


}
