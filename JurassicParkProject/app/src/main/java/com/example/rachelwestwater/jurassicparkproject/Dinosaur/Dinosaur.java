package com.example.rachelwestwater.jurassicparkproject.Dinosaur;

import java.util.ArrayList;

public abstract class Dinosaur implements IEat {

    private String name;
    private DinosaurType dinosaurType;
    private ArrayList<IEat> stomachContents;
    private int health;
    private AttackType attack;

    public Dinosaur(String name, DinosaurType dinosaurType, AttackType attack, int health) {
        this.name = name;
        this.dinosaurType = dinosaurType;
        this.stomachContents = new ArrayList<>();
        this.attack = attack;
        this.health = health;
    }

    public String getName() {
        return name;
    }

    public DinosaurType getDinosaurType() {
        return dinosaurType;
    }

    public int stomachContentsCount() {
        return this.stomachContents.size();
    }

    public void eat(IEat iEat) {
        stomachContents.add(iEat);
    }

    public ArrayList<IEat> getStomachContents() {
        return stomachContents;
    }

    public int getHealth() {
        return this.health;
    }

    public void takeDamage(int amount) {
        this.health -= amount;
    }

    public void fight(IFight iFight) {
        iFight.takeDamage(this.attack.getValue());
    }




}