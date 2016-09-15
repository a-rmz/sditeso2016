package mx.iteso.strategy.lifesavers;

import mx.iteso.strategy.behaviors.DeflateBehavior;
import mx.iteso.strategy.behaviors.FlotationBehavior;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by a-rmz on 9/15/16.
 */
public class ArmBandsTest {

    @Test
    public void testArmBands() {
        ArmBands armBands = new ArmBands();
        Assert.assertEquals(DeflateBehavior.DEFLATE, armBands.performDeflate());
        Assert.assertEquals(DeflateBehavior.INFLATE, armBands.performInflate());
        Assert.assertEquals(FlotationBehavior.FLOTATE, armBands.performFloat());
    }
}
