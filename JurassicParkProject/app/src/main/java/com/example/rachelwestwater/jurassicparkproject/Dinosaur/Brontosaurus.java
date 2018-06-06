package com.example.rachelwestwater.jurassicparkproject.Dinosaur;

public class Brontosaurus extends Dinosaur implements IFight {
    public Brontosaurus(String name, DinosaurType dinosaurType, AttackType attack, int health, Velociraptor velociraptor, Brontosaurus brontosaurus) {
        super(name, dinosaurType, attack, health, velociraptor, brontosaurus);
    }

    @Override
    public void attack(IFight iFight) {
    }
}
