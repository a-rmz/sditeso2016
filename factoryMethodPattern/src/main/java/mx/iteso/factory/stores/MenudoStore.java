package mx.iteso.factory.stores;

import mx.iteso.factory.Pozole;
import mx.iteso.factory.PozoleStore;
import mx.iteso.factory.PozoleType;
import mx.iteso.factory.pozoles.basePozoles.Menudo;
import mx.iteso.factory.pozoles.toppings.Col;
import mx.iteso.factory.pozoles.toppings.Oregano;
import mx.iteso.factory.pozoles.toppings.Rabano;

public class MenudoStore extends PozoleStore {

    @Override
    protected Pozole createPozole(PozoleType meat) {
        Pozole pozole = new Menudo();
        pozole = new Oregano(pozole);
        pozole = new Col(pozole);
        pozole = new Rabano(pozole);
        return pozole;
    }
}
