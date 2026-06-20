package com.brayan.loginapi.model;

/*
 * Modelo que representa
 * un producto del inventario.
 */
public class Producto {

    private Long id;
    private String nombre;
    private int cantidad;
    private double precio;
    private boolean vendido;

    public Producto() {
    }

    public Producto(
            Long id,
            String nombre,
            int cantidad,
            double precio,
            boolean vendido) {

        this.id = id;
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.precio = precio;
        this.vendido = vendido;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public boolean isVendido() {
        return vendido;
    }

    public void setVendido(boolean vendido) {
        this.vendido = vendido;
    }
}