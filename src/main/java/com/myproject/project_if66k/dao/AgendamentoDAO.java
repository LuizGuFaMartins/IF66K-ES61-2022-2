package com.myproject.project_if66k.dao;

import com.myproject.project_if66k.connection.ConnectionFactory;
import com.myproject.project_if66k.models.Agendamento;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class AgendamentoDAO {

    public ConnectionFactory connectionFactory;
    
    public AgendamentoDAO(){
        this.connectionFactory =  new ConnectionFactory("dev");
    }
    
    public AgendamentoDAO(String env){
        this.connectionFactory = new ConnectionFactory(env);
    }
    
    public boolean Create(Agendamento fun) {
        Connection con = connectionFactory.openConnection();
        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("INSERT INTO agendamento (cliente_id_cli, servico_age, data_age, funcionario_id_fun) VALUES (?, ?, ?, ?)");
            stmt.setInt(1, fun.getId_animal());
            stmt.setString(2, fun.getServico_age());
            stmt.setString(3, fun.getData_age());
            stmt.setInt(4, fun.getId_func_age());

            stmt.executeUpdate();

            JOptionPane.showMessageDialog(null, "Salvo com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao salvar!");
            Logger.getLogger(FuncionarioDAO.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao salvar!");
            Logger.getLogger(FuncionarioDAO.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        } finally {
            connectionFactory.closeConnection(con, stmt);
        }
        
        return true;
    }

    public boolean Update(Agendamento fun) {
        Connection con = connectionFactory.openConnection();
        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("UPDATE agendamento SET servico_age = ?, data_age = ? WHERE id_age = ?");
            stmt.setString(1, fun.getServico_age());
            stmt.setString(2, fun.getData_age());
            stmt.setInt(3, fun.getId_age());

            stmt.executeUpdate();

            JOptionPane.showMessageDialog(null, "Atualizado com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao atualizar!");
            Logger.getLogger(FuncionarioDAO.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao salvar!");
            Logger.getLogger(FuncionarioDAO.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        } finally {
            connectionFactory.closeConnection(con, stmt);
        }
        
        return true;
    }

    public List<Agendamento> readAll() {
        Connection con = connectionFactory.openConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;

        List<Agendamento> funcionarios = new ArrayList<>();

        try {
            stmt = con.prepareStatement("SELECT * FROM agendamento");
            rs = stmt.executeQuery();

            while (rs.next()) {
                Agendamento func = new Agendamento();

                func.setId_age(rs.getInt("id_age"));
                func.setId_animal(rs.getInt("cliente_id_cli"));
                func.setServico_age(rs.getString("servico_age"));
                func.setData_age(rs.getString("data_age"));
                func.setId_func_age(rs.getInt("funcionario_id_fun"));

                funcionarios.add(func);

            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Algo deu errado!");
            Logger.getLogger(FuncionarioDAO.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        } finally {
            connectionFactory.closeConnection(con, stmt, rs);
        }

        return funcionarios;
    }

    public List<Agendamento> readById(int id) {
        Connection con = connectionFactory.openConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;

        List<Agendamento> funcionarios = new ArrayList<>();

        try {
            stmt = con.prepareStatement("SELECT * FROM agendamento WHERE id_age = ?");
            stmt.setInt(1, id);
            rs = stmt.executeQuery();

            while (rs.next()) {
                Agendamento func = new Agendamento();

                func.setId_age(rs.getInt("id_age"));
                func.setId_animal(rs.getInt("cliente_id_cli"));
                func.setServico_age(rs.getString("servico_age"));
                func.setData_age(rs.getString("data_age"));
                func.setId_func_age(rs.getInt("funcionario_id_fun"));

                funcionarios.add(func);

            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Algo deu errado!");
            Logger.getLogger(FuncionarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            connectionFactory.closeConnection(con, stmt, rs);
        }

        return funcionarios;
    }

    public List<Agendamento> readByDate(String data) {
        Connection con = connectionFactory.openConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;

        List<Agendamento> funcionarios = new ArrayList<>();

        try {
            stmt = con.prepareStatement("SELECT * FROM agendamento WHERE data_age = ?");
            stmt.setString(1, data);
            rs = stmt.executeQuery();

            while (rs.next()) {
                Agendamento func = new Agendamento();

                func.setId_age(rs.getInt("id_age"));
                func.setId_animal(rs.getInt("cliente_id_cli"));
                func.setServico_age(rs.getString("servico_age"));
                func.setData_age(rs.getString("data_age"));
                func.setId_func_age(rs.getInt("funcionario_id_fun"));

                funcionarios.add(func);

            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Algo deu errado!");
            Logger.getLogger(FuncionarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            connectionFactory.closeConnection(con, stmt, rs);
        }

        return funcionarios;
    }

    public boolean delete(Agendamento fun) {
        Connection con = connectionFactory.openConnection();
        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("DELETE FROM agendamento WHERE id_age = ?");
            stmt.setInt(1, fun.getId_age());

            stmt.executeUpdate();

            JOptionPane.showMessageDialog(null, "Excluído com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao Excluir!");
            Logger.getLogger(FuncionarioDAO.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        } finally {
            connectionFactory.closeConnection(con, stmt);
        }
        
        return true;
    }
}
