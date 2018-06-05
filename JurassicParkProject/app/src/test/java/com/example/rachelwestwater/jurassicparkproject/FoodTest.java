package com.example.rachelwestwater.jurassicparkproject;

import com.example.rachelwestwater.jurassicparkproject.Food.Ferns;
import com.example.rachelwestwater.jurassicparkproject.Food.FoodType;
import com.example.rachelwestwater.jurassicparkproject.Food.Meats;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FoodTest {

    Ferns ferns;
    Meats meats;


    @Before
    public void before(){
        ferns = new Ferns("Ferns", FoodType.VEGETARIAN);
        meats = new Meats("Lizard", FoodType.MEATS);
    }

    @Test
    public void getName(){
        assertEquals("Ferns", ferns.getName());
    }

    @Test
    public void getFoodType(){
        assertEquals(FoodType.VEGETARIAN, ferns.getFoodType());
        assertEquals(FoodType.MEATS, meats.getFoodType());
    }
}
