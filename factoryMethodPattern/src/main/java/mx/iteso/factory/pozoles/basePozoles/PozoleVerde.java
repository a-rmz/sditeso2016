package mx.iteso.factory.pozoles.basePozoles;

import mx.iteso.factory.Pozole;
import mx.iteso.factory.PozoleType;

/**
 * Created by a-rmz on 10/7/16.
 */
public class PozoleVerde extends Pozole {

    public PozoleVerde() {
        name = PozoleType.POZOLE_VERDE.getName();
        broth = PozoleType.CALDO_VERDE.getName();
    }
}
