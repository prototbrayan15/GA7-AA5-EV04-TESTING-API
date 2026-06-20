package com.brayan.loginapi.controller;

import com.brayan.loginapi.model.Producto;
import com.brayan.loginapi.service.ProductoService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/*
 * Controlador encargado de gestionar
 * los productos del inventario.
 */
@RestController
@RequestMapping("/api/productos")
public class ProductoController {

    @Autowired
    private ProductoService productoService;

    // Obtener todos los productos
    @GetMapping
    public List<Producto> obtenerProductos() {

        return productoService.obtenerProductos();
    }

    // Agregar producto
    @PostMapping
    public String agregarProducto(
            @RequestBody Producto producto) {

        return productoService.agregarProducto(producto);
    }

    // Eliminar producto
    @DeleteMapping("/{id}")
    public String eliminarProducto(
            @PathVariable Long id) {

        return productoService.eliminarProducto(id);
    }

    // Marcar producto como vendido
    @PutMapping("/vendido/{id}")
    public String marcarVendido(
            @PathVariable Long id) {

        return productoService.marcarVendido(id);
    }
}