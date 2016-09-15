package mx.iteso.strategy;

import mx.iteso.strategy.behaviors.BounceBehavior;
import mx.iteso.strategy.behaviors.DeflateBehavior;
import mx.iteso.strategy.behaviors.DeformBehaviour;
import mx.iteso.strategy.behaviors.FlotationBehavior;

public abstract class Lifesaver {

    public DeflateBehavior deflateBehavior;
    public FlotationBehavior flotationBehavior;
    public String type;

    public Lifesaver() {

        public String performDeflate() {return deflateBehavior.deflate();}

        public String performInflate() { return deflateBehavior.inflate();}

        public String  performFloat() { return flotationBehavior.floatate();}

        public void setDeflateBehavior(DeflateBehavior deflateBehavior) {
        this.deflateBehavior = deflateBehavior;
    }

        public void setFloatingBehavior(FlotationBehavior flotationBehavior) {
        this.flotationBehavior = flotationBehavior;}

    }
}
