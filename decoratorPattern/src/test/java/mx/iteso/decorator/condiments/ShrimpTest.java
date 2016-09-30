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
        assertEquals(12.0, cost,0);
    }

    @Test
    public void testCostMega(){
        Taco shrimp = new Shrimp(taco);
        when(taco.cost()).thenReturn(8.0);
        when(taco.getSize()).thenReturn(Taco.Size.MEGA);
        double cost = shrimp.cost();
        assertEquals(15.0, cost,0);
    }

    @Test
    public void testDescription(){
        Taco shrimp = new Shrimp(taco);
        when(taco.getDescription()).thenReturn("Taco Normal");
        String desc = shrimp.getDescription();
        assertEquals("Taco Normal con camaron", desc);
    }
}
