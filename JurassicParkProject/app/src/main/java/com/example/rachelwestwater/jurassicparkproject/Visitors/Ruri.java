package com.example.rachelwestwater.jurassicparkproject.Visitors;

import com.example.rachelwestwater.jurassicparkproject.Dinosaur.IFight;

public class Ruri extends Visitor {

    public Ruri(String name, int health) {
        super(name, health);
    }

    @Override
    public void attack(IFight iFight) {

    }

    @Override
    public void takeDamage(int amount) {

    }
}
