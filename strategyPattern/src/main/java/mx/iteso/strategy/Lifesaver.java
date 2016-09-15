package mx.iteso.strategy;

import mx.iteso.strategy.behaviors.BounceBehavior;
import mx.iteso.strategy.behaviors.DeflateBehavior;
import mx.iteso.strategy.behaviors.DeformBehaviour;

public abstract class Lifesaver {

    public DeflateBehavior deflateBehavior;
    public FloatationBehavior floatationBehavior;
    public String type;

    public Lifesaver() {


    }
}
