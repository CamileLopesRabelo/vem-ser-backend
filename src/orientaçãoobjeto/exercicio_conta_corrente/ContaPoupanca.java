package orientaçãoobjeto.exercicio_conta_corrente;

public class ContaPoupanca extends Conta implements Impressao {
    private static final double JUROS_MENSAL = 1.01;

    public ContaPoupanca(Cliente cliente, String numConta, int agencia, double saldo) {
        super(cliente, numConta, agencia, saldo);
    }

    public void creditarTaxa() {
        setSaldo(getSaldo() * JUROS_MENSAL);
    }

    @Override
    public void imprimir() {
        System.out.println("----------Dados do Cliente----------------");
        System.out.println("Nome Cliente: " + getCliente().getNome());
        System.out.println("Agencia: " + getAgencia());
        System.out.println("Conta: " + getNumConta());
        System.out.println("Saldo: " + getSaldo());
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
        if (deposito < 0) {
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
                setSaldo(getSaldo() - valor);
            }
        }
        if(status){
            System.out.println("Transferência realizada!");
        } else
            System.out.println("Transferencia não realizada");
        return status;
    }
}
