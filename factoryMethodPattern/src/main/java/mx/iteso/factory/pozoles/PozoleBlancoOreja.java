package mx.iteso.factory.pozoles;

import mx.iteso.factory.Pozole;

/**
 * Created by fernando on 6/10/16.
 */
public class PozoleBlancoOreja extends Pozole {
    public PozoleBlancoOreja () {
        name = "Pozole Blanco con Oreja";
        broth = "Caldo Blanco";
        toppings.add("Col");
        toppings.add("Oregano");
        toppings.add("Rabanos");
    }
}
