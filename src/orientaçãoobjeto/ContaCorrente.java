package orientaçãoobjeto;

public class ContaCorrente {
    public ContaCorrente(Cliente cliente, String numConta, int agencia, double saldo, double chequeEspecial) {
        this.cliente = cliente;
        this.numConta = numConta;
        this.agencia = agencia;
        this.saldo = saldo;
        this.chequeEspecial = chequeEspecial;
    }

    public Cliente cliente;
    public String numConta;
    public int agencia;
    public double saldo;
    public double chequeEspecial;

    public void imprimirContaCorrente() {
        System.out.println("-----------------------------------");
        this.cliente.imprimirCliente();
        System.out.println("numero da conta: " + this.numConta);
        System.out.println("agencia: " + this.agencia);
        System.out.println("saldo: " + this.saldo);
        System.out.println("cheque especial: " + this.chequeEspecial);
    }

    public boolean sacar(double saque) {
        if (saque > this.saldo + this.chequeEspecial) {
            System.out.println("vc esta liso");
            return false;
        } else {
            this.saldo = this.saldo - saque;
            System.out.println("Saque realizado");
            return true;
        }
    }

    public boolean depositar(double deposito) {
        if (deposito < 0) {
            System.out.println("Tão querendo te roubar");
            return false;
        } else {
            this.saldo = this.saldo + deposito;
            System.out.println("vc ta menos liso");
            return true;
        }

    }

    public Double retornarSaldoComChequeEspecial() {
        return this.saldo + this.chequeEspecial;
    }

    public boolean transferir(ContaCorrente a, Float valor) {
        boolean status = false;
        if (valor < 0) {
            status = false;
        } else {
            if (this.sacar(valor)) {
                status = a.depositar(valor);
            }
        }
        if(status){
            System.out.println("Transferência realizada!");
        } else System.out.println("Deu ruim");
        return status;
    }
}


