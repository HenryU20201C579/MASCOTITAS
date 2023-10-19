package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table (name = "mascota")
public class Mascota {
    @Id
    private int id_Mascota;
    private String Nombre;
    private int Edad;
    private String Raza;
    private String Especie;

    @ManyToOne
    @JoinColumn(name = "id_duenio")
    private Duenio duenio;

    public Mascota(String nombre, int edad, String raza, String especie, Duenio duenio) {
        Nombre = nombre;
        Edad = edad;
        Raza = raza;
        Especie = especie;
        this.duenio = duenio;
    }

    public int getId_Mascota() {
        return id_Mascota;
    }

    public void setId_Mascota(int id_Mascota) {
        this.id_Mascota = id_Mascota;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int edad) {
        Edad = edad;
    }

    public String getRaza() {
        return Raza;
    }

    public void setRaza(String raza) {
        Raza = raza;
    }

    public String getEspecie() {
        return Especie;
    }

    public void setEspecie(String especie) {
        Especie = especie;
    }

    public Duenio getDuenio() {
        return duenio;
    }

    public void setDuenio(Duenio duenio) {
        this.duenio = duenio;
    }
    
    
}
