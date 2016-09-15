package mx.iteso.strategy.lifesavers;

import mx.iteso.strategy.Lifesaver;
import mx.iteso.strategy.behaviors.impl.Deflatable;
import mx.iteso.strategy.behaviors.impl.Flotate;

public class ArmBands extends Lifesaver{

    public ArmBands() {
        deflateBehavior = new Deflatable();
        flotationBehavior = new Flotate();
        type = "Arm bands";
    }
}
