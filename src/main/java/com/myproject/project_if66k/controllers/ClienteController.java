package com.myproject.project_if66k.controllers;

import com.myproject.project_if66k.dao.ClienteDAO;
import com.myproject.project_if66k.models.Cliente;
import java.util.List;

public class ClienteController {
    
    private ClienteDAO fdao;
            
    public List<Cliente> read() {
        return fdao.read();
    }
    public List<Cliente> readNome(String nome){
        return fdao.readNome(nome);
    }
}
