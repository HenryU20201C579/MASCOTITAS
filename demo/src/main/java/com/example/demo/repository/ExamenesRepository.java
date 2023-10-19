package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Examenes;

public interface ExamenesRepository extends JpaRepository<Examenes, Long> {
    
}
