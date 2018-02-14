package com.prykhodko;

import java.util.ArrayList;
import java.util.List;

public class Monsters implements ISaveable{

    private String monsterName;
    private int life;
    private int points;

    public Monsters(String monsterName, int life, int points) {
        this.monsterName = monsterName;
        this.life = life;
        this.points = points;
    }

    //Getters and setters////

    public String getMonsterName() {
        return monsterName;
    }

    public Monsters setMonsterName(String monsterName) {
        this.monsterName = monsterName;
        return this;
    }

    public int getLife() {
        return life;
    }

    public Monsters setLife(int life) {
        this.life = life;
        return this;
    }

    public int getPoints() {
        return points;
    }

    public Monsters setPoints(int points) {
        this.points = points;
        return this;
    }

    @Override
    public List<String> write() {
        List<String> monsters = new ArrayList<String>();

        monsters.add(0, this.monsterName);
        monsters.add(1, "" + this.life);
        monsters.add(2, "" + this.points);

        return monsters;
    }

    @Override
    public void read(List<String> savedValues) {
        if(!savedValues.isEmpty() && savedValues.size() > 0){
            this.monsterName = savedValues.get(0);
            this.life = Integer.parseInt(savedValues.get(1));
            this.points = Integer.parseInt(savedValues.get(2));
        }

    }

    @Override
    public String toString() {
        return "The monster's name is: " + monsterName +
                " Lives: " + life +
                " Points: " + points;
    }
}
