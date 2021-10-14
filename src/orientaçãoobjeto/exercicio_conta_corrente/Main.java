package orientaçãoobjeto.exercicio_conta_corrente;

public class Main {
    public static void main(String[] args) {
    Contato contatoCamile = new Contato("celular","85 998987463",1);
    Contato cttCamile[] = {contatoCamile};
    Endereco endCamile = new Endereco(1,"rua 16",30,"sem comp","60.543-56",
    "Fortaleza","Ceara","Brasil");
    Endereco vendCamile[] = {endCamile};
    Cliente cliente1 = new Cliente("Camile Lopes de Oliveira Rabelo","009.098.876.76");

    ContaCorrente ccCamile = new ContaCorrente(cliente1,"24098",1460,1000,500);
    ContaPagamento cpCamile = new ContaPagamento(cliente1,"9876-8",9883,700);

    Contato contatoLuan = new Contato("cl","81 987765443",1);
    Contato vcttLuan[] = {contatoLuan};
    Endereco endLuan = new Endereco(1,"rua q",45,"sem comp","65.456-09",
    "Olinda","Pernambuco","Brasil");
    Endereco vendLuan[] = {endLuan};
    Cliente Luan = new Cliente("Luan Pereira Silva","098.654.765.78");
    ContaPoupanca contaPoupancaLuan = new ContaPoupanca(Luan,"9876-0",876,2000);

    ccCamile.sacar(1000);
    ccCamile.imprimir();
    ccCamile.sacar(500);
    contaPoupancaLuan.imprimir();

    contaPoupancaLuan.transferir(ccCamile,500);
    contaPoupancaLuan.imprimir();
    ccCamile.imprimir();

    cpCamile.sacar(800);
    cpCamile.imprimir();

        cpCamile.sacar(695.75);
        cpCamile.imprimir();

        cpCamile.depositar(0);
        ccCamile.depositar(0);
        contaPoupancaLuan.depositar(0);












    }
}
