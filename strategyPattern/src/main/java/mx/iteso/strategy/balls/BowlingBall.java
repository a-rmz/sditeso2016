package mx.iteso.strategy.balls;

import mx.iteso.strategy.Ball;
import mx.iteso.strategy.behaviors.impl.*;

/**
 * Created by fernando on 14/09/16.
 */
public class BowlingBall extends Ball {
    public BowlingBall() {
        bounceBehavior = new Crash();
        deflateBehavior = new NotDeflatable();
        deformBehaviour = new NotDeformable();
        type = "Bowling ball";
    }
}
