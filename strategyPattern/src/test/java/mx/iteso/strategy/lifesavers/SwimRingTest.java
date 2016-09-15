package mx.iteso.strategy.lifesavers;

import mx.iteso.strategy.behaviors.DeflateBehavior;
import mx.iteso.strategy.behaviors.FlotationBehavior;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by fernando on 15/09/16.
 */
public class SwimRingTest {

    @Test
    public void testSwimRing() {
        SwimRing swimRing = new SwimRing();
        Assert.assertEquals(DeflateBehavior.DEFLATE, swimRing.performDeflate());
        Assert.assertEquals(DeflateBehavior.INFLATE, swimRing.performInflate());
        Assert.assertEquals(FlotationBehavior.FLOTATE, swimRing.performFloat());
    }
}
