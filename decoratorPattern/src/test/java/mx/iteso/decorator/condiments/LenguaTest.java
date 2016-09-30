package mx.iteso.decorator.condiments;

import mx.iteso.decorator.Taco;
import mx.iteso.decorator.condiments.meat.Lengua;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 * Created by a-rmz on 9/29/16.
 */
public class LenguaTest {
    private Taco taco;
    @Before
    public void setUp(){
        taco = mock((Taco.class));
        when(taco.cost()).thenReturn(8.0);
    }

    @Test
    public void testCostRegular(){
        Taco lengua = new Lengua(taco);
        when(taco.getSize()).thenReturn(Taco.Size.NORMAL);
        double cost = lengua.cost();
        assertEquals(10.0, cost,0);
    }

    @Test
    public void testCostMini(){
        Taco lengua = new Lengua(taco);
        when(taco.getSize()).thenReturn(Taco.Size.MINI);
        double cost = lengua.cost();
        assertEquals(8.50, cost, 0);
    }

    @Test
    public void testCostMega(){
        Taco lengua = new Lengua(taco);
        when(taco.getSize()).thenReturn(Taco.Size.MEGA);
        double cost = lengua.cost();
        assertEquals(12.0, cost, 0);
    }

    @Test
    public void testDescription(){
        Taco lengua = new Lengua(taco);
        when(taco.getDescription()).thenReturn("Taco Normal");
        String desc = lengua.getDescription();
        assertEquals("Taco Normal de lengua", desc);
    }
}
