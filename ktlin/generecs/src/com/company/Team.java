package com.company;

import java.util.ArrayList;

public class Team<T extends Player>{

    private int round= 0;
    private int wins= 0;
    private int drews= 0;
    private int loses= 0;
    private ArrayList<> league= new ArrayList<>();

    public int getRound() {
        return round;
    }

    public void setRound(int round) {
        this.round = round;
    }

    public int getLoses() {
        return loses;
    }

    public void setLoses(int loses) {
        this.loses = loses;
    }

    public int getWins() {
        return wins;
    }

    public void setWins(int wins) {
        this.wins = wins;
    }

    public int getDrews() {
        return drews;
    }

    public void setDrews(int drews) {
        this.drews = drews;
    }

    public void add(T player){
        league.add(player);
    }

    public void print(T team){
        System.out.println(team.getName());
        System.out.println(getWins());
        System.out.println(getLoses());
        System.out.println(getDrews());
    }

    public void scoring(T team1, T team2){
        setRound(team1.getScore()+1);
        setRound(team2.getScore()+1);

        String alert;
        if (team1.getScore() > team2.getScore()){
            setWins(getWins()+1);
            setLoses(getLoses()+1);
            alert= " beat to ";
            System.out.println(team1.getName() + alert + team2.getName());
        }
        else if (team1.getScore() < team2.getScore()){
            setWins(getWins()+1);
            setLoses(getLoses()+1);
            alert= " lose against ";
            System.out.println(team1.getName() + alert + team2.getName());
        }
        else if (team1.getScore() == team2.getScore()){
            setDrews(getDrews()+1);
            setLoses(getDrews()+1);
            alert= " drew with ";
            System.out.println(team1.getName() + alert + team2.getName());
        }
    }

}
