package com.example.demo.service;

import static org.junit.Assert.assertNotNull;
import static org.mockito.Mockito.when;

import java.util.Arrays;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.model.Login;
import com.example.demo.repository.LoginRepository;

@SpringBootTest
public class LoginServiceTest {

    @InjectMocks
    private LoginService loginService;

    @Mock
    private LoginRepository loginRepository;

    private Login login;

    void setUp() {
        login = new Login();
        login.setContrasenia(null);
        login.setId_Login(0);
        login.setUsuario(null);
    }

    @Test
    void findAll(){
        when(loginRepository.findAll()).thenReturn(Arrays.asList(login));
        assertNotNull(loginService.findAll());
    }

}
