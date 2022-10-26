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
import com.myproject.project_if66k.models.Cliente;

public class ClienteDAO {
    
    public ConnectionFactory connectionFactory;
    
    public ClienteDAO(){
        this.connectionFactory =  new ConnectionFactory("dev");
    }
    
    public ClienteDAO(String env){
        this.connectionFactory = new ConnectionFactory(env);
    }
    
    public void Create(Cliente fun) {
        Connection con = connectionFactory.openConnection();
        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("INSERT INTO cliente (cpf_cli, nome_cli, tel_cli, cep_cli, estado_cli, cidade_cli, logradouro_cli, bairro) VALUES (?, ?, ?, ?, ?, ?, ?, ?)");
            stmt.setString(1, fun.getCpf_cli());
            stmt.setString(2, fun.getNome_cli());
            stmt.setString(3, fun.getTel_cli());
            stmt.setString(4, fun.getCep_cli());
            stmt.setString(5, fun.getEstado_cli());
            stmt.setString(6, fun.getCidade_cli());
            stmt.setString(7, fun.getLogradouro_cli());
            stmt.setString(8, fun.getBairro_cli());

            stmt.executeUpdate();

            JOptionPane.showMessageDialog(null, "Salvo com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao salvar!");
            Logger.getLogger(FuncionarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao salvar!");
            Logger.getLogger(FuncionarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            connectionFactory.closeConnection(con, stmt);
        }
    }

    public void Update(Cliente fun) {
        Connection con = connectionFactory.openConnection();
        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("UPDATE cliente SET cpf_cli = ?, nome_cli = ?, tel_cli = ?, cep_cli = ?, estado_cli = ?, cidade_cli = ?, logradouro_cli = ?, bairro = ? WHERE id_cli = ?");
            stmt.setString(1, fun.getCpf_cli());
            stmt.setString(2, fun.getNome_cli());
            stmt.setString(3, fun.getTel_cli());
            stmt.setString(4, fun.getCep_cli());
            stmt.setString(5, fun.getEstado_cli());
            stmt.setString(6, fun.getCidade_cli());
            stmt.setString(7, fun.getLogradouro_cli());
            stmt.setString(8, fun.getBairro_cli());
            stmt.setInt(9, fun.getId_cli());

            stmt.executeUpdate();

            JOptionPane.showMessageDialog(null, "Atualizado com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao atualizar!");
            Logger.getLogger(FuncionarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao salvar!");
            Logger.getLogger(FuncionarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            connectionFactory.closeConnection(con, stmt);
        }
    }

    public List<Cliente> read() {
        Connection con = connectionFactory.openConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;

        List<Cliente> funcionarios = new ArrayList<>();

        try {
            stmt = con.prepareStatement("SELECT * FROM cliente");
            rs = stmt.executeQuery();

            while (rs.next()) {
                Cliente func = new Cliente();

                func.setId_cli(rs.getInt("id_cli"));
                func.setCpf_cli(rs.getString("cpf_cli"));
                func.setNome_cli(rs.getString("nome_cli"));
                func.setTel_cli(rs.getString("tel_cli"));
                func.setCep_cli(rs.getString("cep_cli"));
                func.setEstado_cli(rs.getString("estado_cli"));
                func.setCidade_cli(rs.getString("cidade_cli"));
                func.setLogradouro_cli(rs.getString("logradouro_cli"));
                func.setBairro_cli(rs.getString("bairro"));

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

    public List<Cliente> readNome(String nome) {
        Connection con = connectionFactory.openConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;

        List<Cliente> funcionarios = new ArrayList<>();

        try {
            stmt = con.prepareStatement("SELECT * FROM cliente WHERE nome_cli LIKE ?");
            stmt.setString(1, "%" + nome + "%");
            rs = stmt.executeQuery();

            while (rs.next()) {
                Cliente func = new Cliente();

                func.setId_cli(rs.getInt("id_cli"));
                func.setCpf_cli(rs.getString("cpf_cli"));
                func.setNome_cli(rs.getString("nome_cli"));
                func.setTel_cli(rs.getString("tel_cli"));
                func.setCep_cli(rs.getString("cep_cli"));
                func.setEstado_cli(rs.getString("estado_cli"));
                func.setCidade_cli(rs.getString("cidade_cli"));
                func.setLogradouro_cli(rs.getString("logradouro_cli"));
                func.setBairro_cli(rs.getString("bairro"));

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

    public List<Cliente> readID(int id) {
        Connection con = connectionFactory.openConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;

        List<Cliente> funcionarios = new ArrayList<>();

        try {
            stmt = con.prepareStatement("SELECT * FROM cliente WHERE id_cli = ?");
            stmt.setInt(1, id);
            rs = stmt.executeQuery();

            while (rs.next()) {
                Cliente func = new Cliente();

                func.setId_cli(rs.getInt("id_cli"));
                func.setCpf_cli(rs.getString("cpf_cli"));
                func.setNome_cli(rs.getString("nome_cli"));
                func.setTel_cli(rs.getString("tel_cli"));
                func.setCep_cli(rs.getString("cep_cli"));
                func.setEstado_cli(rs.getString("estado_cli"));
                func.setCidade_cli(rs.getString("cidade_cli"));
                func.setLogradouro_cli(rs.getString("logradouro_cli"));
                func.setBairro_cli(rs.getString("bairro"));

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

    public void delete(Cliente fun) {
        Connection con = connectionFactory.openConnection();
        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("DELETE FROM cliente WHERE id_cli = ?");
            stmt.setInt(1, fun.getId_cli());

            stmt.executeUpdate();

            JOptionPane.showMessageDialog(null, "Excluído com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao Excluir!");
            Logger.getLogger(FuncionarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            connectionFactory.closeConnection(con, stmt);
        }
    }
}
