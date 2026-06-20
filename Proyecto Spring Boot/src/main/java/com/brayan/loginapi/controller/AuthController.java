package com.brayan.loginapi.controller;

import com.brayan.loginapi.model.Usuario;
import com.brayan.loginapi.service.AuthService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/*
 * Controlador encargado de gestionar
 * el registro e inicio de sesión.
 */
@RestController
@RequestMapping("/api")
public class AuthController {

    @Autowired
    private AuthService authService;

    /*
     * Endpoint para registrar usuarios
     */
    @PostMapping("/registro")
    public String registrar(
            @RequestBody Usuario usuario) {

        return authService.registrar(usuario);
    }

    /*
     * Endpoint para iniciar sesión
     */
    @PostMapping("/login")
    public String login(
            @RequestBody Usuario usuario) {

        return authService.login(usuario);
    }
}