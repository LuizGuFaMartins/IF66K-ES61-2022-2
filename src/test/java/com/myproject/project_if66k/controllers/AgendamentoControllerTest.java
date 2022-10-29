package com.myproject.project_if66k.controllers;

import com.myproject.project_if66k.dao.AgendamentoDAO;
import com.myproject.project_if66k.models.Agendamento;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import static org.mockito.Mockito.when;
import org.mockito.junit.MockitoJUnitRunner;

public class AgendamentoControllerTest {

    AgendamentoDAO agendamentoDAO = new AgendamentoDAO("test");
    
    public AgendamentoControllerTest() {
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
    public void testCreate() {
        System.out.println("Teste de criação de um agendamento");
        
        Agendamento age = new Agendamento();

//        age.setId_age(5);
        age.setId_animal(1);
        age.setServico_age("Serviço");
        age.setData_age("10/10/2010 - 10:10");
        age.setId_func_age(1);

        if (agendamentoDAO.Create(age)) {
            System.out.println("Teste bem sucedido, salvo com sucesso!");
        } else {
            fail("Teste falhou, não foi possível salvar");
        }
   
    }
    
    @Test
    public void testReadAll() {
        System.out.println("testReadAll");

        List<Agendamento> result = agendamentoDAO.readAll();
        assertNotNull(result);
        
        // TODO review the generated test code and remove the default call to fail. 
    };

    /*@Test
    public void testReadAll() {
        System.out.println("testReadAll");

        AgendamentoController agendamentoController = new AgendamentoController();
        AgendamentoDAO agendamentoDAO = new AgendamentoDAO();
        
        
        
        
        // TODO review the generated test code and remove the default call to fail.
    }*/
 /*@Test
    public void testReadById() {
        System.out.println("readById");
        int id = 0;
        AgendamentoController instance = new AgendamentoController();
        List<Agendamento> expResult = null;
        List<Agendamento> result = instance.readById(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    @Test
    public void testReadByDate() {
        System.out.println("readByDate");
        String date = "";
        AgendamentoController instance = new AgendamentoController();
        List<Agendamento> expResult = null;
        List<Agendamento> result = instance.readByDate(date);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
     */
   
    /*
    @Test
    public void testUpdate() {
        System.out.println("update");
        Agendamento agendamento = null;
        AgendamentoController instance = new AgendamentoController();
        boolean expResult = false;
        boolean result = instance.update(agendamento);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }*/

}
