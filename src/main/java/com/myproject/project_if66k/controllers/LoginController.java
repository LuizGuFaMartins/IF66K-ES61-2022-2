package com.myproject.project_if66k.controllers;

import com.myproject.project_if66k.dao.LoginDAO;
import com.myproject.project_if66k.views.LoginView;
import com.myproject.project_if66k.views.MenuView;
import javax.swing.JOptionPane;

public class LoginController {

    public boolean login(String login, String senha) {
        LoginDAO dao = new LoginDAO();  
        boolean isLogged = dao.readUser(login, senha);
        
        if ("".equals(login) || "".equals(senha)) {
            JOptionPane.showMessageDialog(null, "Erro! Os campos não podem estar vazios...");
            return isLogged;
        }           
        
        if(!isLogged){
            JOptionPane.showMessageDialog(null, "Erro! Este usuário não existe...");
            return isLogged;
        }   
        
        return isLogged;
    }
}
