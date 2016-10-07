package mx.iteso.factory.pozoles;

import mx.iteso.factory.Pozole;

/**
 * Created by fernando on 6/10/16.
 */
public class PozoleVerdeRes extends Pozole {
    public PozoleVerdeRes() {
        name = "Pozole Verde con Res";
        broth = "Caldo Verde";
        toppings.add("Cebolla");
        toppings.add("Lechuga");
        toppings.add("Oregano");
    }
}
