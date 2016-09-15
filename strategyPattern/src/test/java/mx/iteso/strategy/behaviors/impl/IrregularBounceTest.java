package mx.iteso.strategy.behaviors.impl;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by fernando on 14/09/16.
 */
public class IrregularBounceTest {
    @Test
    public void testIrregularBounce() {
        IrregularBounce irregularBounce = new IrregularBounce();
        assertEquals("I'm bouncing irregularly!",irregularBounce.bounce());
    }
}
