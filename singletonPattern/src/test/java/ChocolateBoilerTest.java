import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

/**
 * Created by fernando on 20/10/16.
 */
public class ChocolateBoilerTest {
    private ChocolateBoiler chocolateBoiler1;
    private ChocolateBoiler chocolateBoiler2;
    private ChocolateBoiler chocolateBoiler3;
    private ChocolateBoiler chocolateBoiler4;
    private ChocolateBoiler chocolateBoiler5;
    private ChocolateBoiler boilerTested1;
    private ChocolateBoiler boilerTested2;

    @Before
    public void setup () {
        chocolateBoiler1 = ChocolateBoiler.getInstance();
        chocolateBoiler2 = ChocolateBoiler.getInstance();
        chocolateBoiler3 = ChocolateBoiler.getInstance();
        chocolateBoiler4 = ChocolateBoiler.getInstance();
        chocolateBoiler5 = ChocolateBoiler.getInstance();
    }

    @Test
    public void testFill (){
        boilerTested1 = chocolateBoiler1;
        boilerTested1.fill();
        boilerTested1 = chocolateBoiler2;
        boilerTested1.fill();

        boilerTested2 = chocolateBoiler1;
        Assert.assertEquals(false, chocolateBoiler1.isEmpty());
        Assert.assertEquals(false, chocolateBoiler1.isBoiled());
        boilerTested2 = chocolateBoiler2;
        Assert.assertEquals(false, chocolateBoiler1.isEmpty());
        Assert.assertEquals(false, chocolateBoiler1.isBoiled());
    }

    @Test
    public void testBoil (){
        boilerTested1 = chocolateBoiler1;
        boilerTested1.fill();
        boilerTested1.boil();
        boilerTested1 = chocolateBoiler2;
        boilerTested1.fill();
        boilerTested1.boil();

        boilerTested2 = chocolateBoiler1;
        Assert.assertEquals(false, chocolateBoiler1.isEmpty());
        Assert.assertEquals(true, chocolateBoiler1.isBoiled());
        boilerTested2 = chocolateBoiler2;
        Assert.assertEquals(false, chocolateBoiler1.isEmpty());
        Assert.assertEquals(true, chocolateBoiler1.isBoiled());

    }

    @Test
    public void testDrain (){
        boilerTested1 = chocolateBoiler1;
        boilerTested1.fill();
        boilerTested1.boil();
        boilerTested1.drain();

        boilerTested1 = chocolateBoiler2;
        boilerTested1.fill();
        boilerTested1.boil();
        boilerTested1.drain();

        boilerTested2 = chocolateBoiler1;
        Assert.assertEquals(true, chocolateBoiler1.isEmpty());
        Assert.assertEquals(true, chocolateBoiler1.isBoiled());
        boilerTested2 = chocolateBoiler2;
        Assert.assertEquals(true, chocolateBoiler1.isEmpty());
        Assert.assertEquals(true, chocolateBoiler1.isBoiled());
    }

}
