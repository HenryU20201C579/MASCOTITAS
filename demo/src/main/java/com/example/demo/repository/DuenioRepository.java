package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Duenio;

public interface DuenioRepository extends JpaRepository<Duenio, Long> {
    
}
