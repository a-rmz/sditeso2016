package mx.iteso.decorator.condiments;

import mx.iteso.decorator.Taco;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

/**
 * Created by fernando on 29/09/16.
 */
public class QuesoTest {
    private Taco taco;
    @Before
    public void setUp(){
        taco = mock((Taco.class));
    }

    @Test
    public void testCostMini(){
        Taco queso = new Queso(taco);
        when(taco.cost()).thenReturn(6.5);
        when(taco.getSize()).thenReturn(Taco.Size.MINI);
        double cost = queso.cost();
        assertEquals(6.5, cost,0);
    }

    @Test
    public void testCostRegular(){
        Taco queso = new Queso(taco);
        when(taco.cost()).thenReturn(8.0);
        double cost = queso.cost();
        assertEquals(8.0, cost,0);
    }

    @Test
    public void testCostMega(){
        Taco queso = new Queso(taco);
        when(taco.cost()).thenReturn(10.0);
        when(taco.getSize()).thenReturn(Taco.Size.MEGA);
        double cost = queso.cost();
        assertEquals(10.0, cost,0);
    }

    @Test
    public void testDescription(){
        Taco queso = new Queso(taco);
        when(taco.getDescription()).thenReturn("Taco Normal");
        String desc = queso.getDescription();
        assertEquals("Taco Normal con queso", desc);
    }
}
