package mx.iteso.strategy.lifesavers;

import mx.iteso.strategy.Lifesaver;
import mx.iteso.strategy.behaviors.impl.Flotate;
import mx.iteso.strategy.behaviors.impl.NotDeflatable;

/**
 * Created by a-rmz on 9/15/16.
 */
public class LifeVest extends Lifesaver {
    public LifeVest() {
        deflateBehavior = new NotDeflatable();
        flotationBehavior = new Flotate();
        type = "Life vest";
    }
}
