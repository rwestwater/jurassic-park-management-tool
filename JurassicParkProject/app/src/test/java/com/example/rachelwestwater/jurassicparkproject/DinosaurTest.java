package com.example.rachelwestwater.jurassicparkproject;

import com.example.rachelwestwater.jurassicparkproject.Dinosaur.Dinosaur;
import com.example.rachelwestwater.jurassicparkproject.Dinosaur.DinosaurType;
import com.example.rachelwestwater.jurassicparkproject.Dinosaur.Velociraptor;

import org.junit.Before;

public class DinosaurTest {

    Velociraptor Velociraptor;

    @Before
    public void before(){
        Velociraptor = new Velociraptor("Velociraptor", DinosaurType.HERBIVORE);
    }
}
