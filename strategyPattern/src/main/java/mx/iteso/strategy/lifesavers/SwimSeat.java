package mx.iteso.strategy.lifesavers;

import mx.iteso.strategy.Lifesaver;
import mx.iteso.strategy.behaviors.impl.Flotate;
import mx.iteso.strategy.behaviors.impl.NotDeflatable;

public class SwimSeat extends Lifesaver {
    public SwimSeat() {
        deflateBehavior = new NotDeflatable();
        flotationBehavior = new Flotate();
        type = "Swim seat";
    }
}
