package com.example.rachelwestwater.jurassicparkproject.Dinosaur;

import com.example.rachelwestwater.jurassicparkproject.Food.Food;

import java.util.ArrayList;

public abstract class Dinosaur {

    private String name;
    private DinosaurType dinosaurType;
    private ArrayList<Food> stomachContents;


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

    public void eat(Food food) {
        stomachContents.add(food);

    }

    public ArrayList<Food> getStomachContents() {
        return stomachContents;
    }
}