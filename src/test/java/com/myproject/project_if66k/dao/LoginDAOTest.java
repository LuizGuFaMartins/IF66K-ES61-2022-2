package com.myproject.project_if66k.dao;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class LoginDAOTest {
    
    public LoginDAOTest() {
    }    
     
    @Test
    public void testReadUserCorrectLogin() {
        System.out.println("readUser com entrada correta");
        
        String login_user = "login";
        String senha_user = "123456";
        
        LoginDAO instance = new LoginDAO();
        
        boolean expResult = true;
        boolean result = instance.readUser(login_user, senha_user);
        
        assertEquals(expResult, result);       
    } 
    
     @Test
    public void testReadUserIncorrectLogin() {
        System.out.println("readUser com entrada incorreta");
        
        String login_user = "513451343456sdfhsxdf5";
        String senha_user = "11dstfgsdafgsdfgg23456";
        
        LoginDAO instance = new LoginDAO();
        
        boolean expResult = false;
        boolean result = instance.readUser(login_user, senha_user);
        
        assertEquals(expResult, result);       
    }   
}
