package com.example.rachelwestwater.jurassicparkproject.Visitors;
import com.example.rachelwestwater.jurassicparkproject.Dinosaur.IFight;

public class Rachel extends Visitor {

    public Rachel(String name, int health) {
        super(name, health);
    }

    @Override
    public void attack(IFight iFight) {
    }

    @Override
    public void takeDamage(int amount) {
    }
}
