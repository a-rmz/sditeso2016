package mx.iteso.strategy.lifesavers;

import mx.iteso.strategy.Lifesaver;
import mx.iteso.strategy.behaviors.impl.Deflatable;
import mx.iteso.strategy.behaviors.impl.Flotate;

public class SwimRing extends Lifesaver{
    public SwimRing() {
        deflateBehavior = new Deflatable();
        floatationBehavior = new Flotate();
        type = "Swim ring";
    }
}
