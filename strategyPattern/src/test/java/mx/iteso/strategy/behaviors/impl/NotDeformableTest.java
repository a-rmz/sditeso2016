package mx.iteso.strategy.behaviors.impl;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by fernando on 14/09/16.
 */
public class NotDeformableTest {
    @Test
    public void testNotDeformable() {
        NotDeformable notdeformable = new NotDeformable();
        assertEquals("I'm rigid, you know?",notdeformable.deform());
    }
}
