package orientaçãoobjeto.exercicio_conta_corrente;

import org.junit.Test;

import static org.junit.Assert.*;

public class ContaCorrenteTest {
    private Object ContaCorrente;

    @Test
    public void deveTestarSaqueContaCorrenteEVerificarSaldoComSucesso(){
        //setup
        Cliente camile = new Cliente("Camile","098.098.098.98");
        ContaCorrente contaCorrenteCamile = new ContaCorrente(camile,"1234",123,1000,1000);

        //act
        boolean sacar =contaCorrenteCamile.sacar(200);
        double saldo = contaCorrenteCamile.getSaldo();

        //assert
        assertTrue(sacar);
        assertEquals(800,saldo,0);

    }

    @Test
    public void deveTestarSaqueContaCorrenteSemSaldo(){
        //setup
        Cliente camile = new Cliente("Camile","098.098.098.98");
        ContaCorrente contaCorrenteCamile = new ContaCorrente(camile,"1234",123,1000,1000);

        //act
        boolean sacar =contaCorrenteCamile.sacar(2500);
        double saldo = contaCorrenteCamile.getSaldo();

        //assert
        assertFalse(sacar);
        assertEquals(1000,saldo,0);
    }
}
