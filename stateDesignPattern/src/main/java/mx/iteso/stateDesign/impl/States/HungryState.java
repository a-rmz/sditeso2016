package mx.iteso.stateDesign.impl.States;

import mx.iteso.stateDesign.impl.Tamagotchi;
import mx.iteso.stateDesign.impl.State;

/**
 * Created by fernando on 17/11/16.
 */
public class HungryState implements State {
    public String doAction() {
        return  "I'm hungry ):";
    }

    public String toString(){
        return "Hungry State";
    }
}
