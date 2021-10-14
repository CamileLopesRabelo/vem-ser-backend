package orientaçãoobjeto.exercicio_conta_corrente;

public abstract class Conta implements Movimentacao {
    private Cliente cliente;
    private String numConta;
    private int agencia;
    private double saldo;

    public Conta(Cliente cliente, String numConta, int agencia, double saldo) {
        this.cliente = cliente;
        this.numConta = numConta;
        this.agencia = agencia;
        this.saldo = saldo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public String getNumConta() {
        return numConta;
    }

    public void setNumConta(String numConta) {
        this.numConta = numConta;
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }


    @Override
    public boolean sacar(double saque) {
        if (getSaldo() >= saque) {
            setSaldo(getSaldo() - saque);
            System.out.println("saque realizado");
            return true;
        } else System.out.println("Saldo insuficiente");return false;
    }

    @Override
    public boolean depositar(double deposito) {
        if (deposito <= 0) {
            System.out.println("Depósito não realizado");
            return false;
        } else {
            setSaldo(getSaldo() + deposito);
            System.out.println("Depósito realizado com sucesso");
            return true;
        }
    }

    @Override
    public boolean transferir(Conta conta, double valor) {
        boolean conseguiuSacar = sacar(valor);
        boolean conseguiuDepositar = false;
        if (conseguiuSacar) {
            conseguiuDepositar = conta.depositar(valor);
        }
        return conseguiuDepositar && conseguiuSacar;
    }
}
