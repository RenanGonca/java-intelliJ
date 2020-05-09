import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * A classe de teste ProgramaPesoTest.
 * @author (Renan Gonçalves)
 * @version 1.0
 * since 04/04/2020
 */
public class PessoaTest {
    
    private Pessoa pessoa = new Pessoa();
    
    /**
     * Construtor default para a classe de teste ProgramaPesoTest
     */
    public PessoaTest() {
        pessoa.setPeso(0);
        pessoa.setAltura(1.72);
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
    public void testCalcularMassaCorporal() {
        assertEquals(0.0, pessoa.calcularMassaCorporal(), 0.0);
    }
    
    @Test
    public void testVerificarIMC() {
        assertEquals("Abaixo do peso", pessoa.verificarIMC());
        pessoa.setPeso(60);
        pessoa.setAltura(1.72);
        assertEquals("Peso Normal", pessoa.verificarIMC());
        pessoa.setPeso(80);
        pessoa.setAltura(1.72);
        assertEquals("Acima do Peso", pessoa.verificarIMC());
        pessoa.setPeso(95);
        pessoa.setAltura(1.72);
        assertEquals("Obesidade I", pessoa.verificarIMC());
        pessoa.setPeso(120);
        pessoa.setAltura(1.72);
        assertEquals("Obesidade II (severa)", pessoa.verificarIMC());
    }
}
