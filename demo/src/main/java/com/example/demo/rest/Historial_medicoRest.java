package com.example.demo.rest;

import com.example.demo.model.Historial_medico;
import com.example.demo.service.Historial_medicoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/historialMedico")
public class Historial_medicoRest {

    @Autowired
    private Historial_medicoService historialMedicoService;

    @GetMapping
    private ResponseEntity<List<Historial_medico>> getAllHistorial_medico()
    {

        return ResponseEntity.ok( historialMedicoService.findAll() );

    }
}
