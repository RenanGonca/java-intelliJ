import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
/**
 * A classe de teste AlgoritmoTest.
 *
 * @author Renan Gonçalves
 * @version 1.0
 * since 05/04/2020
 */
public class AlgoritmoTest {
    
    private Algoritmo algoritmo = new Algoritmo();
    
    /**
     * Construtor default para a classe de teste AlgoritmoTest
     */
    public AlgoritmoTest() {
        algoritmo.setValor1(5);
        algoritmo.setValor2(7);
        algoritmo.setValor3(9);
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
    public void testVerDecrescente() {
        assertEquals(9 + "-" + 7 + "-" + 5, algoritmo.verDecrescente());
        algoritmo.setValor1(1);
        algoritmo.setValor2(3);
        algoritmo.setValor3(2);
        assertEquals(3 + "-" + 2 + "-" + 1, algoritmo.verDecrescente());
        algoritmo.setValor1(2);
        algoritmo.setValor2(1);
        algoritmo.setValor3(3);
        assertEquals(3 + "-" + 2 + "-" + 1, algoritmo.verDecrescente());
        algoritmo.setValor1(3);
        algoritmo.setValor2(1);
        algoritmo.setValor3(2);
        assertEquals(3 + "-" + 2 + "-" + 1, algoritmo.verDecrescente());
        algoritmo.setValor1(2);
        algoritmo.setValor2(3);
        algoritmo.setValor3(1);
        assertEquals(3 + "-" + 2 + "-" + 1, algoritmo.verDecrescente());
        algoritmo.setValor1(3);
        algoritmo.setValor2(2);
        algoritmo.setValor3(1);
        assertEquals(3 + "-" + 2 + "-" + 1, algoritmo.verDecrescente());
        algoritmo.setValor1(1);
        algoritmo.setValor2(1);
        algoritmo.setValor3(1);
        assertEquals("Invalido", algoritmo.verDecrescente()); 
        algoritmo.setValor1(1);
        algoritmo.setValor2(1);
        algoritmo.setValor3(3);
        assertEquals("Invalido", algoritmo.verDecrescente()); 
    }
    
    @Test
    public void testVerCrescente() {
        assertEquals(5 + "-" + 7 + "-" + 9, algoritmo.verCrescente());
        algoritmo.setValor1(1);
        algoritmo.setValor2(3);
        algoritmo.setValor3(2);
        assertEquals(1 + "-" + 2 + "-" + 3, algoritmo.verCrescente());
        algoritmo.setValor1(2);
        algoritmo.setValor2(1);
        algoritmo.setValor3(3);
        assertEquals(1 + "-" + 2 + "-" + 3, algoritmo.verCrescente());
        algoritmo.setValor1(3);
        algoritmo.setValor2(1);
        algoritmo.setValor3(2);
        assertEquals(1 + "-" + 2 + "-" + 3, algoritmo.verCrescente());
        algoritmo.setValor1(2);
        algoritmo.setValor2(3);
        algoritmo.setValor3(1);
        assertEquals(1 + "-" + 2 + "-" + 3, algoritmo.verCrescente());
        algoritmo.setValor1(3);
        algoritmo.setValor2(2);
        algoritmo.setValor3(1);
        assertEquals(1 + "-" + 2 + "-" + 3, algoritmo.verCrescente());
        algoritmo.setValor1(1);
        algoritmo.setValor2(1);
        algoritmo.setValor3(1);
        assertEquals("Invalido", algoritmo.verCrescente());
        algoritmo.setValor1(1);
        algoritmo.setValor2(1);
        algoritmo.setValor3(3);
        assertEquals("Invalido", algoritmo.verCrescente());
    }
    
    @Test
    public void testVerificarOpcao() {
        assertEquals("\nVer Ordem Crescente: " + algoritmo.verCrescente(), algoritmo.verificarOpcao(1));
        assertEquals("\nVer Ordem Decrescente: " + algoritmo.verDecrescente(), algoritmo.verificarOpcao(2));
        assertEquals("\nVer Ambos: " + "\nVer em ordem Crescente: " + algoritmo.verCrescente() + "\nVer em ordem Decrescente: " + algoritmo.verDecrescente(), algoritmo.verificarOpcao(3));
        assertEquals("ERRO, OPÇÃO INVÁLIDA!", algoritmo.verificarOpcao(0));
    }
}
