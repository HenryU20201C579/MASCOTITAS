package com.example.demo.rest;

import com.example.demo.model.Citas;
import com.example.demo.model.Mascota;
import com.example.demo.service.MascotaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import jakarta.validation.Valid;

import java.util.List;

@RestController
@RequestMapping("/mascotas")
public class MascotaRest {

    @Autowired
    private MascotaService mascotaService;

    @GetMapping
     private ResponseEntity<List<Mascota>> getAllMascotas()
     {
        return ResponseEntity.ok(mascotaService.findAll());
    }

/*
    @GetMapping
    public ResponseEntity<List<Mascota>> getAllMascotas() {
        List<Mascota> mascotasResponseResource = mascotaService.findAll();
        return new ResponseEntity<>(mascotasResponseResource, HttpStatus.OK);
    }*/

    @PostMapping
    private ResponseEntity<String> agregarMascota(@RequestBody Mascota nuevaMascota) {
        mascotaService.agregarMascota(nuevaMascota);
        return ResponseEntity.ok("Mascota agregada correctamente");
    }


}
