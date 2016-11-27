package mx.iteso.stateDesign.impl.States;

import mx.iteso.stateDesign.impl.State;

/**
 * Created by a-rmz on 11/19/16.
 */
public class DeadState implements State {
    public String doAction() {
        return "I'm dead x_x";
    }

    public String toString(){
        return "Dead State";
    }
}
