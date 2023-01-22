package com.DH.almacenPizzas;

import com.DH.almacenPizzas.Exception.PizzaException;
import com.DH.almacenPizzas.Model.Pizza;
import com.DH.almacenPizzas.Productfactory.ProductFactory;

import java.awt.color.ProfileDataException;
import java.util.ArrayList;
import java.util.List;

public class Pizzeria {
    private List<Pizza> pizzaList;


    public Pizzeria() {
        pizzaList = new ArrayList<Pizza>();

    }

    public void mostrarMenu (){
        System.out.println("<<<<<PIZZAS DISPONIBLES>>>>>>>");
        for(Pizza p : pizzaList){
            System.out.println("PIZZA " + p.getNombre()+ " su precio es de $ " + p.getPrecioBase());
        }
    }

    public  void addProductos(String codigo){

        try {
            pizzaList.add(ProductFactory.getInstance().crearProducto(codigo));
        }catch (PizzaException e){
            e.printStackTrace();
        }


    }






}
