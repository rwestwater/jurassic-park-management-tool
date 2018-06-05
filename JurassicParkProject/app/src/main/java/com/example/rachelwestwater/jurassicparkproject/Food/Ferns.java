package com.example.rachelwestwater.jurassicparkproject.Food;

import com.example.rachelwestwater.jurassicparkproject.Dinosaur.IEat;

public class Ferns extends Food implements IEat{

    public Ferns(String name, FoodType foodType) {
        super(name, foodType);
    }

    @Override
    public void eat(IEat iEat) {
    }
}
