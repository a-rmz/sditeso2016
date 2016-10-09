package pozoleTypes;

import mx.iteso.factory.pozoles.Menudo;
import mx.iteso.factory.pozoles.PozoleBlancoPierna;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;


/**
 * Created by fernando on 6/10/16.
 */
public class MenudoTest {
    Menudo menudo;
    @Before
    public void setUp(){
        menudo = new Menudo();
    }

    @Test
    public void testName() {
        assertEquals("Menudo" ,menudo.getName());
    }

    @Test
    public void testBroth() {
        assertEquals("Caldo Rojo",menudo.broth);
    }

    @Test
    public void testToppings(){
        ArrayList<String> toppings = menudo.toppings;
        assertEquals("Oregano",toppings.get(0));
        assertEquals("Col",toppings.get(1));
        assertEquals("Rabanos",toppings.get(2));
    }

}
