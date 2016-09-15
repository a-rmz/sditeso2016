package mx.iteso.strategy.balls;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by a-rmz on 9/14/16.
 */
public class BowlingBallTest {
    @Test
    public void testBowlingBall() {
        BowlingBall bowlingBall = new BowlingBall();
        assertEquals("I crashed!! I can't bounce", bowlingBall.performBounce());
        assertEquals("I can't deflate!", bowlingBall.performDeflate());
        assertEquals("I can't inflate!", bowlingBall.performInflate());
        assertEquals("I'm rigid, you know?", bowlingBall.performDeform());
        assertEquals("Bowling ball is rolling!", bowlingBall.roll());
    }
}
