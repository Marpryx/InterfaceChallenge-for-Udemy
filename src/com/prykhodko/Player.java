package com.prykhodko;

import java.util.ArrayList;
import java.util.List;

public class Player implements ISaveable{

    private String playerName;
    private String car;
    private int life;
    private int points;

    public Player(String playerName, int life, int points, String car) {
        this.playerName = playerName;
        this.car = car;
        this.life = life;
        this.points = points;
    }

    //Getters and Setters//

    public String getPlayerName() {
        return playerName;
    }

    public Player setPlayerName(String playerName) {
        this.playerName = playerName;
        return this;
    }

    public String getCar() {
        return car;
    }

    public Player setCar(String car) {
        this.car = car;
        return this;
    }

    public int getLife() {
        return life;
    }

    public Player setLife(int life) {
        this.life = life;
        return this;
    }

    public int getPoints() {
        return points;
    }

    public Player setPoints(int points) {
        this.points = points;
        return this;
    }


    @Override
    public List<String> write() {
        List<String> players = new ArrayList<String>();

        players.add(0, this.playerName);
        players.add(1, this.car);
        players.add(2, "" + this.life);
        players.add(3, "" + this.points);

        return players;
    }

    @Override
    public void read(List<String> savedValues) {

        if(!savedValues.isEmpty() && savedValues.size() > 0){
            this.playerName = savedValues.get(0);
            this.car = savedValues.get(1);
            this.life = Integer.parseInt(savedValues.get(2));
            this.points = Integer.parseInt(savedValues.get(3));
        }

    }

    @Override
    public String toString() {
        return "Player name is " + playerName +
                " car: " + car +
                " life " + life +
                " points " + points;
    }
}
