package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity 
@Table (name = "duenio")

public class Duenio {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id_Dueño;
    private String Nombres;
    private String Apellido;
    private int Edad;
    private String Direccion;
    private String Correo;
    private int Num_telefono;
    private int DNI;
    private int Cantidad_Mascota;

    @ManyToOne
    @JoinColumn(name = "id_login")
    private Login login;

    public Duenio() {
    }

    public Duenio(String nombres, String apellido, int edad, String direccion, String correo, int num_telefono, int dNI,
            int cantidad_Mascota, Login login) {
        Nombres = nombres;
        Apellido = apellido;
        Edad = edad;
        Direccion = direccion;
        Correo = correo;
        Num_telefono = num_telefono;
        DNI = dNI;
        Cantidad_Mascota = cantidad_Mascota;
        this.login = login;
    }

    public int getId_Dueño() {
        return id_Dueño;
    }

    public void setId_Dueño(int id_Dueño) {
        this.id_Dueño = id_Dueño;
    }

    public String getNombres() {
        return Nombres;
    }

    public void setNombres(String nombres) {
        Nombres = nombres;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String apellido) {
        Apellido = apellido;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int edad) {
        Edad = edad;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String direccion) {
        Direccion = direccion;
    }

    public String getCorreo() {
        return Correo;
    }

    public void setCorreo(String correo) {
        Correo = correo;
    }

    public int getNum_telefono() {
        return Num_telefono;
    }

    public void setNum_telefono(int num_telefono) {
        Num_telefono = num_telefono;
    }

    public int getDNI() {
        return DNI;
    }

    public void setDNI(int dNI) {
        DNI = dNI;
    }

    public int getCantidad_Mascota() {
        return Cantidad_Mascota;
    }

    public void setCantidad_Mascota(int cantidad_Mascota) {
        Cantidad_Mascota = cantidad_Mascota;
    }

    public Login getLogin() {
        return login;
    }

    public void setLogin(Login login) {
        this.login = login;
    }
   
}
