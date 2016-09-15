package mx.iteso.strategy.balls;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by a-rmz on 9/14/16.
 */
public class BaseballTest {
    @Test
    public void testBaseballBall() {
        BaseballBall baseballBall = new BaseballBall();
        assertEquals("I'm bouncing irregularly!", baseballBall.performBounce());
        assertEquals("I can't deflate!", baseballBall.performDeflate());
        assertEquals("I can't inflate!", baseballBall.performInflate());
        assertEquals("I'm rigid, you know?", baseballBall.performDeform());
        assertEquals("Baseball ball is rolling!", baseballBall.roll());
    }
}
