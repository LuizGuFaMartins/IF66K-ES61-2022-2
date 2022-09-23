package com.myproject.project_if66k.controllers;

import com.myproject.project_if66k.dao.LoginDAO;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class LoginControllerTest {
    
    @Mock
    LoginDAO loginDAO;
    
    @InjectMocks
    LoginController loginController = new LoginController();
    
    public LoginControllerTest() {
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

    @Test
    public void testLogin() {
        System.out.println("login");
        String login = "";
        String senha = "";
        
        when(loginDAO.readUser(login, senha)).thenReturn(false);        
        assertFalse(loginDAO.readUser(login, senha));       

    }
    
}
