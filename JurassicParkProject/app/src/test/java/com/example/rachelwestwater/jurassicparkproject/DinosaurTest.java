package com.example.rachelwestwater.jurassicparkproject;

import com.example.rachelwestwater.jurassicparkproject.Dinosaur.AttackType;
import com.example.rachelwestwater.jurassicparkproject.Dinosaur.Brontosaurus;
import com.example.rachelwestwater.jurassicparkproject.Dinosaur.DinosaurType;
import com.example.rachelwestwater.jurassicparkproject.Dinosaur.Velociraptor;
import com.example.rachelwestwater.jurassicparkproject.Food.Ferns;
import com.example.rachelwestwater.jurassicparkproject.Food.FoodType;
import com.example.rachelwestwater.jurassicparkproject.Food.Meats;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DinosaurTest {

    Velociraptor velociraptor;
    Velociraptor velociraptor2;
    Brontosaurus brontosaurus;
    Ferns ferns;
    Meats meats;

    @Before
    public void before(){
        velociraptor = new Velociraptor("Barney", DinosaurType.CARNIVORE, AttackType.SLASH, 100, velociraptor, brontosaurus);
        velociraptor2 = new Velociraptor("Harold", DinosaurType.CARNIVORE, AttackType.BITE, 100, velociraptor, brontosaurus);
        brontosaurus = new Brontosaurus("Little Foot", DinosaurType.HERBIVORE, AttackType.WHIP, 120, velociraptor, brontosaurus);
        ferns = new Ferns("Ferns", FoodType.VEGETARIAN);
        meats = new Meats("Lizard", FoodType.MEATS);
    }

    @Test
    public void canGetName(){
        assertEquals("Barney", velociraptor.getName());
        assertEquals("Little Foot", brontosaurus.getName());
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

    @Test
    public void canGetHealth(){
        assertEquals(100, velociraptor.getHealth());
        assertEquals(120, brontosaurus.getHealth());
    }

    @Test
    public void canTakeDamage(){
        velociraptor.takeDamage(5);
        brontosaurus.takeDamage(10);
        assertEquals(95, velociraptor.getHealth());
        assertEquals(110, brontosaurus.getHealth());
    }

    @Test
    public void canChangeAttack(){
        velociraptor.setAttack(AttackType.BITE);
        assertEquals(AttackType.BITE, velociraptor.getAttack());
    }

    @Test
    public void canFight(){
        velociraptor = new Velociraptor("Barney", DinosaurType.CARNIVORE, AttackType.BITE, 100, velociraptor, brontosaurus);
        velociraptor.fight(velociraptor2);
        assertEquals(50, velociraptor2.getHealth());
    }

    @Test
    public void canFightToDeath(){
        brontosaurus.fightToTheDeath(velociraptor, brontosaurus);
        assertEquals(0, velociraptor.getHealth());
    }


}
