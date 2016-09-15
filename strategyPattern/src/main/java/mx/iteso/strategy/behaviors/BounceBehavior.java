package mx.iteso.strategy.behaviors;

public interface BounceBehavior {

    public static String NORMAL_BOUNCE = "I'm bouncing normally!";
    public static String IRREGULAR_BOUNCE = "I'm bouncing irregularly!";

    public String bounce();
}
