package model.bean;

import java.util.Date;

public class Agendamento {
    private int id_animal;
    private int id_func_age;
    private int id_age; 
    private String servico_age;
    private String data_age;    

    public int getId_animal() {
        return id_animal;
    }

    public void setId_animal(int id_animal) {
        this.id_animal = id_animal;
    }

    public int getId_func_age() {
        return id_func_age;
    }

    public void setId_func_age(int id_func_age) {
        this.id_func_age = id_func_age;
    }

    public int getId_age() {
        return id_age;
    }

    public void setId_age(int id_age) {
        this.id_age = id_age;
    }

    public String getServico_age() {
        return servico_age;
    }

    public void setServico_age(String servico_age) {
        this.servico_age = servico_age;
    }

    public String getData_age() {
        return data_age;
    }

    public void setData_age(String data_age) {
        this.data_age = data_age;
    }
    
    
}
