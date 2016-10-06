package mx.iteso.factory.pozoles;

import mx.iteso.factory.Pozole;

/**
 * Created by fernando on 6/10/16.
 */
public class PozoleBlancoPierna extends Pozole {
    public PozoleBlancoPierna () {
        name = "Pozole Blanco con Pierna";
        broth = "Caldo Blanco";
        toppings.add("Cebolla");
        toppings.add("Oregano");
        toppings.add("Rabanos");
    }
}
