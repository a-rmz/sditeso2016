package mx.iteso.factory.pozoles.basePozoles;

import mx.iteso.factory.Pozole;
import mx.iteso.factory.PozoleType;

public class Menudo extends Pozole {

    public Menudo() {
        name = PozoleType.MENUDO.getName();
        broth = PozoleType.CALDO_ROJO.getName();
    }

    @Override
    public String serve() {
        return "Serving xtra hot in special menudo plate...";
    }
}
