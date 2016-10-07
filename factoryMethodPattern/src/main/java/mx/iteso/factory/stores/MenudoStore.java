package mx.iteso.factory.stores;

import mx.iteso.factory.Pozole;
import mx.iteso.factory.PozoleStore;
import mx.iteso.factory.PozoleType;
import mx.iteso.factory.pozoles.basePozoles.Menudo;

public class MenudoStore extends PozoleStore {

    @Override
    protected Pozole createPozole(PozoleType meat) {
        Pozole pozole = new Menudo();
        return pozole;
    }
}
