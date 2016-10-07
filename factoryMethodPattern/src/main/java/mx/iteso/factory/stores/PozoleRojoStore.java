package mx.iteso.factory.stores;

import mx.iteso.factory.Pozole;
import mx.iteso.factory.PozoleStore;
import mx.iteso.factory.PozoleType;
import mx.iteso.factory.pozoles.basePozoles.PozoleRojo;
import mx.iteso.factory.pozoles.meats.*;
import mx.iteso.factory.pozoles.toppings.Col;
import mx.iteso.factory.pozoles.toppings.Oregano;
import mx.iteso.factory.pozoles.toppings.Rabano;

public class PozoleRojoStore extends PozoleStore {

    protected Pozole createPozole(PozoleType meat) {
        Pozole pozole = new PozoleRojo();

        pozole = new Col(pozole);
        pozole = new Oregano(pozole);
        pozole = new Rabano(pozole);

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
