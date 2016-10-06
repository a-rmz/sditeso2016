package mx.iteso.factory.pozoles;

import mx.iteso.factory.Pozole;

/**
 * Created by a-rmz on 10/6/16.
 */
public class Pozolillo extends Pozole {

    public Pozolillo() {
        name = "Pozolillo";
        broth = "Caldo Verde";
        toppings.add("Lechuga");
        toppings.add("Elote");
        toppings.add("Rabanos");
    }

    @Override
    public void serve() {
        System.out.println("Serving our special Pozolillo in the magnificent Pozolillo plates...");
    }
}
