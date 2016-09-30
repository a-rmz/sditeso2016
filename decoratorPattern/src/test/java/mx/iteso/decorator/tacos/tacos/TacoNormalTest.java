package mx.iteso.decorator.tacos.tacos;

import mx.iteso.decorator.Taco;
import mx.iteso.decorator.tacos.TacoNormal;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TacoNormalTest {


    @Test
    public void testCostNormal() {
        Taco taco = new TacoNormal(Taco.Size.NORMAL);
        assertEquals(8.0, taco.cost(), 0);
    }

    @Test
    public void testCostMini() {
        Taco taco = new TacoNormal(Taco.Size.MINI);
        assertEquals(6.50, taco.cost(), 0);
    }

    @Test
    public void testCostMega() {
        Taco taco = new TacoNormal(Taco.Size.MEGA);
        assertEquals(10.00, taco.cost(), 0);
    }
}
