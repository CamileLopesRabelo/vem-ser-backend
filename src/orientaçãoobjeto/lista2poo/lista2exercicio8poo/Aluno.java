package orientaçãoobjeto.lista2poo.lista2exercicio8poo;

public class Aluno {
    private int matricula;
    private float mediaDasProvas;
    private float mediaDosTrabalhos;

    public Aluno() {
    }

    public Aluno(int matricula, float mediaDasProvas, float mediaDosTrabalhos) {
        this.matricula = matricula;
        this.mediaDasProvas = mediaDasProvas;
        this.mediaDosTrabalhos = mediaDosTrabalhos;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public float getMediaDasProvas() {
        return mediaDasProvas;
    }

    public void setMediaDasProvas(float mediaDasProvas) {
        this.mediaDasProvas = mediaDasProvas;
    }

    public float getMediaDosTrabalhos() {
        return mediaDosTrabalhos;
    }

    public void setMediaDosTrabalhos(float mediaDosTrabalhos) {
        this.mediaDosTrabalhos = mediaDosTrabalhos;
    }

    public float notafinal() {
       float nf = (this.mediaDasProvas * 0.6f) + (this.mediaDosTrabalhos * 0.4f);
       return nf;
    }

}
