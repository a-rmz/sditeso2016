package mx.iteso.strategy.balls;

import mx.iteso.strategy.Ball;
import mx.iteso.strategy.behaviors.impl.Deflatable;
import mx.iteso.strategy.behaviors.impl.Deformable;
import mx.iteso.strategy.behaviors.impl.IrregularBounce;

public class AmericanFootballBall extends Ball {
    public AmericanFootballBall() {
        bounceBehavior = new IrregularBounce();
        deflateBehavior = new Deflatable();
        deformBehaviour = new Deformable();
        type = "American Football ball";
    }

}
