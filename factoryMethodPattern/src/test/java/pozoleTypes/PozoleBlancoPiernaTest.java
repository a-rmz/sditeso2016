package pozoleTypes;

import mx.iteso.factory.pozoles.PozoleBlancoPierna;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;


/**
 * Created by fernando on 6/10/16.
 */
public class PozoleBlancoPiernaTest {
    PozoleBlancoPierna pozoleBlancoPierna;
    @Before
    public void setUp(){
        pozoleBlancoPierna = new PozoleBlancoPierna();
    }

    @Test
    public void testName() {
        assertEquals("Pozole Blanco con Pierna" ,pozoleBlancoPierna.getName());
    }

    @Test
    public void testBroth() {
        assertEquals("Caldo Blanco",pozoleBlancoPierna.broth);
    }

    @Test
    public void testToppings(){
        ArrayList<String> toppings = pozoleBlancoPierna.toppings;
        assertEquals("Cebolla",toppings.get(0));
        assertEquals("Oregano",toppings.get(1));
        assertEquals("Rabanos",toppings.get(2));
    }
}
