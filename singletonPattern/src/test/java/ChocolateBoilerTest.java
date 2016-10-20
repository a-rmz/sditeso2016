import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by fernando on 20/10/16.
 */
public class ChocolateBoilerTest {
    private ChocolateBoiler chocolateBoiler;

    @Before
    public void setup () {
        chocolateBoiler = ChocolateBoiler.getInstance();
    }

    @Test
    public void testFill (){
        chocolateBoiler.fill();
    }

    @Test
    public void testDrain (){
        chocolateBoiler.drain();
    }

    @Test
    public void testBoil (){
        chocolateBoiler.boil();
    }
}
