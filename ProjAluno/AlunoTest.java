import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * A classe de teste AlunoTest.
 * @author (Renan)
 * since (03/04/2020)
 * @version 1.0
 */
public class AlunoTest {
    private Aluno aluno = new Aluno();
    /**
    * Construtor default para a classe de teste AlunoTest
    */
    public AlunoTest() {
        aluno.setNota1(10);
        aluno.setNota2(10);
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
    public void testcalcularMedia() {
       assertEquals(10.0, aluno.calcularMedia(), 0.0);
    }
    
    @Test
    public void testverConceito() {
        assertEquals("Aprovado, Conceito A", aluno.verConceito());
        aluno.setNota1(8);
        aluno.setNota2(8);
        assertEquals("Aprovado, Conceito B", aluno.verConceito());
        aluno.setNota1(7);
        aluno.setNota2(7);
        assertEquals("Aprovado, Conceito C", aluno.verConceito());
        aluno.setNota1(1);
        aluno.setNota2(1);
        assertEquals("Reprovado, Conceito D", aluno.verConceito());
    }
}
