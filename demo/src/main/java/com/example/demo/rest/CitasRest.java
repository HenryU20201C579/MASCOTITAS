package com.example.demo.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Citas;
import com.example.demo.service.CitasService;

@RestController
@RequestMapping("/citas")
public class CitasRest {
    @Autowired
    private CitasService citasService;

    @GetMapping
    private ResponseEntity<List<Citas>> getAllCitas(){
        return ResponseEntity.ok(citasService.findAll());
    }
    
}
