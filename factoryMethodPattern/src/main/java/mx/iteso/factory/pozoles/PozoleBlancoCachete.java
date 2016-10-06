package mx.iteso.factory.pozoles;

import mx.iteso.factory.Pozole;

/**
 * Created by fernando on 6/10/16.
 */
public class PozoleBlancoCachete extends Pozole {
    public PozoleBlancoCachete () {
        name = "Pozole Blanco con Cachete";
        broth = "Caldo Blanco";
        toppings.add("Lechuga");
        toppings.add("Oregano");
        toppings.add("Rabanos");
    }
}
