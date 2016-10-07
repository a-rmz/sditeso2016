package mx.iteso.factory.pozoles;

import mx.iteso.factory.Pozole;

/**
 * Created by fernando on 6/10/16.
 */
public class PozoleBlancoCamaron extends Pozole {
    public PozoleBlancoCamaron() {
        name = "Pozole Blanco con Camaron";
        broth = "Caldo BLanco";
        toppings.add("Oregano");
        toppings.add("Cebolla");
        toppings.add("Rabanos");
    }
}
