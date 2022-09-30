package com.myproject.project_if66k.controllers;

import com.myproject.project_if66k.dao.FuncionarioDAO;
import com.myproject.project_if66k.models.Funcionario;

public class FuncionarioController {
    
    FuncionarioDAO fdao;
    
    public void cria(Funcionario fun){
        fdao = new FuncionarioDAO();
        fdao.Cria(fun);        
    }
    
    public boolean validaCPF(Funcionario fun){
        int CPF = fun.getCpf_func();
        
        return CPF >= 0000 && CPF <= 9999;
    }
    
    public boolean validaID(Funcionario fun){
        int ID = fun.getId_func();
        
        return ID >= 00  && ID <= 99;
    }
    
}
