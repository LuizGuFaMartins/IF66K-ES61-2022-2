package com.myproject.project_if66k.controllers;

import com.myproject.project_if66k.models.Tosa;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class TosaControllerTest {
    
    Tosa tosa;
    TosaController tosar;
    
    @Test
    public void testaDiaTesttrue(){
        int dia = 1201;
        boolean result;
        
        tosar = new TosaController();
        tosa = new Tosa();
        
        tosa.setDia_tosa(dia);
        result = tosar.testeDia(tosa);
        
        assertEquals(true, result);   
    }
    
    @Test
    public void testaDiaTestfalse(){
        int dia = 4455;
        boolean result;
        
        tosar = new TosaController();
        tosa = new Tosa();
        
        tosa.setDia_tosa(dia);
        result = tosar.testeDia(tosa);
        
        assertEquals(false, result);   
    }
    
    @Test
    public void testaHoraTesttrue(){
        int hora = 1200;
        boolean result;
        
        tosar = new TosaController();
        tosa = new Tosa();
        
        tosa.setHora_tosa(hora);
        result = tosar.testeHora(tosa);
        
        assertEquals(true, result);   
    }
    
    @Test
    public void testaHoraTestfalse(){
        int hora = 2000;
        boolean result;
        
        tosar = new TosaController();
        tosa = new Tosa();
        
        tosa.setHora_tosa(hora);
        result = tosar.testeDia(tosa);
        
        assertEquals(false, result);   
    }
    
}
