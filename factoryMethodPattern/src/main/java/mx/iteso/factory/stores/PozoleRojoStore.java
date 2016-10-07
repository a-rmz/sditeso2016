package mx.iteso.factory.stores;

import mx.iteso.factory.Pozole;
import mx.iteso.factory.PozoleStore;
import mx.iteso.factory.PozoleType;
import mx.iteso.factory.pozoles.*;

public class PozoleRojoStore extends PozoleStore {

    protected Pozole createPozole(PozoleType meat) {
        switch (meat) {
            case POLLO:
                return new PozoleRojoPollo();
            case CACHETE:
                return new PozoleRojoCachete();
            case OREJA:
                return new PozoleRojoOreja();
            case PIERNA:
                return new PozoleRojoPierna();
            case TROMPA:
                return new PozoleRojoTrompa();
            default:
                return null;
        }
    }
}
