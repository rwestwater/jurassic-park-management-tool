package com.example.rachelwestwater.jurassicparkproject.Dinosaur;

public class Brontosaurus extends Dinosaur implements IFight {
    public Brontosaurus(String name, DinosaurType dinosaurType, AttackType attack, int health) {
        super(name, dinosaurType, attack, health);
    }

    @Override
    public void attack(IFight iFight) {
    }
}
