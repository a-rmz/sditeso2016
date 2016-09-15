package mx.iteso.strategy.lifesavers;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by a-rmz on 9/15/16.
 */
public class FoamFloatTest {

    @Test
    public void testFoamFloat() {
        FoamFloat foamFloat = new FoamFloat();
        Assert.assertEquals("I'm deflating!", foamFloat.performDeflate());
        Assert.assertEquals("I'm inflating!", foamFloat.performInflate());
        Assert.assertEquals("I'm floating!", foamFloat.performFloat());
    }

}
