package mx.iteso.decorator.tacos.tacos;

import mx.iteso.decorator.Taco;
import mx.iteso.decorator.tacos.Volcan;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by a-rmz on 9/30/16.
 */
public class VolcanTest {

    @Test
    public void testCost() {
        Taco taco = new Volcan();
        assertEquals(10.00, taco.cost(), 0);
    }


}
