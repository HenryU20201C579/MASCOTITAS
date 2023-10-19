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
}
