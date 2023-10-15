package model;

// import jakarta.persistence.Entity;
// import jakarta.persistence.Table;

// @Entity
// @Table (name = "citas")
public class Citas {
    private int id_Citas;
    private int Fecha;
    private int Hora;
    private String Consulta;
    private Veterinaria veterinaria;
}
