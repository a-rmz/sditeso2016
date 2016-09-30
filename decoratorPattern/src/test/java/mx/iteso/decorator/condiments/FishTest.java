package mx.iteso.decorator.condiments;

import mx.iteso.decorator.Taco;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

/**
 * Created by fernando on 30/09/16.
 */
public class FishTest {
    private Taco taco;
    @Before
    public void setUp(){
        taco = mock((Taco.class));
    }

    @Test
    public void testCostRegular(){
        Taco fish = new Fish(taco);
        when(taco.cost()).thenReturn(8.0);
        when(taco.getSize()).thenReturn(Taco.Size.NORMAL);
        double cost = fish.cost();
        assertEquals(12.0, cost,0);
    }

    @Test
    public void testCostMega(){
        Taco fish = new Fish(taco);
        when(taco.cost()).thenReturn(8.0);
        when(taco.getSize()).thenReturn(Taco.Size.MEGA);
        double cost = fish.cost();
        assertEquals(15.0, cost,0);
    }

    @Test
    public void testDescription(){
        Taco fish = new Fish(taco);
        when(taco.getDescription()).thenReturn("Taco Normal");
        String desc = fish.getDescription();
        assertEquals("Taco Normal con pescado", desc);
    }

}
