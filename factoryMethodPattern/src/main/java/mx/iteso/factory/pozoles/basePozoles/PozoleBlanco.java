package mx.iteso.factory.pozoles.basePozoles;

import mx.iteso.factory.Pozole;
import mx.iteso.factory.PozoleType;

/**
 * Created by a-rmz on 10/7/16.
 */
public class PozoleBlanco extends Pozole {

    public PozoleBlanco() {
        name = PozoleType.POZOLE_BLANCO.getName();
        broth = PozoleType.CALDO_BLANCO.getName();
    }
}