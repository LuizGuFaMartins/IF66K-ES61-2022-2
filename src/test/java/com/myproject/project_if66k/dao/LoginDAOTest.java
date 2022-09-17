/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.myproject.project_if66k.dao;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author luizg
 */
public class LoginDAOTest {
    
    public LoginDAOTest() {
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
    public void tea(){}    
     
    @Test
    public void testReadUsuarioCorrectLogin() {
        System.out.println("readUsuario com entrada correta");
        
        String login_user = "login";
        String senha_user = "123456";
        
        LoginDAO instance = new LoginDAO();
        
        boolean expResult = true;
        boolean result = instance.readUsuario(login_user, senha_user);
        
        assertEquals(expResult, result);       
    } 
    
     @Test
    public void testReadUsuarioIncorrectLogin() {
        System.out.println("readUsuario com entrada incorreta");
        
        String login_user = "513451343456sdfhsxdf5";
        String senha_user = "11dstfgsdafgsdfgg23456";
        
        LoginDAO instance = new LoginDAO();
        
        boolean expResult = false;
        boolean result = instance.readUsuario(login_user, senha_user);
        
        assertEquals(expResult, result);       
    }   
}
