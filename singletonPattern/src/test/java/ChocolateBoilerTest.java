import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by fernando on 20/10/16.
 */
public class ChocolateBoilerTest {
    private ChocolateBoiler chocolateBoiler1;
    private ChocolateBoiler chocolateBoiler2;

    @Before
    public void setup () {
        chocolateBoiler1 = ChocolateBoiler.getInstance();
        chocolateBoiler2 = ChocolateBoiler.getInstance();
    }

    @Test
    public void testFill (){
        chocolateBoiler1.fill();
        Assert.assertEquals(false, chocolateBoiler1.isEmpty());
        Assert.assertEquals(false, chocolateBoiler1.isBoiled());
    }

    @Test
    public void testDrain (){
        chocolateBoiler1.drain();
    }

    @Test
    public void testBoil (){
        chocolateBoiler1.boil();
    }
}
