package com.example.rachelwestwater.jurassicparkproject.Dinosaur;

import java.util.ArrayList;

public abstract class Dinosaur {

    private String name;
    private DinosaurType dinosaurType;
    private ArrayList<> stomachContents;


    public Dinosaur(String name, DinosaurType dinosaurType, ){
        this.name = name;
        this.model = model;
        this.minAge = minAge;
        this.minHeight = minHeight;
    }

    public String getName() {
        return name;
    }

    public String getModel() {
        return model;
    }

    public int getMinAge(){
        return minAge;
    }

    public int getMinHeight() {
        return minHeight;
    }
}
