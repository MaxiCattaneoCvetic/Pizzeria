package com.DH.almacenPizzas.Model;

public abstract class Pizza {
    private String nombre;
    private Double precioBase;
    private String descripcion;

    public abstract Double calcularPrecio();

    public Pizza(String nombre, Double precioBase, String descripcion) {
        this.nombre = nombre;
        this.precioBase = precioBase;
        this.descripcion = descripcion;
    }

    public Double getPrecioBase() {
        return precioBase;
    }

    public String getNombre() {
        return nombre;
    }
}
