package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table (name = "especialidad")
public class Especialidad {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id_Especialidad;
    private String Titulo;
    private String Descripcion;

    @ManyToOne
    @JoinColumn(name = "id_veterinarios")
    private Veterinarios veterinarios;

    public Especialidad(String titulo, String descripcion, Veterinarios veterinarios) {
        Titulo = titulo;
        Descripcion = descripcion;
        this.veterinarios = veterinarios;
    }

    public int getId_Especialidad() {
        return id_Especialidad;
    }

    public void setId_Especialidad(int id_Especialidad) {
        this.id_Especialidad = id_Especialidad;
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String titulo) {
        Titulo = titulo;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String descripcion) {
        Descripcion = descripcion;
    }

    public Veterinarios getVeterinarios() {
        return veterinarios;
    }

    public void setVeterinarios(Veterinarios veterinarios) {
        this.veterinarios = veterinarios;
    }

    
}
