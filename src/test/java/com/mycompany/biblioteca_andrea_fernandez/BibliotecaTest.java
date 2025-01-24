/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.biblioteca_andrea_fernandez;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author jvifdz-PORTATIL
 */
public class BibliotecaTest {
    
    public BibliotecaTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of prestarLibros method, of class Biblioteca.
     */
    @Test
    public void testPrestarLibros() {
        System.out.println("prestarLibros");
        Object usuario = new usuario("Juan", 100);
        int cantidad = 0;
        Biblioteca instance = null;
        String expResult = "";
        String result = instance.prestarLibros(usuario, cantidad);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLibrosDisponibles method, of class Biblioteca.
     */
    @Test
    public void testGetLibrosDisponibles() {
        System.out.println("getLibrosDisponibles");
        Biblioteca instance = null;
        int expResult = 0;
        int result = instance.getLibrosDisponibles();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getBibliotecario method, of class Biblioteca.
     */
    @Test
    public void testGetBibliotecario() {
        System.out.println("getBibliotecario");
        Biblioteca instance = null;
        String expResult = "";
        String result = instance.getBibliotecario();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
