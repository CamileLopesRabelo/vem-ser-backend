package orientaçãoobjeto.lista1poo.lista1exercicio5poo;

public class Salario {
 private float valorHora;
 private int horasNormaisTrabalhadas;
 private int horaExtra50;
 private int horaExtra100;

    public Salario() {
    }
    public float valorHoraExtra50() {
        float h50 = this.valorHora * 1.25f;
        return this.horaExtra50 * h50;
    }
    public float valorHoraExtra100() {
        float h100 = this.valorHora * 2;
        return this.horaExtra100 * h100;
    }
    public float valorHoraNormal() {
        float hnt = this.valorHora * this.horasNormaisTrabalhadas;
        return hnt;
    }
    public float salarioBruto() {

        float sb = valorHoraNormal() + valorHoraExtra50() + valorHoraExtra100();
        return sb;
    }

    public float getValorHora() {
        return valorHora;
    }

    public void setValorHora(float valorHora) {
        this.valorHora = valorHora;
    }

    public int getHorasNormaisTrabalhadas() {
        return horasNormaisTrabalhadas;
    }

    public void setHorasNormaisTrabalhadas(int horasNormaisTrabalhadas) {
        this.horasNormaisTrabalhadas = horasNormaisTrabalhadas;
    }

    public int getHoraExtra50() {
        return horaExtra50;
    }

    public void setHoraExtra50(int horaExtra50) {
        this.horaExtra50 = horaExtra50;
    }

    public int getHoraExtra100() {
        return horaExtra100;
    }

    public void setHoraExtra100(int horaExtra100) {
        this.horaExtra100 = horaExtra100;
    }
}
