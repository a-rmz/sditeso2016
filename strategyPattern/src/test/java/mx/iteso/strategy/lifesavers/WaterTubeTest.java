package mx.iteso.strategy.lifesavers;

import mx.iteso.strategy.behaviors.DeflateBehavior;
import mx.iteso.strategy.behaviors.FlotationBehavior;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by fernando on 15/09/16.
 */
public class WaterTubeTest {

    @Test
    public void testWaterTube() {
        WaterTube waterTube = new WaterTube();
        Assert.assertEquals(DeflateBehavior.CANT_DEFLATE, waterTube.performDeflate());
        Assert.assertEquals(DeflateBehavior.CANT_INFLATE, waterTube.performInflate());
        Assert.assertEquals(FlotationBehavior.FLOTATE, waterTube.performFloat());
    }
}
