package mx.iteso.stateDesign.impl;

import mx.iteso.stateDesign.impl.States.HappyState;

/**
 * Created by fernando on 17/11/16.
 */
public class StateDemo {
<<<<<<< HEAD
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
=======
    public static void main(String args[]) {
        Tamagotchi tamagotchi = new Tamagotchi();

//        tamagotchi.setState(new HappyState());
//
//        System.out.println(tamagotchi.leave());
//        System.out.println(tamagotchi.pet());
//        System.out.println(tamagotchi.feed(false));
//        System.out.println(tamagotchi.leave());
>>>>>>> 0216df4e8f175680bc96ad1d252b0401fa788b47

    }
}

