package com.example.rachelwestwater.jurassicparkproject.Food;

public abstract class Food {

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
