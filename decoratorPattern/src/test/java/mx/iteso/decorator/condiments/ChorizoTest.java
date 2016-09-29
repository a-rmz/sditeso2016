package mx.iteso.decorator.condiments;

import mx.iteso.decorator.Taco;
import mx.iteso.decorator.condiments.meat.Chorizo;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 * Created by a-rmz on 9/29/16.
 */
public class ChorizoTest {
    private Taco taco;
    @Before
    public void setUp(){
        taco = mock((Taco.class));
    }

    @Test
    public void testCostRegular(){
        Taco chorizo = new Chorizo(taco);
        when(taco.cost()).thenReturn(8.0);
        when(taco.getSize()).thenReturn(Taco.Size.NORMAL);
        double cost = chorizo.cost();
        assertEquals(8.0, cost,0);
    }

    @Test
    public void testCostMini(){
        Taco chorizo = new Chorizo(taco);
        when(taco.cost()).thenReturn(8.0);
        when(taco.getSize()).thenReturn(Taco.Size.MINI);
        double cost = chorizo.cost();
        assertEquals(6.50, cost, 0);
    }

    @Test
    public void testCostMega(){
        Taco chorizo = new Chorizo(taco);
        when(taco.cost()).thenReturn(8.0);
        when(taco.getSize()).thenReturn(Taco.Size.MEGA);
        double cost = chorizo.cost();
        assertEquals(10.0, cost, 0);
    }

    @Test
    public void testDescription(){
        Taco chorizo = new Chorizo(taco);
        when(taco.getDescription()).thenReturn("Taco Normal");
        String desc = chorizo.getDescription();
        assertEquals("Taco Normal de chorizo", desc);
    }
}
