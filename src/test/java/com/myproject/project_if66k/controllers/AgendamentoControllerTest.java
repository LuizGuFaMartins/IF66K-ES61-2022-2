package com.myproject.project_if66k.controllers;

import com.myproject.project_if66k.dao.AgendamentoDAO;
import com.myproject.project_if66k.models.Agendamento;
import java.util.List;
import org.junit.Test;
import static org.junit.Assert.*;

public class AgendamentoControllerTest {

    AgendamentoDAO agendamentoDAO = new AgendamentoDAO("test");

    public AgendamentoControllerTest() {
    }

    @Test
    public void testCreate() {
        System.out.println("Teste de criação de um agendamento");

        Agendamento age = new Agendamento();

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
    public void testeCreate(){
        Agendamento age = new Agendamento();

        age.setId_animal(1);
        age.setServico_age("banho");
        age.setData_age("10/10/2010 - 10:10");
        age.setId_func_age(1);
        
        boolean resultado =  agendamentoDAO.Create(age);
        
        assertEquals(true, resultado);
        
        List<Agendamento> result = agendamentoDAO.readAll();
        
        Agendamento agen = new Agendamento();
        
        agen.setId_age(result.get(0).getId_age());
        agen.setData_age(result.get(0).getData_age());
        agen.setId_animal(result.get(0).getId_animal());
        agen.setServico_age(result.get(0).getServico_age());
        agen.setId_func_age(result.get(0).getId_func_age());
        
        String data = agen.getData_age();
        String servico = agen.getServico_age();
        int id_ani = agen.getId_animal();
        int id_func = agen.getId_func_age();
        
        assertEquals("10/10/2010 - 10:10", data);
        assertEquals("banho", servico);
        assertEquals(1, id_ani);
        assertEquals(1, id_func);
        
    }

    @Test
    public void testReadAll() {
        System.out.println("testReadAll");

        List<Agendamento> result = agendamentoDAO.readAll();
        assertNotNull(result);
    }
    
    //bill clinton
 
    @Test
    public void testUpdate() {
        System.out.println("testUpdate");
        
        List<Agendamento> result = agendamentoDAO.readAll();
        Agendamento age = new Agendamento();
        
        
        if(result.size() > 0){
            age.setId_age(result.get(0).getId_age());
            age.setData_age(result.get(0).getData_age());
            age.setId_animal(result.get(0).getId_animal());
            age.setServico_age(result.get(0).getServico_age());
            age.setId_func_age(result.get(0).getId_func_age());
            
            if(agendamentoDAO.Update(age)){
                System.out.println("Teste bem sucedido, atualizado com sucesso!");
            }else{
                fail("Teste falhou, não foi possível salvar"); 
            }
        }        
    }
    
    @Test
    public void testeUpdate(){
        Agendamento age = new Agendamento();
        
        age.setId_animal(4);
        age.setData_age("10/10/2010 - 10:10");
        age.setId_func_age(2);
        age.setServico_age("tosa");
        
        agendamentoDAO.Create(age);
        
        List<Agendamento> result = agendamentoDAO.readAll();
        
        Agendamento agen = new Agendamento();
        
        agen.setId_age(result.get(0).getId_age());
        agen.setData_age(result.get(0).getData_age());
        agen.setId_animal(result.get(0).getId_animal());
        agen.setServico_age(result.get(0).getServico_age());
        agen.setId_func_age(result.get(0).getId_func_age());
        
        agen.setData_age("10/10/2022 - 10:20");
        
        boolean resultado = agendamentoDAO.Update(agen);
        
        assertEquals(true, resultado);
   
    }
    
    @Test
    public void testDeleta(){
        Agendamento age = new Agendamento();
        
        age.setId_animal(4);
        age.setData_age("10/10/2010 - 10:10");
        age.setId_func_age(2);
        age.setServico_age("tosa");
        
        agendamentoDAO.Create(age);
        
        List<Agendamento> result = agendamentoDAO.readAll();
        
        Agendamento agen = new Agendamento();
        
        agen.setId_age(result.get(0).getId_age());
        agen.setData_age(result.get(0).getData_age());
        agen.setId_animal(result.get(0).getId_animal());
        agen.setServico_age(result.get(0).getServico_age());
        agen.setId_func_age(result.get(0).getId_func_age());
        
        
        boolean resultado = agendamentoDAO.delete(agen);
        
        assertEquals(true, resultado);
        
        
    }
}
