

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class PessoaTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class PessoaTest {
    
    private Pessoa pessoa = new Pessoa();
    
    /**
     * Default constructor for test class PessoaTest
     */
    public PessoaTest() {
        pessoa.setNome("Thiago");
        pessoa.setSobrenome("Cury");        
        pessoa.setIdade(36);                
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp() {
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown() {
    }
    
    @Test
    public void testVerificarIdade() {
       
        //36
        assertEquals("\nMaior de idade", pessoa.verificarIdade());
        
        pessoa.setIdade(10);
        assertEquals("\nMenor de idade", pessoa.verificarIdade());   
    }
    
    @Test
    public void testVerificarJovemAdultoIdoso() {
       
        //36
        assertEquals("\nAdulto", pessoa.verificarJovemAdultoIdoso());
        
        pessoa.setIdade(20);
        assertEquals("\nJovem ainda...", pessoa.verificarJovemAdultoIdoso());   
        
        pessoa.setIdade(65);
        assertEquals("\nIdoso", pessoa.verificarJovemAdultoIdoso());
        
        pessoa.setIdade(5);
        assertEquals("Voce nao se enquadra em nenhuma categoria...", pessoa.verificarJovemAdultoIdoso());
    }    

}
