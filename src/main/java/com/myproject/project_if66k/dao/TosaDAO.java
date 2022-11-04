package com.myproject.project_if66k.dao;

import com.myproject.project_if66k.connection.ConnectionFactory;
import com.myproject.project_if66k.models.Tosa;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class TosaDAO {
    
    ConnectionFactory connectionFactory = new ConnectionFactory("dev");
    
    public void criaTosa(Tosa tosa){
        Connection con = connectionFactory.openConnection();
        PreparedStatement stmt = null;
        
        try {
            stmt = con.prepareStatement("INSERT INTO tosa (nome_cli, dia_tosa, hora_tosa, tipo_tosa, observacoes) VALUES (?, ?, ?, ?, ?)");
            stmt.setString(1, tosa.getNome_cli());
            stmt.setInt(2, tosa.getDia_tosa());
            stmt.setInt(3, tosa.getHora_tosa());
            stmt.setString(4, tosa.getTipo_tosa());
            stmt.setString(5, tosa.getObs());
            
            
            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Salvo com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao salvar!");
            Logger.getLogger(TosaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao salvar!");
            Logger.getLogger(TosaDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            connectionFactory.closeConnection(con, stmt);
        } 
    }
    
    public void leTosa(){
        
    }
    
    public void excluiTora(){
        
    }
    
}
