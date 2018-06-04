package com.example.rachelwestwater.jurassicparkproject;

import com.example.rachelwestwater.jurassicparkproject.Dinosaur.DinosaurType;
import com.example.rachelwestwater.jurassicparkproject.Dinosaur.Velociraptor;

import org.junit.Before;

import static org.junit.Assert.assertEquals;

public class DinosaurTest {

    Velociraptor velociraptor;

    @Before
    public void before(){
        velociraptor = new Velociraptor("Velociraptor", DinosaurType.CARNIVORE);
    }

    public void canGetName(){
        assertEquals("Velociraptor", velociraptor.getName());
    }
}
