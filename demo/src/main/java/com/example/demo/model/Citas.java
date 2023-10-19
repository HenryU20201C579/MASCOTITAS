package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table (name = "citas")
public class Citas {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id_Citas;
    private int Fecha;
    private int Hora;
    private String Consulta;
    
    @ManyToOne
    @JoinColumn(name = "id_veterinaria")
    private Veterinaria veterinaria;
    
    public Citas(int fecha, int hora, String consulta, Veterinaria veterinaria) {
        Fecha = fecha;
        Hora = hora;
        Consulta = consulta;
        this.veterinaria = veterinaria;
    }
    
    public int getId_Citas() {
        return id_Citas;
    }
    
    public void setId_Citas(int id_Citas) {
        this.id_Citas = id_Citas;
    }

    public int getFecha() {
        return Fecha;
    }

    public void setFecha(int fecha) {
        Fecha = fecha;
    }

    public int getHora() {
        return Hora;
    }

    public void setHora(int hora) {
        Hora = hora;
    }

    public String getConsulta() {
        return Consulta;
    }

    public void setConsulta(String consulta) {
        Consulta = consulta;
    }

    public Veterinaria getVeterinaria() {
        return veterinaria;
    }

    public void setVeterinaria(Veterinaria veterinaria) {
        this.veterinaria = veterinaria;
    }


    
}
