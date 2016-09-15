package mx.iteso.strategy.lifesavers;

import mx.iteso.strategy.behaviors.DeflateBehavior;
import mx.iteso.strategy.behaviors.FlotationBehavior;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by a-rmz on 9/15/16.
 */
public class LifesaverCandyTest {

    @Test
    public void testLifesaverCandy() {
        LifesaverCandy lifesaverCandy = new LifesaverCandy();
        Assert.assertEquals(DeflateBehavior.CANT_DEFLATE, lifesaverCandy.performDeflate());
        Assert.assertEquals(DeflateBehavior.CANT_INFLATE, lifesaverCandy.performInflate());
        Assert.assertEquals(FlotationBehavior.SINK, lifesaverCandy.performFloat());
    }

}
