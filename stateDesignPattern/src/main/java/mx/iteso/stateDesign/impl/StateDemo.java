package mx.iteso.stateDesign.impl;

import mx.iteso.stateDesign.impl.States.AngryState;
import mx.iteso.stateDesign.impl.States.HappyState;
import mx.iteso.stateDesign.impl.States.SadState;

/**
 * Created by fernando on 17/11/16.
 */
public class StateDemo {
    public static void main(String[] args) {
        Context context = new Context();

        AngryState angry= new AngryState();
        angry.doAction(context);

        System.out.println(context.getState().toString());

        SadState sad = new SadState();
        sad.doAction(context);

        System.out.println(context.getState().toString());

        HappyState happy = new HappyState();
        happy.doAction(context);

        System.out.println(context.getState().toString());

    }
}

