package pozolesBlancosTests;

import mx.iteso.factory.Pozole;
import mx.iteso.factory.PozoleType;
import mx.iteso.factory.stores.AllPozolesStore;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by fernando on 8/10/16.
 */
public class PozoleBlancoPiernaTest {

    AllPozolesStore allStore;

    @Before
    public void setup() {
        allStore = new AllPozolesStore();
    }

    @Test
    public void testMenudo() {
        Pozole pozoleBlancoPierna = allStore.createPozole(PozoleType.POZOLE_BLANCO, PozoleType.PIERNA);
        Assert.assertEquals(
                PozoleType.POZOLE_BLANCO.getName() + " with "
                        + PozoleType.CEBOLLA.getName() + " with "
                        + PozoleType.OREGANO.getName() + " with "
                        + PozoleType.RABANOS.getName() + " with "
                        + PozoleType.PIERNA.getName(),
                pozoleBlancoPierna.getName()
        );
    }

}
