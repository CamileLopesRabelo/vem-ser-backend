package orientaçãoobjeto.exercicio_conta_corrente;

public class ContaCorrente extends Conta implements Impressao {
    private double chequeEspecial;
    private double somaSaldoEChequeEspecial = getSaldo() + getChequeEspecial();

    public ContaCorrente(Cliente cliente, String numConta, int agencia, double saldo,double chequeEspecial) {
        super(cliente, numConta, agencia, saldo);
        this.chequeEspecial = chequeEspecial;
    }

    public double restornarSaldoComChequeEspecial() {
        return getSaldo() + getChequeEspecial();
    }

    @Override
    public void imprimir() {
        System.out.println("----------Dados do Cliente----------------");
        System.out.println("Nome Cliente: " + getCliente().getNome());
        System.out.println("Agencia: " + getAgencia());
        System.out.println("Conta: " + getNumConta());
        System.out.println("Saldo: " + getSaldo());
        System.out.println("------------------------------------------");
    }

    @Override
    public boolean sacar(double saque) {
        if (saque <= getSaldo() + getChequeEspecial() && saque > 0){
            setSaldo(getSaldo() - saque);
            System.out.println("Saque realizado");
            return true;
        } else System.out.println("Saldo insuficiente"); return false;
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
    public boolean transferir(String conta, double valor) {
        boolean status = false;
        if (valor < 0) {
            status = false;
        } else {
            if (sacar(valor)) {
                status = depositar(valor);
            }
        }
        if(status){
            System.out.println("Transferência realizada!");
        } else
            System.out.println("Transferencia não realizada");
        return status;
    }

    public double getChequeEspecial() {
        return chequeEspecial;
    }

    public void setChequeEspecial(double chequeEspecial) {
        this.chequeEspecial = chequeEspecial;
    }
}
