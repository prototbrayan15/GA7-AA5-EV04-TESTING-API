package com.brayan.loginapi.service;

import com.brayan.loginapi.model.Producto;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/*
 * Servicio encargado de gestionar
 * los productos del inventario.
 */
@Service
public class ProductoService {

    private final List<Producto> productos =
            new ArrayList<>();

    // Obtener todos los productos
    public List<Producto> obtenerProductos() {
        return productos;
    }

    // Agregar producto
    public String agregarProducto(
            Producto producto) {

        productos.add(producto);

        return "Producto agregado correctamente";
    }

    // Eliminar producto
    public String eliminarProducto(
            Long id) {

        for (Producto producto : productos) {

            if (producto.getId().equals(id)) {

                productos.remove(producto);

                return "Producto eliminado correctamente";
            }
        }

        return "Producto no encontrado";
    }

    // Marcar producto vendido
    public String marcarVendido(
            Long id) {

        for (Producto producto : productos) {

            if (producto.getId().equals(id)) {

                producto.setVendido(true);

                return "Producto marcado como vendido";
            }
        }

        return "Producto no encontrado";
    }
}