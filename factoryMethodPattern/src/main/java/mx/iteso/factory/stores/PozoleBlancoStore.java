package mx.iteso.factory.stores;

import mx.iteso.factory.Pozole;
import mx.iteso.factory.PozoleStore;
import mx.iteso.factory.PozoleType;
import mx.iteso.factory.pozoles.basePozoles.PozoleBlanco;
import mx.iteso.factory.pozoles.meats.*;

/**
 * Created by fernando on 6/10/16.
 */
public class PozoleBlancoStore extends PozoleStore {

    protected Pozole createPozole(PozoleType meat) {
        Pozole pozole = new PozoleBlanco();
        switch (meat) {
            case POLLO:
                return new Pollo(pozole);
            case CAMARON:
                return new Camaron(pozole);
            case CACHETE:
                return new Cachete(pozole);
            case OREJA:
                return new Oreja(pozole);
            case PIERNA:
                return new Pierna(pozole);
            case TROMPA:
                return new Trompa(pozole);
            case RES:
                return new Res(pozole);
            default:
                return null;
        }
    }
}

