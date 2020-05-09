import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * A classe de teste FastFoodTest.
 * @author (Renan)
 * @version 1.0
 * since (03/04/2020)
 */
public class FastFoodTest {
    
    private FastFood fastFood = new FastFood();
    
    /**
     * Construtor default para a classe de teste FastFoodTest
     */
    public FastFoodTest() {
        fastFood.setValorCodigo1(3.65);
        fastFood.setValorCodigo2(2.50);
        fastFood.setValorCodigo3(3.30);
        fastFood.setValorCodigo4(4.70);
        fastFood.setQuantidade(1);
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
    public void TestSanduiche() {
        assertEquals(3.65, fastFood.sanduiche(), 0.0);
    }

    @Test 
    public void TestSuco() {
        assertEquals(2.50, fastFood.suco(), 0.0);
    }

    @Test 
    public void TestPastel() {
        assertEquals(3.30, fastFood.pastel(), 0.0);
    }

    @Test 
    public void TestFarroupilha() {
        assertEquals(4.70, fastFood.farroupilha(), 0.0);
    }
    
    @Test
    public void testVerificarCodigo() {
        assertEquals("\nSanduíche de Presunto, Valor Final: " + 3.65, fastFood.verificarCodigo(1));
        assertEquals("\nSuco de Tamarindo, Valor Final: " + 2.50, fastFood.verificarCodigo(2));
        assertEquals("\nPastel com ovo, Valor Final: " + 3.30, fastFood.verificarCodigo(3));
        assertEquals("\nFarroupilha, Valor Final: " + 4.70, fastFood.verificarCodigo(4));
        assertEquals("\nOpção Inválida Selecionada!", fastFood.verificarCodigo(0));
    }
    
    @Test
    public void testSelecionarProduto() {
        assertEquals("\n1 - Sanduíche de Presunto", fastFood.selecionarProduto(1));
        assertEquals("\n2 - Suco de Tamarindo", fastFood.selecionarProduto(2));
        assertEquals("\n3 - Pastel com ovo", fastFood.selecionarProduto(3));
        assertEquals("\n4 - Farroupilha", fastFood.selecionarProduto(4));
        assertEquals("\nOpção Inválida Selecionada!", fastFood.selecionarProduto(0));
    }

}
