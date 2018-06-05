package com.example.rachelwestwater.jurassicparkproject;

import com.example.rachelwestwater.jurassicparkproject.Food.Ferns;
import com.example.rachelwestwater.jurassicparkproject.Food.FoodType;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FoodTest {

    Ferns ferns;

    @Before
    public void before(){
        ferns = new Ferns("Ferns", FoodType.VEGETARIAN);
    }

    @Test
    public void getName(){
        assertEquals("Ferns", ferns.getName());
    }
}
