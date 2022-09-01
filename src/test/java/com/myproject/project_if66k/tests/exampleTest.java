package com.myproject.project_if66k.tests;

import com.myproject.project_if66k.controllers.Example;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class exampleTest {
    
    public exampleTest() {
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

    @Test
    public void testSomar() {
        System.out.println("somar");
        int a = 3;
        int b = 2;
        int expResult = 4;
        int result = Example.somar(a, b);        
        assertEquals(expResult, result);        
    }
    
}
