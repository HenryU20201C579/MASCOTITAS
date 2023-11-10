package com.example.demo.rest;

import com.example.demo.model.Mascota;
import com.example.demo.model.Veterinarios;
import com.example.demo.service.VeterinariosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/veterinarios")
public class VeterinariosRest {
    @Autowired
    private VeterinariosService veterinariosService;

    @GetMapping
    private ResponseEntity<List<Veterinarios>> getAllVeterinarios()
    {
        return ResponseEntity.ok( veterinariosService.findAll() );
    }

    @PostMapping
    private ResponseEntity<String> agregarVeterinario(@RequestBody Veterinarios nuevaVeterinario) {
        veterinariosService.agregarVeterinario(nuevaVeterinario);
        return ResponseEntity.ok("Mascota agregada correctamente");
    }

}
