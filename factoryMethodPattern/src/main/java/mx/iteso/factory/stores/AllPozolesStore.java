package mx.iteso.factory.stores;

import mx.iteso.factory.Pozole;
import mx.iteso.factory.PozoleStore;
import mx.iteso.factory.PozoleType;

/**
 * Created by a-rmz on 10/6/16.
 */
public class AllPozolesStore {

    public Pozole createPozole(PozoleType pozoleType, PozoleType meat) {
        Pozole pozole;
        PozoleStore store = null;

        if (pozoleType == PozoleType.POZOLE_ROJO) {
            store = new PozoleRojoStore();
        } else if (pozoleType == PozoleType.POZOLE_VERDE) {
            store = new PozoleVerdeStore();
        } else if (pozoleType == PozoleType.POZOLE_BLANCO) {
            store = new PozoleBlancoStore();
        } else if (pozoleType == PozoleType.MENUDO) {
            store = new MenudoStore();
        } else if (pozoleType == PozoleType.POZOLILLO) {
            store = new PozolilloStore();
        }

        pozole = store.orderPozole(meat);
        return pozole;
    }
}
