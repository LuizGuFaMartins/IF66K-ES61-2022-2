package com.myproject.project_if66k.dao;
import static org.junit.Assert.assertEquals;
import org.junit.Test;
import com.myproject.project_if66k.models.Cliente;


class ClienteDAOTest {
    
    

    @Test
    public void CreateClienteSucesso(){
        String cpf_cli = "000.000.000-00";
        String nome_cli = "Bruno";
        String tel_cli = "(46) 99999.9999";
        String cep_cli = "000000-00";
        String estado_cli = "Acre";
        String cidade_cli = "Rio Branco";
        String logradouro_cli = "Bruno";
        String bairro_cli = "Bobos";
        
        ClienteDAO Cliente = new ClienteDAO();
        
        boolean expResult = true;
        boolean result = Cliente.Create(cpf_cli, nome_cli, tel_cli, cep_cli, estado_cli, cidade_cli, logradouro_cli, bairro_cli);
           assertEquals(expResult, result);
    }
}
