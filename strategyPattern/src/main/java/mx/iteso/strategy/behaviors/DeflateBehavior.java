package mx.iteso.strategy.behaviors;

public interface DeflateBehavior {

    public static String INFLATE = "I'm inflating!";
    public static String DEFLATE = "I'm deflating!";
    public static String CANT_INFLATE = "I can't inflate!";
    public static String CANT_DEFLATE = "I can't deflate!";


    public String deflate();

    public String inflate();
}
