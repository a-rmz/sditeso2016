package mx.iteso.strategy.lifesavers;

import mx.iteso.strategy.behaviors.DeflateBehavior;
import mx.iteso.strategy.behaviors.FlotationBehavior;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by a-rmz on 9/15/16.
 */
public class FoamFloatTest {

    @Test
    public void testLifeVest() {
        FoamFloat foamFloat = new FoamFloat();
        Assert.assertEquals(DeflateBehavior.CANT_DEFLATE, foamFloat.performDeflate());
        Assert.assertEquals(DeflateBehavior.CANT_INFLATE, foamFloat.performInflate());
        Assert.assertEquals(FlotationBehavior.FLOTATE, foamFloat.performFloat());
    }

}
