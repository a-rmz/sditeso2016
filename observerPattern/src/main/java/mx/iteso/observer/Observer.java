package mx.iteso.observer;

public interface Observer {
    public void update(String home, String away, int homeGoals, int awayGoals,
                       String scorerName, int scorerNumber, String scorerPosition, String scorerTeam);
}
