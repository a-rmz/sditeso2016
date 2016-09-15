package mx.iteso.strategy.behaviors.impl;

import mx.iteso.strategy.behaviors.DeflateBehavior;

public class NotDeflatable  implements DeflateBehavior{
    public String deflate() {
        return CANT_DEFLATE;
    }

    public String inflate() {
        return CANT_INFLATE;
    }
}
