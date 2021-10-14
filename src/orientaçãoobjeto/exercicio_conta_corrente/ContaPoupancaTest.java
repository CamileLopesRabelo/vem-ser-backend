package orientaçãoobjeto.exercicio_conta_corrente;

import org.junit.Test;

import static org.junit.Assert.*;

public class ContaPoupancaTest {
    @Test
    public void deveTestarSaqueContaPoupancaEVerificarSaldoComSucesso(){
        //setup
        Cliente camile = new Cliente("Camile","098.098.098.98");
        ContaPoupanca contaPagamentoCamile = new ContaPoupanca(camile,"234",456,1000);

        //act
        boolean sacar = contaPagamentoCamile.sacar(400);
        double saldo = contaPagamentoCamile.getSaldo();

        //assert
        assertTrue(sacar);
        assertEquals(600,saldo,0);
    }
    @Test
    public void deveTestarSaqueContaPoupancaSemSaldo(){
        //setup
        Cliente camile = new Cliente("Camile","098.098.098.98");
        ContaPoupanca contaPagamentoCamile = new ContaPoupanca(camile,"234",456,1000);

        //act
        boolean sacar = contaPagamentoCamile.sacar(1200);
        double saldo = contaPagamentoCamile.getSaldo();

        //assert
        assertFalse(sacar);
        assertEquals(1000,saldo,0);
    }
}

