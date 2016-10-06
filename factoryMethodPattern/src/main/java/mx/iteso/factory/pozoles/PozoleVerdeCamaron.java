package mx.iteso.factory.pozoles;


import mx.iteso.factory.Pozole;

/**
 * Created by fernando on 6/10/16.
 */
public class PozoleVerdeCamaron extends Pozole {
    public PozoleVerdeCamaron () {
        name = "Pozole Verde con Camaron";
        broth = "Caldo Verde";
        toppings.add("Oregano");
        toppings.add("Lechuga");
        toppings.add("Rabanos");
    }
}
