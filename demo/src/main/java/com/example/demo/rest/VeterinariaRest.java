package com.example.demo.rest;


import com.example.demo.model.Veterinaria;
import com.example.demo.service.VeterinariaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/veterinaria")
public class VeterinariaRest {

    @Autowired
    private VeterinariaService veterinariaService;

    @GetMapping
    private ResponseEntity<List<Veterinaria>> getAllVeterinaria()
    {
        return ResponseEntity.ok( veterinariaService.findAll() );
    }
    
}
