package com.example.rachelwestwater.jurassicparkproject.Dinosaur;

public class Velociraptor extends Dinosaur implements IFight {

    public Velociraptor(String name, DinosaurType dinosaurType, AttackType attack, int health){
        super(name, dinosaurType, attack, health);
    }

    @Override
    public void attack(IFight iFight) {

    }
}
