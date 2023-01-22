package com.DH.almacenPizzas.Productfactory;


import com.DH.almacenPizzas.Exception.PizzaException;
import com.DH.almacenPizzas.Model.Pizza;
import com.DH.almacenPizzas.Model.Pmixta;
import com.DH.almacenPizzas.Model.Psimple;

public class ProductFactory {

    private static ProductFactory instance;
    public static final String MUZZARELAC = "MUZZARELLAC";
    public static final String MUZZARELAG = "MUZZARELLAG";
    public static final String ESPECIALC = "ESPECIALC";
    public static final String ESPECIALG = "ESPECIALG";
    public static final String ANANAG = "ANANAG";
    public static final String COMBLOC = "COMBILOCA";



    private ProductFactory(){

    }

    public static ProductFactory getInstance(){
        if(instance == null){
            instance = new ProductFactory();
        }
        return instance;
    }

    public Pizza crearProducto(String codigo) throws PizzaException {
        switch (codigo){
            case "MUZZARELLAC":
                return  new Psimple("MUZZARELAC",700.0,"Muza-CHI",false);
            case "MUZZARELLAG":
                return  new Psimple("MUZZARELAG",700.0*2,"Muza-GRA",true);
            case "ESPECIALC":
                return  new Psimple("ESPECIALC",850.0,"ESP-CHI",false);
            case "ESPECIALG":
                return  new Psimple("ESPECIALG",850.0*2,"ESP-GRA",true);
            case "ANANAC":
                return  new Psimple("ANANAC",950.0,"ANA",false);
            case "ANANAG":
                return  new Psimple("ANANAG",950.0*2,"ANA",true);
            case "COMBILOCA":
                return  new Pmixta("COMBLOC",900.0,"COMBI1");


            default: throw new PizzaException("Codigo "+ codigo + " es invalido");
        }

    }

}
