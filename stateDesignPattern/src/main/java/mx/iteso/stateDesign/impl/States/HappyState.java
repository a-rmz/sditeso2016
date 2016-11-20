package mx.iteso.stateDesign.impl.States;


import mx.iteso.stateDesign.impl.Tamagotchi;
import mx.iteso.stateDesign.impl.State;

/**
 * Created by fernando on 17/11/16.
 */
public class HappyState implements State {
    public String doAction() {
        return "I'm happy! (:";
    }

    public String toString(){
        return "Happy State";
    }

}
