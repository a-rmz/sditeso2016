package mx.iteso.strategy.lifesavers;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by a-rmz on 9/15/16.
 */
public class ArmBandsTest {

    @Test
    public void testArmBands() {
        ArmBands armBands = new ArmBands();
        Assert.assertEquals("I'm deflating!", armBands.performDeflate());
        Assert.assertEquals("I'm inflating!", armBands.performInflate());
        Assert.assertEquals("I'm floating!", armBands.performFloat());
    }
}
