package mx.iteso.stateDesign.impl;

import mx.iteso.stateDesign.impl.States.AngryState;
import mx.iteso.stateDesign.impl.States.DeadState;
import mx.iteso.stateDesign.impl.States.HappyState;
import mx.iteso.stateDesign.impl.States.HungryState;

/**
 * Created by a-rmz on 17/11/16.
 */

// "Context" class
public class Tamagotchi {
    private State state;

    public Tamagotchi() {
        state = null;
    }

    public void setState (State state) {
        this.state = state;
    }


    public String feed(boolean doOrDont) {
        if (doOrDont) {
            if(state.toString().equals("Hungry State")) {
                state = new HappyState();
            }
        } else {
            if(state.toString().equals("Happy State") || state.toString().equals("Angry State")) {
                state = new HungryState();
            } else if(state.toString().equals("Hungry State")) {
                state = new DeadState();
            }
        }
        return state.doAction();
    }

    public String pet() {
        if(state.toString().equals("Angry State")) {
            state = new HappyState();
        }
        return state.doAction();
    }

    public String leave() {
        if(state.toString().equals("Happy State")) {
            state = new AngryState();
        } else if(state.toString().equals("Hungry State")) {
            state = new DeadState();
        } else {
            state = new HungryState();
        }
        return state.doAction();
    }
}
