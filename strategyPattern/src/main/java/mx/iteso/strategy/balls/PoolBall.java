package mx.iteso.strategy.balls;

import mx.iteso.strategy.Ball;
import mx.iteso.strategy.behaviors.DeformBehaviour;
import mx.iteso.strategy.behaviors.impl.*;

/**
 * Created by fernando on 14/09/16.
 */
public class PoolBall extends Ball{
    public PoolBall() {
        bounceBehavior = new IrregularBounce();
        deflateBehavior = new NotDeflatable();
        deformBehaviour = new NotDeformable();
        type = "Pool Ball";
    }


}
