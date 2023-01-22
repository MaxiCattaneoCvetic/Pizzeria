package com.DH.almacenPizzas.Model;

public class Pmixta extends Pizza{


    public Pmixta(String nombre, Double precioBase, String descripcion) {
        super(nombre, precioBase, descripcion);


    }


    @Override
    public Double calcularPrecio() {
        return getPrecioBase();
    }


}
