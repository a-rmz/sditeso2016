package mx.iteso.factory.pozoles;

import mx.iteso.factory.Pozole;

/**
 * Created by fernando on 6/10/16.
 */
public class PozoleBlancoTrompa extends Pozole {
    public PozoleBlancoTrompa() {
        name = "Pozole Blanco con Trompa";
        broth = "Caldo Blanco";
        toppings.add("Oregano");
        toppings.add("Lechuga");
        toppings.add("Rabanos");
    }
}
