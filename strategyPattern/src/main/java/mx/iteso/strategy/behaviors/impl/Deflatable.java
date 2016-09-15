package mx.iteso.strategy.behaviors.impl;

import mx.iteso.strategy.behaviors.DeflateBehavior;

public class Deflatable implements DeflateBehavior {
    public String deflate() {
        return DEFLATE;
    }

    public String inflate() {
        return INFLATE;
    }
}
