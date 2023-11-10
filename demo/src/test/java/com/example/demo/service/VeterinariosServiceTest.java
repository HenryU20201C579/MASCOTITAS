package com.example.demo.service;

import com.example.demo.model.Veterinarios;
import com.example.demo.repository.VeterinariaRepository;
import com.example.demo.repository.VeterinariosRepository;
import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Arrays;

import static org.junit.Assert.assertNotNull;
import static org.mockito.Mockito.when;

@SpringBootTest
public class VeterinariosServiceTest {

    @InjectMocks
    private VeterinariosService veterinariosService;

    @Mock
    private VeterinariosRepository veterinariosRepository;

    private Veterinarios veterinarios;


    @BeforeEach
    void setUp() {
        veterinarios = new Veterinarios();
        veterinarios.setId_Veterinario(0);
        veterinarios.setNombre(null);
        veterinarios.setApellido(null);
    }

    @org.junit.jupiter.api.Test
    void testFindAll() {
        when(veterinariosRepository.findAll()).thenReturn(Arrays.asList(veterinarios));
        assertNotNull(veterinariosService.findAll());
    }
}
