package mx.iteso.strategy.balls;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by a-rmz on 9/14/16.
 */
public class VolleyballBallTest {
    @Test
    public void testVolleyballBall() {
        VolleyballBall volleyballBall = new VolleyballBall();
        assertEquals("I'm bouncing normally!", volleyballBall.performBounce());
        assertEquals("I'm deflating!", volleyballBall.performDeflate());
        assertEquals("I'm inflating!", volleyballBall.performInflate());
        assertEquals("I'm deformiiiiiing!", volleyballBall.performDeform());
        assertEquals("Volleyball ball is rolling!", volleyballBall.roll());
    }
}
