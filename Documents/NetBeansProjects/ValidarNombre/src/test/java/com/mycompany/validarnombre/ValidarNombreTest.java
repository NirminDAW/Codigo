/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.mycompany.validarnombre;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Nirmin
 */
public class ValidarNombreTest {
    
    public ValidarNombreTest() {
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
     * Test of tieneLongitudCorrecta method, of class ValidarNombre.
     */
  

    @Test
    public void testTieneLongitudCorrecta() {
        assertTrue(ValidarNombre.tieneLongitudCorrecta("Santana Molina, Luis"));
    }

    @Test
    public void testTieneLongitudIncorrecta() {
        assertFalse(ValidarNombre.tieneLongitudCorrecta("Santana Molina"));
        assertFalse(ValidarNombre.tieneLongitudCorrecta("Luis"));
        assertFalse(ValidarNombre.tieneLongitudCorrecta("Santana Molina, Luis Torres"));
    }

    
    
    @Test
    public void testTieneComaAlFinal() {
        assertTrue(ValidarNombre.tieneComaAlFinal("Molina,"));
    }

    @Test
    public void testNoTieneComaAlFinal() {
        assertFalse(ValidarNombre.tieneComaAlFinal("Molina"));
        assertFalse(ValidarNombre.tieneComaAlFinal("Molina Luis"));
    }

    
    
    
 
    
    
    
    
    
    
    @Test
    public void testTieneSoloPrimeraLetraMayuscula() {
        assertTrue(ValidarNombre.tieneSoloPrimeraLetraMayuscula("Molina"));
    }

    @Test
    public void testNoTieneSoloPrimeraLetraMayuscula() {
        assertFalse(ValidarNombre.tieneSoloPrimeraLetraMayuscula("molina"));
        assertFalse(ValidarNombre.tieneSoloPrimeraLetraMayuscula("MOlina"));
    }

  
    @Test
    public void testExistePalabraEnVector() {
        String[] vector = {"ARTILES", "BLANCO", "RAMOS", "SANTANA", "MOLINA"};
        assertTrue(ValidarNombre.existePalabraEnVector("MOLINA", vector));
    }

    @Test
    public void testNoExistePalabraEnVector() {
        String[] vector = {"ARTILES", "BLANCO", "RAMOS", "SANTANA", "MOLINA"};
        assertFalse(ValidarNombre.existePalabraEnVector("TORRES", vector));
    }

    
    
    
    @Test
    public void testValidarNombreCorrecto() {
        assertTrue(ValidarNombre.validarNombre("Santana Molina, Luis"));
    }

    @Test
    public void testValidarNombreIncorrecto() {
        assertFalse(ValidarNombre.validarNombre("Santana Molina Luis"));
        assertFalse(ValidarNombre.validarNombre("Blanco Ramos, Ana Santana Molina"));
    }

    }
