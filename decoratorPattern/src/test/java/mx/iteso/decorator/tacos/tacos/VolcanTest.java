package mx.iteso.decorator.tacos.tacos;

import mx.iteso.decorator.Taco;
import mx.iteso.decorator.tacos.Volcan;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by a-rmz on 9/30/16.
 */
public class VolcanTest {

    Taco taco;

    @Before
    public void setup() {
        taco = new Volcan();
    }

    @Test
    public void testCost() {
        assertEquals(10.00, taco.cost(), 0);
    }

    @Test
    public void testSize() {
        assertEquals(Taco.Size.NORMAL, taco.getSize());
    }


}
