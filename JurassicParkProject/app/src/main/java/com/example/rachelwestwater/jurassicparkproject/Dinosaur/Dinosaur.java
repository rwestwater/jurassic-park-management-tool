package com.example.rachelwestwater.jurassicparkproject.Dinosaur;

import java.util.ArrayList;

public abstract class Dinosaur implements IEat, IFight {

    private String name;
    private DinosaurType dinosaurType;
    private ArrayList<IEat> stomachContents;
    private int health;
    protected AttackType attack;
    private Velociraptor velociraptor;
    private Brontosaurus brontosaurus;

    public Dinosaur(String name, DinosaurType dinosaurType, AttackType attack, int health, Velociraptor velociraptor, Brontosaurus brontosaurus) {
        this.name = name;
        this.dinosaurType = dinosaurType;
        this.stomachContents = new ArrayList<>();
        this.attack = attack;
        this.health = health;
        this.velociraptor = velociraptor;
        this.brontosaurus = brontosaurus;
    }

    public String getName() {
        return this.name;
    }

    public DinosaurType getDinosaurType() {
        return this.dinosaurType;
    }

    public int stomachContentsCount() {
        return this.stomachContents.size();
    }

    public void eat(IEat iEat) {stomachContents.add(iEat);}

    public int getHealth() {
        return this.health;
    }

    public void takeDamage(int amount) {
        this.health -= amount;
    }

    public AttackType getAttack() {
        return this.attack;
    }

    public void setAttack(AttackType attack) {
        this.attack = attack;
    }

    public void fight(IFight iFight) {
        iFight.takeDamage(this.attack.getValue());
        System.out.println(this.name + " has attacked " + iFight.getName() + " doing " + this.attack.getValue() + " Damage");
    }

    public String fightToTheDeath(Velociraptor velociraptor, Brontosaurus brontosaurus) {
            System.out.println("A fight has begun!");
                for(int i = 0; i < velociraptor.getHealth(); i++){
                    brontosaurus.fight(velociraptor);
                }
        System.out.println("The fight is over " + velociraptor.getName() + " died");
        return "Fight Over";
            }
}

