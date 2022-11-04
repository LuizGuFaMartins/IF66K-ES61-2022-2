package com.myproject.project_if66k.controllers;

import com.myproject.project_if66k.dao.TosaDAO;
import com.myproject.project_if66k.models.Tosa;

public class TosaController {
    
    TosaDAO tosadao;
    
    public void CriarTosa(Tosa tosa){
        tosadao =  new TosaDAO();
        
        tosadao.criaTosa(tosa);
    }
    
    public void LerTosa(){
        
    }
    
    public void ExcluirTosa(){
        
    }
    
    public boolean testeDia(Tosa tosa){
        int dia = tosa.getDia_tosa();
                
        return dia >= 0101 && dia <= 3112;
    }
    
    public boolean testeHora(Tosa tosa){
        int horas = tosa.getHora_tosa();
        
        return horas >= 800 && horas <= 1800;
    }
    
}
