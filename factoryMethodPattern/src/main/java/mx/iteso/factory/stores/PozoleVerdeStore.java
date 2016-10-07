package mx.iteso.factory.stores;

import mx.iteso.factory.Pozole;
import mx.iteso.factory.PozoleStore;
import mx.iteso.factory.PozoleType;
import mx.iteso.factory.pozoles.*;

public class PozoleVerdeStore extends PozoleStore {

    @Override
    protected Pozole createPozole(PozoleType meat) {
        switch (meat) {
            case POLLO:
                return new PozoleVerdePollo();
            case CACHETE:
                return new PozoleVerdeCachete();
            case OREJA:
                return new PozoleVerdeOreja();
            case PIERNA:
                return new PozoleVerdePierna();
            case TROMPA:
                return new PozoleVerdeTrompa();
            default:
                return null;
        }
    }
}
