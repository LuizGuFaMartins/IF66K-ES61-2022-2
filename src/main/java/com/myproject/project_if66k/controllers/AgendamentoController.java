package com.myproject.project_if66k.controllers;

import com.myproject.project_if66k.dao.AgendamentoDAO;
import com.myproject.project_if66k.models.Agendamento;
import java.util.List;
import javax.swing.JOptionPane;

public class AgendamentoController {

    private AgendamentoDAO agendamentoDAO = new AgendamentoDAO("dev");

    public List<Agendamento> readAll() {
        return agendamentoDAO.readAll();
    }

    public List<Agendamento> readById(int id) {
        return agendamentoDAO.readById(id);
    }

    public List<Agendamento> readByDate(String date) {
        return agendamentoDAO.readByDate(date);
    }

    public boolean create(Agendamento agendamento) {
        boolean res = false;
        try {
            res = agendamentoDAO.Create(agendamento);
        } catch (NumberFormatException num) {
            JOptionPane.showMessageDialog(null, "Erro ao salvar!");
        }        
        return res;
    }
    
    public boolean update(Agendamento agendamento) {
        boolean res = false;
        try {
            res = agendamentoDAO.Update(agendamento);
        } catch (NumberFormatException num) {
            JOptionPane.showMessageDialog(null, "Erro ao atualizar!");
        }        
        return res;
    }
}
