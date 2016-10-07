package mx.iteso.factory.stores;

import mx.iteso.factory.Pozole;
import mx.iteso.factory.PozoleType;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by a-rmz on 10/6/16.
 */
public class TestAllPozolesStore {

    AllPozolesStore allStore;

    @Before
    public void setup() {
        allStore = new AllPozolesStore();
    }

    @Test
    public void testPozoleRojo() {
        Pozole pozoleRojo = allStore.createPozole(PozoleType.POZOLE_ROJO, PozoleType.POLLO);
        Assert.assertEquals(
                PozoleType.POZOLE_ROJO.getName() + " with "
                        + PozoleType.COL.getName() + " with "
                        + PozoleType.OREGANO.getName() + " with "
                        + PozoleType.RABANOS.getName() + " with "
                        + PozoleType.POLLO.getName(),
                pozoleRojo.getName()
        );
    }

    @Test
    public void testPozoleVerde() {
        Pozole pozoleVerde = allStore.createPozole(PozoleType.POZOLE_VERDE, PozoleType.RES);
        Assert.assertEquals(
                PozoleType.POZOLE_VERDE.getName() + " with "
                        + PozoleType.COL.getName() + " with "
                        + PozoleType.LECHUGA.getName() + " with "
                        + PozoleType.RABANOS.getName() + " with "
                        + PozoleType.RES.getName(),
                pozoleVerde.getName()
        );
    }

    @Test
    public void testPozoleBlanco() {
        Pozole pozoleBlanco = allStore.createPozole(PozoleType.POZOLE_BLANCO, PozoleType.CACHETE);
        Assert.assertEquals(
                PozoleType.POZOLE_BLANCO.getName() + " with "
                        + PozoleType.CEBOLLA.getName() + " with "
                        + PozoleType.OREGANO.getName() + " with "
                        + PozoleType.RABANOS.getName() + " with "
                        + PozoleType.CACHETE.getName(),
                pozoleBlanco.getName()
        );
    }

    @Test
    public void testMenudo() {
        Pozole menudo = allStore.createPozole(PozoleType.MENUDO, PozoleType.CACHETE);
        Assert.assertEquals(
                PozoleType.MENUDO.getName() + " with "
                        + PozoleType.OREGANO.getName() + " with "
                        + PozoleType.COL.getName() + " with "
                        + PozoleType.RABANOS.getName(),
                menudo.getName()
        );
    }

    @Test
    public void testPozolillo() {
        Pozole pozolillo = allStore.createPozole(PozoleType.POZOLILLO, PozoleType.CACHETE);
        Assert.assertEquals(
                PozoleType.POZOLILLO.getName() + " with "
                        + PozoleType.COL.getName() + " with "
                        + PozoleType.OREGANO.getName() + " with "
                        + PozoleType.LECHUGA.getName(),
                pozolillo.getName()
        );
    }
}
