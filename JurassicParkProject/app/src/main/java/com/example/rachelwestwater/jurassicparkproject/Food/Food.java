package com.example.rachelwestwater.jurassicparkproject.Food;

import com.example.rachelwestwater.jurassicparkproject.Dinosaur.IEat;

public abstract class Food implements IEat {

    private String name;
    private FoodType foodType;

    public Food(String name, FoodType foodType) {
        this.name = name;
        this.foodType = foodType;
    }

    public String getName() {
        return name;
    }

    public FoodType getFoodType() {
        return this.foodType;
    }

}
