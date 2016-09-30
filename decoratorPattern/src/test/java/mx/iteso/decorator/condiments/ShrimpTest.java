package mx.iteso.decorator.condiments;

import mx.iteso.decorator.Taco;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

/**
 * Created by fernando on 29/09/16.
 */
public class ShrimpTest {
    private Taco taco;
    @Before
    public void setUp(){
        taco = mock((Taco.class));
    }

    @Test
    public void testCostRegular(){
        Taco shrimp = new Shrimp(taco);
        when(taco.cost()).thenReturn(8.0);
        when(taco.getSize()).thenReturn(Taco.Size.NORMAL);
        double cost = shrimp.cost();
        assertEquals(8.0, cost,0);
    }
    @Test
    public void testDescription(){
        Taco tortillaHarina = new TortillaHarina(taco);
        when(taco.getDescription()).thenReturn("Taco Normal");
        String desc = tortillaHarina.getDescription();
        assertEquals("Taco Normal en tortilla de harina", desc);
    }
}
