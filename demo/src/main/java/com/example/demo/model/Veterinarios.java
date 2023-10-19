package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table (name = "veterinarios")
public class Veterinarios {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO) 
    private int id_Veterinario;
    private String Nombre;
    private String Apellido;

    public Veterinarios(String nombre, String apellido) {
        Nombre = nombre;
        Apellido = apellido;
    }

    public int getId_Veterinario() {
        return id_Veterinario;
    }

    public void setId_Veterinario(int id_Veterinario) {
        this.id_Veterinario = id_Veterinario;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String apellido) {
        Apellido = apellido;
    }

    
}
