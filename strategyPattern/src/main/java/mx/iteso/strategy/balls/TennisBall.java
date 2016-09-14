package mx.iteso.strategy.balls;

import mx.iteso.strategy.Ball;
import mx.iteso.strategy.behaviors.impl.Deformable;
import mx.iteso.strategy.behaviors.impl.NormalBounce;
import mx.iteso.strategy.behaviors.impl.NotDeflatable;

/**
 * Created by a-rmz on 9/14/16.
 */
public class TennisBall extends Ball {
    public TennisBall() {
        bounceBehavior = new NormalBounce();
        deflateBehavior = new NotDeflatable();
        deformBehaviour = new Deformable();
        type = "Tennis ball";
    }
}
