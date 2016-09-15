package mx.iteso.strategy.behaviors.impl;

import mx.iteso.strategy.behaviors.BounceBehavior;

public class IrregularBounce implements BounceBehavior {
    public String bounce() {
        return IRREGULAR_BOUNCE;
    }
}
