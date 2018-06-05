package com.example.rachelwestwater.jurassicparkproject;

import com.example.rachelwestwater.jurassicparkproject.Dinosaur.Brontosaurus;
import com.example.rachelwestwater.jurassicparkproject.Dinosaur.DinosaurType;
import com.example.rachelwestwater.jurassicparkproject.Dinosaur.Velociraptor;
import com.example.rachelwestwater.jurassicparkproject.Food.Ferns;
import com.example.rachelwestwater.jurassicparkproject.Food.Food;
import com.example.rachelwestwater.jurassicparkproject.Food.FoodType;
import com.example.rachelwestwater.jurassicparkproject.Food.Meats;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DinosaurTest {

    Velociraptor velociraptor;
    Brontosaurus brontosaurus;
    Ferns ferns;
    Meats meats;

    @Before
    public void before(){
        velociraptor = new Velociraptor("Velociraptor", DinosaurType.CARNIVORE);
        brontosaurus = new Brontosaurus("Brontosaurus", DinosaurType.HERBIVORE);
        ferns = new Ferns("Ferns", FoodType.VEGETARIAN);
        meats = new Meats("Lizard", FoodType.MEATS);
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

    @Test
    public void canCountStomachContents(){
        velociraptor.eat(meats);
        brontosaurus.eat(ferns);
        assertEquals(1, velociraptor.stomachContentsCount());
        assertEquals(1, brontosaurus.stomachContentsCount());
    }

//    @Test
////    public void canGetStomachContentsByItem(){
////        velociraptor.eat(meats);
////        assertEquals("Lizard", velociraptor.getStomachContents());
////    }
}
