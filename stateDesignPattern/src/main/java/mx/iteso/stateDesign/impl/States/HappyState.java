package mx.iteso.stateDesign.impl.States;


import mx.iteso.stateDesign.impl.Context;
import mx.iteso.stateDesign.impl.State;

/**
 * Created by fernando on 17/11/16.
 */
public class HappyState implements State {
    public void doAction(Context context) {
        System.out.println("I'm Happy! (:");
        context.setState(this);
    }

    public String toString(){
        return "Happy State";
    }

}
