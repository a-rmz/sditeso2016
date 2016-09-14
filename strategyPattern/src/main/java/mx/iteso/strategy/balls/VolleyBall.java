package mx.iteso.strategy.balls;

import mx.iteso.strategy.Ball;
import mx.iteso.strategy.behaviors.impl.Deflatable;
import mx.iteso.strategy.behaviors.impl.Deformable;
import mx.iteso.strategy.behaviors.impl.IrregularBounce;
import mx.iteso.strategy.behaviors.impl.NormalBounce;

/**
 * Created by a-rmz on 9/14/16.
 */
public class VolleyBall extends Ball {
    public VolleyBall() {
        bounceBehavior = new NormalBounce();
        deflateBehavior = new Deflatable();
        deformBehaviour = new Deformable();
        type = "American Football ball";
    }
}
