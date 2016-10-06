package mx.iteso.factory.pozoles;

import mx.iteso.factory.Pozole;

/**
 * Created by fernando on 6/10/16.
 */
public class PozoleBlancoPollo extends Pozole {
    public PozoleBlancoPollo () {
        name = "Pozole Blanco con Pollo";
        broth = "Caldo Blanco";
        toppings.add("Cebolla");
        toppings.add("Oregano");
        toppings.add("Rabanos");
    }
}
