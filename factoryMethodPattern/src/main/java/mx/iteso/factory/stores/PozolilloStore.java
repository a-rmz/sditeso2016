package mx.iteso.factory.stores;

import mx.iteso.factory.Pozole;
import mx.iteso.factory.PozoleStore;
import mx.iteso.factory.PozoleType;
import mx.iteso.factory.pozoles.basePozoles.Pozolillo;

/**
 * Created by a-rmz on 10/6/16.
 */
public class PozolilloStore extends PozoleStore {

    @Override
    public Pozole createPozole(PozoleType meat) {
        Pozole pozole = new Pozolillo();
        return pozole;
    }
}
