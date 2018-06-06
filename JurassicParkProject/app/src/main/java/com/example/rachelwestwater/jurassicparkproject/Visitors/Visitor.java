package com.example.rachelwestwater.jurassicparkproject.Visitors;

import com.example.rachelwestwater.jurassicparkproject.Dinosaur.IFight;

public abstract class Visitor implements IFight {

    private String name;
    protected int health;

    public Visitor(String name, int health) {
        this.name = name;
        this.health = health;
    }

    public String getName() {
        return this.name;
    }

    public int getHealth() {
        return this.health;
    }

}