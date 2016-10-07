package mx.iteso.factory.pozoles.toppings;

import mx.iteso.factory.Pozole;
import mx.iteso.factory.PozoleType;

/**
 * Created by a-rmz on 10/7/16.
 */
public class Oregano extends Pozole {
    Pozole pozole;

    @Override
    public String serve() {
        return pozole.serve();
    }

    @Override
    public String prepare() {
        return pozole.prepare() + "\nAdding " + PozoleType.OREGANO;
    }

    @Override
    public String getName() {
        return pozole.getName() + " with " + PozoleType.OREGANO;
    }
}
