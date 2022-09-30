package com.myproject.project_if66k.controllers;

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
import com.myproject.project_if66k.dao.ClienteDAO;
import com.myproject.project_if66k.dao.LoginDAO;
import com.myproject.project_if66k.models.Cliente;
import java.util.List;

@RunWith(MockitoJUnitRunner.class)
public class ClienteControllerTest {
    
    @Mock
    ClienteDAO clienteDAO;
    
    @InjectMocks
    ClienteController CliCon = new ClienteController();
    
    public ClienteControllerTest() {
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
    public void testClienteTrue(){
        System.out.println("Cliente");
        String cpf_cli = "";
        String nome_cli = "";
        String tel_cli = "";
        String cep_cli = "";
        String estado_cli = "";
        String cidade_cli = "";
        String logradouro_cli = "";
        String bairro_cli = "";
        
        when(clienteDAO.Create(cpf_cli, nome_cli, tel_cli, cep_cli, estado_cli, cidade_cli, logradouro_cli, bairro_cli)).thenReturn(true);        
        assertTrue(clienteDAO.Create(cpf_cli, nome_cli, tel_cli, cep_cli, estado_cli, cidade_cli, logradouro_cli, bairro_cli));
    }
}
