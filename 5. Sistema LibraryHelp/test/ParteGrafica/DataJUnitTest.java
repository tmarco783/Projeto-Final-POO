/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ParteGrafica;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author tmarco
 */
public class DataJUnitTest {
    
    private Data data;
    
    public DataJUnitTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of getDia method, of class Data.
     */
    @Test
    public void testGetDia() {
       
    }

    /**
     * Test of getMes method, of class Data.
     */
    @Test
    public void testGetMes() {
       
    }

    /**
     * Test of getAno method, of class Data.
     */
    @Test
    public void testGetAno() {
        
    }

    /**
     * Testa se o ano é menor ou igual a 2017
     * @param data
     */
    @Test
    public void testSetAno(Data data) {
        assertTrue(data.getAno() <= 2017);
    }

    /**
     * Testa se o dia está de acordo com o mês.
     * @param data
     */
    @Test
    public void testSetDia(Data data) {
        assertTrue(data.getAno() == 1 && data.getDia() <= 31);
        assertTrue(data.getMes() == 2 && data.getDia() <= 29);
        assertTrue(data.getMes() == 3 && data.getDia() <= 31);
        assertTrue(data.getMes() == 4 && data.getDia() <= 30);
        assertTrue(data.getMes() == 5 && data.getDia() <= 31);
        assertTrue(data.getMes() == 6 && data.getDia() <= 30);
        assertTrue(data.getMes() == 7 && data.getDia() <= 31);
        assertTrue(data.getMes() == 8 && data.getDia() <= 31);
        assertTrue(data.getMes() == 9 && data.getDia() <= 30);
        assertTrue(data.getMes() == 10 && data.getDia() <= 31);
        assertTrue(data.getMes() == 11 && data.getDia() <= 30);
        assertTrue(data.getMes() == 12 && data.getDia() <= 31);
    }

    /**
     * Testa se o número do mês está entre 1 e 12
     * 
     * @param data
     */
    @Test
    public void testSetMes(Data data) {
        assertTrue(data.getMes() >= 1 && data.getMes() <= 12);
    }
    
}
