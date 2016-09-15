package mx.iteso.strategy;

public class Lifesaver {
    public String type;
    public String inflating() {
        return "I'm inflating";
    }
    public String deflating() {
        return "I'm deflating";
    }
    public String floating() {
        return "I'm floating";
    }
    public String display() {
        return "I'm a " + type;
    }
}
