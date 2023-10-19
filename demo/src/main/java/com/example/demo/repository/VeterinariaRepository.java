package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Veterinaria;

public interface VeterinariaRepository extends JpaRepository<Veterinaria, Long> {
    
}
