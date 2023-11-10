package com.example.demo.rest;

import com.example.demo.model.Especialidad;
import com.example.demo.service.EspecialidadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/especialidad")
public class EspecialidadRest {

    @Autowired
    private EspecialidadService especialidadService;

    @GetMapping
    private ResponseEntity<List<Especialidad>> getAllEspecialidad(){return ResponseEntity.ok(especialidadService.findAll());}
    
}
