package mx.iteso.strategy.behaviors;

/**
 * Created by a-rmz on 9/15/16.
 */
public interface FlotationBehavior {

    public static String FLOTATE = "I'm floating!";
    public static String SINK = "I can't float! I'm sinking!!";

    String flotate();
}
