package com.DH.almacenPizzas.Model;

public class Psimple extends Pizza{

    private Boolean esGrande;
    public Psimple(String nombre, Double precioBase, String descripcion, Boolean esGrande) {
        super(nombre, precioBase, descripcion);
        this.esGrande = esGrande;

    }


    @Override
    public Double calcularPrecio() {
        return getPrecioBase();

    }
}
