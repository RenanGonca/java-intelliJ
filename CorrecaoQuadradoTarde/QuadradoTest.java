import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class QuadradoTest.
 *
 * @author  Thiago Cury
 * @version 1.0
 * @since 02/04/2020 - 14:20
 */
public class QuadradoTest {
    
    Quadrado quadrado = new Quadrado();
    
    /**
     * Default constructor for test class QuadradoTest
     */
    public QuadradoTest() {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp() {
        quadrado.setLado(5);
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
    public void testCalcularArea() {
        //setUp
        //margem de erro.
        assertEquals(25.0, quadrado.calcularArea(), 0.0);
        //tearDown
    }
    
    @Test
    public void testCalcularPerimetro() {
        //setUp
        assertEquals(20.0, quadrado.calcularPerimetro(), 0.0);
        //tearDown
    }    
}
