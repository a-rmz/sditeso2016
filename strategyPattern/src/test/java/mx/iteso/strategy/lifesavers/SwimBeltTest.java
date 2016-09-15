package mx.iteso.strategy.lifesavers;

import mx.iteso.strategy.behaviors.DeflateBehavior;
import mx.iteso.strategy.behaviors.FlotationBehavior;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by a-rmz on 9/15/16.
 */
public class SwimBeltTest {

    @Test
    public void testSwimBelt() {
        SwimBelt swimBelt = new SwimBelt();
        Assert.assertEquals(DeflateBehavior.CANT_DEFLATE, swimBelt.performDeflate());
        Assert.assertEquals(DeflateBehavior.CANT_INFLATE, swimBelt.performInflate());
        Assert.assertEquals(FlotationBehavior.FLOTATE, swimBelt.performFloat());
    }

}
