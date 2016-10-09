package mx.iteso.factory.pozoles.basePozoles;

import mx.iteso.factory.Pozole;
import mx.iteso.factory.PozoleType;

/**
 * Created by a-rmz on 10/7/16.
 */
public class PozoleRojo extends Pozole {

    public PozoleRojo() {
        name = PozoleType.POZOLE_ROJO.getName();
        broth = PozoleType.CALDO_ROJO.getName();
    }

}
