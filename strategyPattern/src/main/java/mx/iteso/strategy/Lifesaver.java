package mx.iteso.strategy;

import mx.iteso.strategy.behaviors.BounceBehavior;
import mx.iteso.strategy.behaviors.DeflateBehavior;
import mx.iteso.strategy.behaviors.DeformBehaviour;
import mx.iteso.strategy.behaviors.FlotationBehavior;

public abstract class Lifesaver {

    public DeflateBehavior deflateBehavior;
    public FlotationBehavior floatationBehavior;
    public String type;

    public Lifesaver() {


    }
}
