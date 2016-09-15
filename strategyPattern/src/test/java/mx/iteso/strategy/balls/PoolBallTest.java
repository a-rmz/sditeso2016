package mx.iteso.strategy.balls;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by a-rmz on 9/14/16.
 */
public class PoolBallTest {
    @Test
    public void testPoolBall() {
        PoolBall poolBall = new PoolBall();
        assertEquals("I'm bouncing irregularly!", poolBall.performBounce());
        assertEquals("I can't deflate!", poolBall.performDeflate());
        assertEquals("I can't inflate!", poolBall.performInflate());
        assertEquals("I'm rigid, you know?", poolBall.performDeform());
        assertEquals("Pool ball is rolling!", poolBall.roll());
    }
}
