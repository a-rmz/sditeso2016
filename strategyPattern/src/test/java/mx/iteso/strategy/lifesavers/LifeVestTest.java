package mx.iteso.strategy.lifesavers;

import mx.iteso.strategy.behaviors.DeflateBehavior;
import mx.iteso.strategy.behaviors.FlotationBehavior;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by a-rmz on 9/15/16.
 */
public class LifeVestTest {

    @Test
    public void testLifeVest() {
        LifeVest lifeVest = new LifeVest();
        Assert.assertEquals(DeflateBehavior.CANT_DEFLATE, lifeVest.performDeflate());
        Assert.assertEquals(DeflateBehavior.CANT_INFLATE, lifeVest.performInflate());
        Assert.assertEquals(FlotationBehavior.FLOTATE, lifeVest.performFloat());
    }

}
