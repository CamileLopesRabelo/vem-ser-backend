package orientaçãoobjeto.lista1poo.lista1exercicio2poo;

public class MediaAluno {
    private float n1;
    private float n2;
    private float n3;
    private float n4;
    private float media;

    public float getN1() {
        return n1;
    }

    public void setN1(float n1) {
        this.n1 = n1;
    }

    public float getN2() {
        return n2;
    }

    public void setN2(float n2) {
        this.n2 = n2;
    }

    public float getN3() {
        return n3;
    }

    public void setN3(float n3) {
        this.n3 = n3;
    }

    public float getN4() {
        return n4;
    }

    public void setN4(float n4) {
        this.n4 = n4;
    }
    public float getMedia() {
        return (this.n1 + this.n2 + this.n3 + this.n4)/4 ;
    }

    public void status() {
        if (this.media <= 5 ){
            System.out.println("Reprovado!");
        } else if (this.media >= 5.1 && media <= 6.9) {
            System.out.println("Em Exame");
        } else if (this.media >= 7 && media <= 10) {
            System.out.println("Aprovado!");
        }
    }
}
