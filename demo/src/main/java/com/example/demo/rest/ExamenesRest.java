package com.example.demo.rest;

import com.example.demo.model.Examenes;
import com.example.demo.service.ExamenesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/examenes")
public class ExamenesRest {
    @Autowired
    private ExamenesService examenesService;

    @GetMapping
    private ResponseEntity<List<Examenes>> getAllExamenes(){ return ResponseEntity.ok(examenesService.findAll()); }
}
