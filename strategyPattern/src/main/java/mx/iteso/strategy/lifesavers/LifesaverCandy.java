package mx.iteso.strategy.lifesavers;

import mx.iteso.strategy.Lifesaver;
import mx.iteso.strategy.behaviors.impl.NotDeflatable;
import mx.iteso.strategy.behaviors.impl.Sink;

/**
 * Created by a-rmz on 9/15/16.
 */
public class LifesaverCandy extends Lifesaver {
    public LifesaverCandy() {
        deflateBehavior = new NotDeflatable();
        flotationBehavior = new Sink();
        type = "Swim ring";
    }
}
