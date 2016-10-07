package mx.iteso.factory.stores;

import mx.iteso.factory.Pozole;
import mx.iteso.factory.PozoleStore;
import mx.iteso.factory.PozoleType;
import mx.iteso.factory.pozoles.*;

/**
 * Created by fernando on 6/10/16.
 */
public class PozoleBlancoStore extends PozoleStore {

    protected Pozole createPozole(PozoleType meat) {
        switch (meat) {
            case POLLO:
                return new PozoleRojoPollo();
            case CACHETE:
                return new PozoleBlancoCachete();
            case OREJA:
                return new PozoleBlancoOreja();
            case PIERNA:
                return new PozoleBlancoPierna();
            case TROMPA:
                return new PozoleBlancoTrompa();
            default:
                return null;
        }
    }
}
