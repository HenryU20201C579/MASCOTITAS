package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table (name = "examenes")
public class Examenes {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id_Examen;
    private String Exam_realizado;
    private String Resultado;
    
    @ManyToOne
    @JoinColumn(name = "id_citas")
    private Citas citas;
    
    public Examenes() {
    }

    public Examenes(String exam_realizado, String resultado, Citas citas) {
        Exam_realizado = exam_realizado;
        Resultado = resultado;
        this.citas = citas;
    }

    public int getId_Examen() {
        return id_Examen;
    }

    public void setId_Examen(int id_Examen) {
        this.id_Examen = id_Examen;
    }

    public String getExam_realizado() {
        return Exam_realizado;
    }

    public void setExam_realizado(String exam_realizado) {
        Exam_realizado = exam_realizado;
    }

    public String getResultado() {
        return Resultado;
    }

    public void setResultado(String resultado) {
        Resultado = resultado;
    }

    public Citas getCitas() {
        return citas;
    }

    public void setCitas(Citas citas) {
        this.citas = citas;
    }
}
