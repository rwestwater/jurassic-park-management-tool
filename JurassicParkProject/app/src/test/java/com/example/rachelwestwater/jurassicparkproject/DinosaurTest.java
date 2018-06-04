package com.example.rachelwestwater.jurassicparkproject;

import com.example.rachelwestwater.jurassicparkproject.Dinosaur.Brontosaurus;
import com.example.rachelwestwater.jurassicparkproject.Dinosaur.DinosaurType;
import com.example.rachelwestwater.jurassicparkproject.Dinosaur.Velociraptor;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DinosaurTest {

    Velociraptor velociraptor;
    Brontosaurus brontosaurus;

    @Before
    public void before(){
        velociraptor = new Velociraptor("Velociraptor", DinosaurType.CARNIVORE);
        brontosaurus = new Brontosaurus("Brontosaurus", DinosaurType.HERBIVORE);
    }

    @Test
    public void canGetName(){
        assertEquals("Velociraptor", velociraptor.getName());
        assertEquals("Brontosaurus", brontosaurus.getName());
    }

    @Test
    public void hasDinosaurType(){
        assertEquals(DinosaurType.CARNIVORE, velociraptor.getDinosaurType());
        assertEquals(DinosaurType.HERBIVORE, brontosaurus.getDinosaurType());
    }

    @Test
    public void hasEmptyStomach(){
        assertEquals(0, velociraptor.stomachContentsCount());
        assertEquals(0, brontosaurus.stomachContentsCount());
    }
}
