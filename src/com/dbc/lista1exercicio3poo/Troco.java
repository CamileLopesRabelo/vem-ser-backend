package com.dbc.lista1exercicio3poo;

public class Troco {
    private float vtc;
    private float vpc;
    private float troco;

    public Troco() {
    }

    public float getVtc() {
        return vtc;
    }

    public void setVtc(float vtc) {
        this.vtc = vtc;
    }

    public float getVpc() {
        return vpc;
    }

    public void setVpc(float vpc) {
        this.vpc = vpc;
    }
    public void calcularTroco () {
        if (this.vpc < this.vtc){
            System.out.println("o valor pago deve ser maior ou igual ao valor consumido");
        } else if (this.vpc > this.vtc){
            this.troco = (this.vpc - this.vtc);
            System.out.println("O valor do troco é:");
            System.out.printf("%.2f",this.troco);
        } else if (this.vpc == this.vtc){
            System.out.println("Pagamento realizado,obrigada pela preferência!");
        }
    }
}
