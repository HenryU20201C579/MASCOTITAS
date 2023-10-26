package com.example.demo.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Login;
import com.example.demo.service.LoginService;

@RestController
@RequestMapping("/login")
public class LoginRest {
    @Autowired
    private LoginService loginService;

    @GetMapping
    private ResponseEntity<List<Login>> getAllCitas(){
        return ResponseEntity.ok(loginService.findAll());
    }
    
}