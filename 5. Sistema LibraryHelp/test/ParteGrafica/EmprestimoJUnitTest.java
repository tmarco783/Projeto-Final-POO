/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ParteGrafica;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author tmarco
 */
public class EmprestimoJUnitTest {
    
    public EmprestimoJUnitTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of calculoMulta method, of class Emprestimo.
     */
    @Test
    public void testCalculoMulta() {
        System.out.println("calculoMulta");
        Data data = null;
        Emprestimo instance = new Emprestimo();
        double expResult = 0.0;
        double result = instance.calculoMulta(data);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
