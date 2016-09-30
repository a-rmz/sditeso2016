package mx.iteso.decorator.tacos.tacos;

import mx.iteso.decorator.Taco;
import mx.iteso.decorator.tacos.Quesadilla;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by a-rmz on 9/30/16.
 */
public class QuesadillaTest {

    @Test
    public void testCost() {
        Taco taco = new Quesadilla(Taco.Size.MINI);
        assertEquals(8.00, taco.cost(), 0);
    }

}
