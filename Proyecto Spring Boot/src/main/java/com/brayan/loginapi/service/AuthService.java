package com.brayan.loginapi.service;

import com.brayan.loginapi.model.Usuario;
import org.springframework.stereotype.Service;

/*
 * Servicio encargado del registro
 * y autenticación de usuarios.
 */
@Service
public class AuthService {

    private Usuario usuarioRegistrado;

    // Registrar usuario
    public String registrar(Usuario usuario) {

        usuarioRegistrado = usuario;

        return "Usuario registrado correctamente";
    }

    // Iniciar sesión
    public String login(Usuario usuario) {

        if (usuarioRegistrado != null &&
                usuarioRegistrado.getUsuario().equals(usuario.getUsuario()) &&
                usuarioRegistrado.getPassword().equals(usuario.getPassword())) {

            return "Autenticación satisfactoria";
        }

        return "Error en la autenticación";
    }
}