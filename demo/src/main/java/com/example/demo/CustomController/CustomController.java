package com.example.demo.CustomController;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomController {

    @GetMapping("/nombre")
    public String nombreSitio(){
        return "prueba";
    }
    
    @GetMapping("/descipcion")
    public String descripcionSitio(){
        return "prueba 2";
    }

}
