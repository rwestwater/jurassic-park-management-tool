package com.example.rachelwestwater.jurassicparkproject.Visitors;

import com.example.rachelwestwater.jurassicparkproject.Dinosaur.IFight;

public class Luis extends Visitor implements IFight{

    public Luis(String name, int health) {
        super(name, health);
    }

    @Override
    public void attack(IFight iFight) {
    }

    @Override
    public void takeDamage(int amount) { this.health -= amount;
    }
}