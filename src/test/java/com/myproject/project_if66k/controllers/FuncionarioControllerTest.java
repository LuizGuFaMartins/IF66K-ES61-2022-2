package com.myproject.project_if66k.controllers;

import com.myproject.project_if66k.models.Funcionario;
import static org.junit.Assert.assertEquals;

import org.junit.Test;



public class FuncionarioControllerTest{
    
    FuncionarioController fcontro;
    Funcionario func;
    
    
    @Test
    public void testValidaCpfTrue(){
        int cpf = 2212;
        boolean result;
        
        fcontro = new FuncionarioController();
        func = new Funcionario();
        
        func.setCpf_func(cpf);
        
        result = fcontro.validaCPF(func);
        
        assertEquals(result,true);
              
    }
    
    @Test
    public void testValidaIdTrue(){
        int id = 1313;
        boolean result;
        
        fcontro = new FuncionarioController();
        func = new Funcionario();
        
        func.setId_func(id);
        
        result = fcontro.validaID(func);
        
        assertEquals(result,false);
        
    }
    
    @Test
    public void testValidaCpfFalse(){
       int cpf = 222212;
        boolean result;
        
        fcontro = new FuncionarioController();
        func = new Funcionario();
        
        func.setCpf_func(cpf);
        
        result = fcontro.validaCPF(func);
        
        assertEquals(result,false);
        
        
    }
    
    @Test
    public void testValidaIdFalse(){
        int id = 1133;
        boolean result;
        
        fcontro = new FuncionarioController();
        func = new Funcionario();
        
        func.setId_func(id);
        
        result = fcontro.validaID(func);
        
        assertEquals(result,false);
        
    }
}
