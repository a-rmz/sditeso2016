package mx.iteso.stateDesign.impl;

/**
 * Created by fernando on 17/11/16.
 */
public class Context {
    private State state;

    public Context () {
        state = null;
    }

    public void setState (State state) {
        this.state = state;
    }

    public State getState() {
        return state;
    }
}
