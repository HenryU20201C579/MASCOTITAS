package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Veterinarios;

public interface VeterinariosRepository extends JpaRepository<Veterinarios, Long> {
    
}
