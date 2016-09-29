package mx.iteso.decorator;

public abstract class Taco {

    public enum Size {
        MINI, NORMAL, MEGA
    }

    public Size size;

    public String description = "Any Taco";
    public String getDescription(){
        return description;
    }
    public abstract double cost();
    public abstract Taco.Size getSize();

    public static class WrongSizeException extends RuntimeException {
        public WrongSizeException() {
            super("Wrong size for this type of taco");
        }
    }

}
