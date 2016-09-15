package mx.iteso.strategy.lifesavers;

import mx.iteso.strategy.behaviors.DeflateBehavior;
import mx.iteso.strategy.behaviors.FlotationBehavior;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by fernando on 15/09/16.
 */
public class SwimSeatTest {

    @Test
    public void testSwimSeat() {
        SwimSeat swimSeat = new SwimSeat();
        Assert.assertEquals(DeflateBehavior.DEFLATE, swimSeat.performDeflate());
        Assert.assertEquals(DeflateBehavior.INFLATE, swimSeat.performInflate());
        Assert.assertEquals(FlotationBehavior.FLOTATE, swimSeat.performFloat());
    }
}
