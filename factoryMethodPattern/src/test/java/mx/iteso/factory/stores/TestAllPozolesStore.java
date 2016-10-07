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
        Pozole pozoleRojoPollo = allStore.createPozole(PozoleType.POZOLE_ROJO, PozoleType.POLLO);
        Assert.assertEquals(
                pozoleRojoPollo.getName(),
                PozoleType.POZOLE_ROJO.getName() + " con " + PozoleType.POLLO.getName()
        );
    }
}
