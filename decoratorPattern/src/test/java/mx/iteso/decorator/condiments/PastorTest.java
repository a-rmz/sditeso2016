package mx.iteso.decorator.condiments;

import mx.iteso.decorator.Taco;
import mx.iteso.decorator.condiments.meat.Pastor;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 * Created by a-rmz on 9/30/16.
 */
public class PastorTest {

    private Taco taco;
    @Before
    public void setUp(){
        taco = mock((Taco.class));
        when(taco.cost()).thenReturn(8.0);
    }

    @Test
    public void testCostRegular(){
        Taco pastor = new Pastor(taco);
        when(taco.getSize()).thenReturn(Taco.Size.NORMAL);
        double cost = pastor.cost();
        assertEquals(8.0, cost,0);
    }

    @Test
    public void testCostMini(){
        Taco pastor = new Pastor(taco);
        when(taco.getSize()).thenReturn(Taco.Size.MINI);
        double cost = pastor.cost();
        assertEquals(6.50, cost, 0);
    }

    @Test
    public void testCostMega(){
        Taco pastor = new Pastor(taco);
        when(taco.getSize()).thenReturn(Taco.Size.MEGA);
        double cost = pastor.cost();
        assertEquals(10.0, cost, 0);
    }

    @Test
    public void testDescription(){
        Taco pastor = new Pastor(taco);
        when(taco.getDescription()).thenReturn("Taco Normal");
        String desc = pastor.getDescription();
        assertEquals("Taco Normal de pastor", desc);
    }
    
}
