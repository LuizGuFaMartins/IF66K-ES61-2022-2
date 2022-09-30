package com.myproject.project_if66k.dao;

import com.myproject.project_if66k.connection.ConnectionFactory;
import com.myproject.project_if66k.models.Funcionario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class FuncionarioDAO {
    
    public void Cria(Funcionario fun){        
        Connection con = ConnectionFactory.openConnection();
        PreparedStatement stmt = null;
        
        try {
            stmt = con.prepareStatement("INSERT INTO funcionario (id_func,nome_func, cpf_func, cargo_func, senha_func) VALUES (?, ?, ?, ?, ?)");
            stmt.setString(1,String.valueOf(fun.getId_func()));
            stmt.setString(2, fun.getNome_func());
            stmt.setString(3, String.valueOf(fun.getCpf_func()));
            stmt.setString(4, fun.getCargo_func());
            stmt.setString(5, fun.getSenha_func());
            
            
            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Salvo com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao salvar!");
            Logger.getLogger(FuncionarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        }catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao salvar!");
            Logger.getLogger(FuncionarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        } 
    }
}