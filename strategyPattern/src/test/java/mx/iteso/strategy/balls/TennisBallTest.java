package mx.iteso.strategy.balls;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by a-rmz on 9/14/16.
 */
public class TennisBallTest {
    @Test
    public void testPoolBall() {
        TennisBall tennisBall = new TennisBall();
        assertEquals("I'm bouncing normally!", tennisBall.performBounce());
        assertEquals("I can't deflate!", tennisBall.performDeflate());
        assertEquals("I can't inflate!", tennisBall.performInflate());
        assertEquals("I'm deformiiiiiing!", tennisBall.performDeform());
        assertEquals("Tennis ball is rolling!", tennisBall.roll());
    }
}
