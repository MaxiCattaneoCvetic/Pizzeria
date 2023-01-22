package com.DH.almacenPizzas;

import com.DH.almacenPizzas.Model.Pizza;
import com.DH.almacenPizzas.Productfactory.ProductFactory;

public class Main {

    public static void main(String[] args) {

        Pizzeria mechita = new Pizzeria();
        mechita.addProductos(ProductFactory.MUZZARELAG);
        mechita.addProductos(ProductFactory.ESPECIALC);
        mechita.addProductos(ProductFactory.ANANAG);


        mechita.mostrarMenu();












    }
}
