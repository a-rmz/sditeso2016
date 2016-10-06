package mx.iteso.factory.pozoles;

import mx.iteso.factory.Pozole;

/**
 * Created by fernando on 6/10/16.
 */
public class PozoleRojoCamaron extends Pozole {
    public PozoleRojoCamaron () {
        name = "Pozole Rojo con Camaron";
        broth = "Caldo Rojo";
        toppings.add("Col");
        toppings.add("Cebolla");
        toppings.add("Rabanos");
    }
}
