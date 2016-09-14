package mx.iteso.strategy.balls;

import mx.iteso.strategy.Ball;
import mx.iteso.strategy.behaviors.impl.IrregularBounce;
import mx.iteso.strategy.behaviors.impl.NotDeflatable;
import mx.iteso.strategy.behaviors.impl.NotDeformable;

/**
 * Created by a-rmz on 9/14/16.
 */
public class GolfBall extends Ball {
    public GolfBall() {
        bounceBehavior = new IrregularBounce();
        deflateBehavior = new NotDeflatable();
        deformBehaviour = new NotDeformable();
        type = "Golf ball";
    }
}
