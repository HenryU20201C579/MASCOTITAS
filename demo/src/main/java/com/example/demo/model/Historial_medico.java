package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table (name = "historial_medico")
public class Historial_medico {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id_Historial;
    
    @ManyToOne
    @JoinColumn(name = "id_citas")
    private Citas citas;
    @ManyToOne
    @JoinColumn(name = "id_mascota")
    private Mascota mascota;

    public Historial_medico() {
    }

    public Historial_medico(Citas citas, Mascota mascota) {
        this.citas = citas;
        this.mascota = mascota;
    }

    public int getId_Historial() {
        return id_Historial;
    }

    public void setId_Historial(int id_Historial) {
        this.id_Historial = id_Historial;
    }

    public Citas getCitas() {
        return citas;
    }

    public void setCitas(Citas citas) {
        this.citas = citas;
    }

    public Mascota getMascota() {
        return mascota;
    }

    public void setMascota(Mascota mascota) {
        this.mascota = mascota;
    }
    

}
