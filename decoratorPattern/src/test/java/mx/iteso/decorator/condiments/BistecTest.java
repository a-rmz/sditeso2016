package mx.iteso.decorator.condiments;

import mx.iteso.decorator.Taco;
import mx.iteso.decorator.condiments.meat.Bistec;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 * Created by a-rmz on 9/29/16.
 */
public class BistecTest {
    private Taco taco;
    @Before
    public void setUp(){
        taco = mock((Taco.class));
    }

    @Test
    public void testCostRegular(){
        Taco bistec = new Bistec(taco);
        when(taco.cost()).thenReturn(8.0);
        when(taco.getSize()).thenReturn(Taco.Size.NORMAL);
        double cost = bistec.cost();
        assertEquals(8.0, cost,0);
    }

    @Test
    public void testCostMini(){
        Taco bistec = new Bistec(taco);
        when(taco.cost()).thenReturn(8.0);
        when(taco.getSize()).thenReturn(Taco.Size.MINI);
        double cost = bistec.cost();
        assertEquals(6.50, cost, 0);
    }

    @Test
    public void testCostMega(){
        Taco bistec = new Bistec(taco);
        when(taco.cost()).thenReturn(8.0);
        when(taco.getSize()).thenReturn(Taco.Size.MEGA);
        double cost = bistec.cost();
        assertEquals(10.0, cost, 0);
    }

    @Test
    public void testDescription(){
        Taco bistec = new Bistec(taco);
        when(taco.getDescription()).thenReturn("Taco Normal");
        String desc = bistec.getDescription();
        assertEquals("Taco Normal de bistec", desc);
    }
}
