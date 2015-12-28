/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Visao;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Jesyka Hanae
 */
public class TelaNovoPedidoIT {
    
    public TelaNovoPedidoIT() {
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
     * Test of Limpar method, of class TelaNovoPedido.
     */
    @Test
    public void testLimpar() {
        System.out.println("Limpar");
        TelaNovoPedido instance = new TelaNovoPedido();
        instance.Limpar();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of main method, of class TelaNovoPedido.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        TelaNovoPedido.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
