package com.example.rachelwestwater.jurassicparkproject.Dinosaur;

import com.example.rachelwestwater.jurassicparkproject.Food.Food;
import com.example.rachelwestwater.jurassicparkproject.Paddock.HerbivorePaddock;

import java.util.ArrayList;

public abstract class Dinosaur implements IEat {

    private String name;
    private DinosaurType dinosaurType;
    private ArrayList<IEat> stomachContents;


    public Dinosaur(String name, DinosaurType dinosaurType) {
        this.name = name;
        this.dinosaurType = dinosaurType;
        this.stomachContents = new ArrayList<>();
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

}