package mx.iteso.factory.pozoles.toppings;

import mx.iteso.factory.Pozole;
import mx.iteso.factory.PozoleType;

/**
 * Created by a-rmz on 10/7/16.
 */
public class Lechuga extends Pozole {
    Pozole pozole;

    public Lechuga(Pozole pozole) {
        this.pozole = pozole;
    }


    @Override
    public String serve() {
        return pozole.serve();
    }

    @Override
    public String prepare() {
        return pozole.prepare() + "\nAdding " + PozoleType.LECHUGA;
    }

    @Override
    public String getName() {
        return pozole.getName() + " with " + PozoleType.LECHUGA;
    }
}
