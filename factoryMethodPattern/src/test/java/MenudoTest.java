import mx.iteso.factory.Pozole;
import mx.iteso.factory.PozoleType;
import mx.iteso.factory.stores.AllPozolesStore;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

/**
 * Created by fernando on 6/10/16.
 */
public class MenudoTest {

    AllPozolesStore allStore;

    @Before
    public void setup() {
        allStore = new AllPozolesStore();
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
}
