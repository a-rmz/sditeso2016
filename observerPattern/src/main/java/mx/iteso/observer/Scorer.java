package mx.iteso.observer;

/**
 * Created by a-rmz on 9/22/16.
 */
public class Scorer {

    private String name;
    private int number;
    private String position;
    private String team;

    public Scorer(String name, int number, String position, String team) {
        this.name = name;
        this.number = number;
        this.position = position;
        this.team = team;
    }

    public String getName() {
        return name;
    }

    public int getNumber() {
        return number;
    }

    public String getPosition() {
        return position;
    }

    public String getTeam() {
        return team;
    }

}
