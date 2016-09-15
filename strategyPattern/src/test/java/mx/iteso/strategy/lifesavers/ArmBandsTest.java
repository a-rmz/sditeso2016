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
        Assert.assertEquals("", armBands.performDeflate_());
    }
}
