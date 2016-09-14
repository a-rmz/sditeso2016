package mx.iteso.strategy.behaviors.impl;

import mx.iteso.strategy.behaviors.DeformBehaviour;

/**
 * Created by a-rmz on 9/14/16.
 */
public class NotDeformable implements DeformBehaviour {
    public String deform() { return "I'm rigid, you know?"; }
}
