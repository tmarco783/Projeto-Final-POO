/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ParteGrafica;

import java.util.ArrayList;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import ParteGrafica.Biblioteca;
import static org.junit.Assert.*;

/**
 *
 * @author tmarco
 */
public class BibliotecaJUnitTest {
    private Biblioteca bl;
    
    public BibliotecaJUnitTest() {
    
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of getInstancia method, of class Biblioteca.
     */
    @Test
    public void testGetInstancia() {
        System.out.println("getInstancia");
        Biblioteca expResult = null;
        Biblioteca result = Biblioteca.getInstancia();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of validarCadastroLivro method, of class Biblioteca.
     */
    @Test
    public void testValidarCadastroLivro(String cpf, String login) {
        assertTrue(bl.validarCadastroCliente(cpf, login));
    }

    /**
     * Test of validarCadastroCliente method, of class Biblioteca.
     */
    @Test
    public void testValidarCadastroCliente() {
        System.out.println("validarCadastroCliente");
        String cpf = "";
        String login = "";
        Biblioteca instance = new Biblioteca();
        boolean expResult = false;
        boolean result = instance.validarCadastroCliente(cpf, login);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addLivro method, of class Biblioteca.
     */
    @Test
    public void testAddLivro() {
        System.out.println("addLivro");
        Livro livro = null;
        Biblioteca instance = new Biblioteca();
        instance.addLivro(livro);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLivros method, of class Biblioteca.
     */
    @Test
    public void testGetLivros() {
        System.out.println("getLivros");
        Biblioteca instance = new Biblioteca();
        ArrayList expResult = null;
        ArrayList result = instance.getLivros();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
