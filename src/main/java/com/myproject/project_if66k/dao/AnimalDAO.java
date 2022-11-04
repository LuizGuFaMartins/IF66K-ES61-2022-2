package com.myproject.project_if66k.dao;

import com.myproject.project_if66k.connection.ConnectionFactory;
import com.myproject.project_if66k.models.Animal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class AnimalDAO {
    public void Create(Animal fun){        
        Connection con = ConnectionFactory.openConnection();
        PreparedStatement stmt = null;
        
        try {
            stmt = con.prepareStatement("INSERT INTO animal (nome_ani, raca_ani, porte_ani, dataNasc_ani, idade_ani, Cliente_id_cli) VALUES (?, ?, ?, ?, ?, ?)");
            stmt.setString(1, fun.getNome_ani());
            stmt.setString(2, fun.getRaca_ani());
            stmt.setString(3, fun.getPorte_ani());
            stmt.setString(4, fun.getDataNasc_ani());
            stmt.setString(5, fun.getIdade_ani());
            stmt.setInt(6, fun.getCliente_id());
            
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
    
    public void Update(Animal fun){        
        Connection con = ConnectionFactory.openConnection();
        PreparedStatement stmt = null;
        
        try {
            stmt = con.prepareStatement("UPDATE animal SET nome_ani = ?, raca_ani = ?, porte_ani = ?, dataNasc_ani = ?, idade_ani = ? WHERE id_ani = ?");
            stmt.setString(1, fun.getNome_ani());
            stmt.setString(2, fun.getRaca_ani());
            stmt.setString(3, fun.getPorte_ani());
            stmt.setString(4, fun.getDataNasc_ani());
            stmt.setString(5, fun.getIdade_ani());            
            stmt.setInt(6, fun.getId_ani());
            
            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Atualizado com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao atualizar!");
            Logger.getLogger(FuncionarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        }catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao salvar!");
            Logger.getLogger(FuncionarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }
    }
    
    public List <Animal> read(){
        Connection con = ConnectionFactory.openConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;        
       
        List<Animal> funcionarios = new ArrayList<>();
        
        try {           
            stmt = con.prepareStatement("SELECT * FROM animal"); 
            rs = stmt.executeQuery();
            
            while(rs.next()){
                Animal func = new Animal(); 
                                
                func.setId_ani(rs.getInt("id_ani"));
                func.setNome_ani(rs.getString("nome_ani"));
                func.setRaca_ani(rs.getString("raca_ani"));
                func.setPorte_ani(rs.getString("porte_ani"));
                func.setDataNasc_ani(rs.getString("dataNasc_ani"));
                func.setIdade_ani(rs.getString("idade_ani"));
                func.setCliente_id(rs.getInt("Cliente_id_cli"));
                
                funcionarios.add(func);
                
            }
        } catch (SQLException ex) {    
            JOptionPane.showMessageDialog(null, "Algo deu errado!");
            Logger.getLogger(FuncionarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        
        return funcionarios;
    }
    
    public List <Animal> readNome(String nome){
        Connection con = ConnectionFactory.openConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;        
       
        List<Animal> funcionarios = new ArrayList<>();
        
        try {           
            stmt = con.prepareStatement("SELECT * FROM animal WHERE nome_fun LIKE ?"); 
            stmt.setString(1, "%"+nome+"%");
            rs = stmt.executeQuery();
            
            while(rs.next()){
                Animal func = new Animal(); 
                
                func.setId_ani(rs.getInt("id_ani"));
                func.setNome_ani(rs.getString("nome_ani"));
                func.setRaca_ani(rs.getString("raca_ani"));
                func.setPorte_ani(rs.getString("porte_ani"));
                func.setDataNasc_ani(rs.getString("dataNasc_ani"));
                func.setIdade_ani(rs.getString("idade_ani"));
                func.setCliente_id(rs.getInt("Cliente_id_cli"));
                                
                funcionarios.add(func);
                
            }
        } catch (SQLException ex) {    
            JOptionPane.showMessageDialog(null, "Algo deu errado!");
            Logger.getLogger(FuncionarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        
        return funcionarios;
    }
    public List <Animal> readID(int id){
        Connection con = ConnectionFactory.openConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;        
       
        List<Animal> funcionarios = new ArrayList<>();
        
        try {           
            stmt = con.prepareStatement("SELECT * FROM animal WHERE id_ani = ?"); 
            stmt.setInt(1, id);
            rs = stmt.executeQuery();
            
            while(rs.next()){
                Animal func = new Animal(); 
                
                func.setId_ani(rs.getInt("id_ani"));
                func.setNome_ani(rs.getString("nome_ani"));
                func.setRaca_ani(rs.getString("raca_ani"));
                func.setPorte_ani(rs.getString("porte_ani"));
                func.setDataNasc_ani(rs.getString("dataNasc_ani"));
                func.setIdade_ani(rs.getString("idade_ani"));
                func.setCliente_id(rs.getInt("Cliente_id_cli"));
                                
                funcionarios.add(func);
                
            }
        } catch (SQLException ex) {    
            JOptionPane.showMessageDialog(null, "Algo deu errado!");
            Logger.getLogger(FuncionarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        
        return funcionarios;
    }
    public List <Animal> readIDCliente(int id){
        Connection con = ConnectionFactory.openConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;        
       
        List<Animal> funcionarios = new ArrayList<>();
        
        try {           
            stmt = con.prepareStatement("SELECT * FROM animal WHERE Cliente_id_cli = ?"); 
            stmt.setInt(1, id);
            rs = stmt.executeQuery();
            
            while(rs.next()){
                Animal func = new Animal(); 
                
                func.setId_ani(rs.getInt("id_ani"));
                func.setNome_ani(rs.getString("nome_ani"));
                func.setRaca_ani(rs.getString("raca_ani"));
                func.setPorte_ani(rs.getString("porte_ani"));
                func.setDataNasc_ani(rs.getString("dataNasc_ani"));
                func.setIdade_ani(rs.getString("idade_ani"));
                func.setCliente_id(rs.getInt("Cliente_id_cli"));
                                
                funcionarios.add(func);
                
            }
        } catch (SQLException ex) {    
            JOptionPane.showMessageDialog(null, "Algo deu errado!");
            Logger.getLogger(FuncionarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        
        return funcionarios;
    }
    
    public void delete(Animal fun){        
        Connection con = ConnectionFactory.openConnection();
        PreparedStatement stmt = null;
        
        try {
            stmt = con.prepareStatement("DELETE FROM animal WHERE id_ani = ?");
            stmt.setInt(1, fun.getId_ani());
            
            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Excluído com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao Excluir!");
            Logger.getLogger(FuncionarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }
    }
}
