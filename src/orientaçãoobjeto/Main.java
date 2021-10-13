package orientaçãoobjeto;

public class Main {
    public static void main(String[] args) {
        Cliente c1 = new Cliente("Camile Lopes","009008998776");
        Contato[] contatos = {new Contato("cel","707070707",1)};
        Endereco[] enderecos = {new Endereco(1,"rua c",44,"","0707070","fort","ce","bra")};
        c1.contatos = contatos;
        c1.enderecos = enderecos;
        ContaCorrente cc1 = new ContaCorrente(c1,"6989870",1650,200.00,100.00);

        Cliente c2 = new Cliente("José Didi","89766089897987");
        Contato[] contatosc2 = {new Contato("cel","8238969669",1)};
        Endereco[] enderecosc2 = {new Endereco(1,"rua b",74,"","045233523470","Recife","pe","bra")};
        c2.contatos = contatosc2;
        c2.enderecos = enderecosc2;
        ContaCorrente cc2 = new ContaCorrente(c2,"87897870",1630,500.00,120.00);


       // System.out.println(cc1.transferir(cc2,50f));
       // cc1.depositar(2000);
        //cc2.sacar(1000);

        //cc1.imprimirContaCorrente();
        //cc2.imprimirContaCorrente();

        c1.imprimirContatos();








    }
}
