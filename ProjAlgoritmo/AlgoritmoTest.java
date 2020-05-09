import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * A classe de teste AlgoritmoTest.
 *
 * @author (Renan)
 * @version (03/04/2020)
 * since 1.0 
 */
public class AlgoritmoTest {
    
    private Algoritmo algoritmo = new Algoritmo();
    
    /**
     * Construtor default para a classe de teste AlgoritmoTest
     */
    public AlgoritmoTest() {
        algoritmo.setMes(1);
    }

    /**
     * Define a .
     *
     * Chamado antes de cada método de caso de teste.
     */
    @Before
    public void setUp() {
        
    }

    /**
     * Tears down the test fixture.
     *
     * Chamado após cada método de teste de caso.
     */
    @After
    public void tearDown() {
        
    }
    
    @Test
    public void testVerificarMes() {
        assertEquals("\nJaneiro", algoritmo.verificarMes());
        algoritmo.setMes(2);
        assertEquals("\nFevereiro", algoritmo.verificarMes());
        algoritmo.setMes(3);
        assertEquals("\nMarço", algoritmo.verificarMes());
        algoritmo.setMes(4);
        assertEquals("\nAbril", algoritmo.verificarMes());
        algoritmo.setMes(5);
        assertEquals("\nMaio", algoritmo.verificarMes());
        algoritmo.setMes(6);
        assertEquals("\nJunho", algoritmo.verificarMes());
        algoritmo.setMes(7);
        assertEquals("\nJulho", algoritmo.verificarMes());
        algoritmo.setMes(8);
        assertEquals("\nAgosto", algoritmo.verificarMes());
        algoritmo.setMes(9);
        assertEquals("\nSetembro", algoritmo.verificarMes());
        algoritmo.setMes(10);
        assertEquals("\nOutubro", algoritmo.verificarMes());
        algoritmo.setMes(11);
        assertEquals("\nNovembro", algoritmo.verificarMes());
        algoritmo.setMes(12);
        assertEquals("\nDezembro", algoritmo.verificarMes());
        algoritmo.setMes(0);
        assertEquals("Mês Inválido", algoritmo.verificarMes());
    }
}
