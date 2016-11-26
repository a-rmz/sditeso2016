/**
 * Created by a-rmz on 11/26/16.
 */

// Model
public class Player {

    private String name;
    private int coordX;
    private int coordY;

    public Player() {
        this.name = "Default";
        this.coordX = 0;
        this.coordY = 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCoordX() {
        return coordX;
    }

    public void setCoordX(int coordX) {
        this.coordX = coordX;
    }

    public int getCoordY() {
        return coordY;
    }

    public void setCoordY(int coordY) {
        this.coordY = coordY;
    }

}
