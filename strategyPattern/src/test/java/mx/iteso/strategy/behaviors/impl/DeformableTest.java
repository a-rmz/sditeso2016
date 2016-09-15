package mx.iteso.strategy.behaviors.impl;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by fernando on 14/09/16.
 */
public class DeformableTest {
    @Test
    public void testDeformable() {
        Deformable deformable = new Deformable();
        assertEquals("I'm deformiiiiiing!",deformable.deform());
    }
}
