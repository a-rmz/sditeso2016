package mx.iteso.decorator.tacos.tacos;

import mx.iteso.decorator.Taco;
import mx.iteso.decorator.tacos.TacoNormal;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TacoNormalTest {

    @Test
    public void testCost() {
        Taco taco = new TacoNormal(Taco.Size.MINI);
        assertEquals(8.00, taco.cost(), 0);
    }
}
