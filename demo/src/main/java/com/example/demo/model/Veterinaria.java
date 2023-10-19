package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table (name = "veterinaria")
public class Veterinaria {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id_Veterinaria;
    private String Nombre;
    private String Direccion;
    private String Descripcion;

    @ManyToOne
    @JoinColumn(name = "id_historial_medico")
    private Historial_medico historial_medico;
    @ManyToOne
    @JoinColumn(name = "id_veterinarios")
    private Veterinarios veterinarios;
    
    public Veterinaria(String nombre, String direccion, String descripcion, Historial_medico historial_medico,
            Veterinarios veterinarios) {
        Nombre = nombre;
        Direccion = direccion;
        Descripcion = descripcion;
        this.historial_medico = historial_medico;
        this.veterinarios = veterinarios;
    }

    public int getId_Veterinaria() {
        return id_Veterinaria;
    }

    public void setId_Veterinaria(int id_Veterinaria) {
        this.id_Veterinaria = id_Veterinaria;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String direccion) {
        Direccion = direccion;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String descripcion) {
        Descripcion = descripcion;
    }

    public Historial_medico getHistorial_medico() {
        return historial_medico;
    }

    public void setHistorial_medico(Historial_medico historial_medico) {
        this.historial_medico = historial_medico;
    }

    public Veterinarios getVeterinarios() {
        return veterinarios;
    }

    public void setVeterinarios(Veterinarios veterinarios) {
        this.veterinarios = veterinarios;
    }

    
}
