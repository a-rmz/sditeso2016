package mx.iteso.observer.impl;

import mx.iteso.observer.Observer;
import mx.iteso.observer.Subject;

import java.util.ArrayList;

public class ScoresData implements Subject {
    private ArrayList<Observer> observers;
    private int homeGoals;
    private int awayGoals;
    private String homeTeam;
    private String awayTeam;

    // Scorer info
    private String scorerName;
    private int scorerNumber;
    private String scorerPosition;
    private String scorerTeam;

    public ScoresData(){
        observers = new ArrayList<Observer>();
    }

    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    public void removeObserver(Observer observer) {
        observers.remove(observers.indexOf(observer));
    }

    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(this.homeTeam, this.awayTeam, this.homeGoals, this.awayGoals,
                    this.scorerName, this.scorerNumber, this.scorerPosition, this.scorerTeam);
        }
    }

    public void newScore(){
        notifyObservers();
    }

    public void setScore( String homeTeam, String awayTeam, int homeGoals, int awayGoals){
        this.homeTeam = homeTeam;
        this.awayTeam =  awayTeam;
        this.homeGoals = homeGoals;
        this.awayGoals = awayGoals;
        newScore();
    }
}
