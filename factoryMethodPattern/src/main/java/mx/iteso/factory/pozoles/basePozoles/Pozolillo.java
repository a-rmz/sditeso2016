package mx.iteso.factory.pozoles.basePozoles;

import mx.iteso.factory.Pozole;
import mx.iteso.factory.PozoleType;

/**
 * Created by a-rmz on 10/6/16.
 */
public class Pozolillo extends Pozole {

    public Pozolillo() {
        name = PozoleType.POZOLILLO.getName();
        broth = PozoleType.CALDO_VERDE.getName();
    }

    @Override
    public String serve() {
        return  "Serving our special Pozolillo in the magnificent Pozolillo plates...";
    }
}
