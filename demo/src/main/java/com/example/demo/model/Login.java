package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table (name = "login")
public class Login {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id_Login;
    private String Usuario;
    private String Contrasenia;
 
    public Login(String usuario, String contrasenia) {
        Usuario = usuario;
        Contrasenia = contrasenia;
    }

    public int getId_Login() {
        return id_Login;
    }

    public void setId_Login(int id_Login) {
        this.id_Login = id_Login;
    }

    public String getUsuario() {
        return Usuario;
    }

    public void setUsuario(String usuario) {
        Usuario = usuario;
    }

    public String getContrasenia() {
        return Contrasenia;
    }

    public void setContrasenia(String contrasenia) {
        Contrasenia = contrasenia;
    }

}