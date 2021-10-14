package orientaçãoobjeto.exercicio_conta_corrente;

public class ContaPagamento extends Conta implements Impressao {
    private static double TAXA_SAQUE = 4.25;

    public ContaPagamento(Cliente cliente, String numConta, int agencia, double saldo) {
        super(cliente, numConta, agencia, saldo);
    }

    @Override
    public boolean sacar(double saque) {
        if (getSaldo() >= saque) {
            setSaldo(getSaldo() - saque);
            setSaldo(getSaldo() - TAXA_SAQUE);
            System.out.println("saque realizado do saldo e cobrada a taxa de saque");
            return true;
        } else System.out.println("saldo insuficiente");return false;
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
            }
        }
        if(status){
            System.out.println("Transferência realizada!");
        } else
            System.out.println("Transferencia não realizada");
        return status;
    }

    @Override
    public void imprimir() {
        System.out.println("----------Dados do Cliente----------------");
        System.out.println("Nome Cliente: " + getCliente().getNome());
        System.out.println("Agencia: " + getAgencia());
        System.out.println("Conta: " + getNumConta());
        System.out.println("Saldo: " + getSaldo());
    }
}
