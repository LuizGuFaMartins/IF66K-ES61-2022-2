
package com.myproject.project_if66k.dao;

import com.myproject.project_if66k.connection.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class LoginDAO {
    
    public boolean readUser(String login_user, String senha_user){
        Connection con = ConnectionFactory.openConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;   
        
        boolean isUser = false;     
        
        try {           
            stmt = con.prepareStatement("SELECT * FROM usuario WHERE login_user = ? AND senha_user = ?");
            stmt.setString(1, login_user);
            stmt.setString(2, senha_user);
            
            rs = stmt.executeQuery();
            
            if(rs.next()){
                isUser = true;
            }
            
        } catch (SQLException ex) {             
            Logger.getLogger(FuncionarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        
        return isUser;
    }   
   
}
