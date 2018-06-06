package com.example.rachelwestwater.jurassicparkproject;

import com.example.rachelwestwater.jurassicparkproject.Dinosaur.AttackType;
import com.example.rachelwestwater.jurassicparkproject.Dinosaur.DinosaurType;
import com.example.rachelwestwater.jurassicparkproject.Dinosaur.Velociraptor;
import com.example.rachelwestwater.jurassicparkproject.Visitors.Luis;
import com.example.rachelwestwater.jurassicparkproject.Visitors.Rachel;
import com.example.rachelwestwater.jurassicparkproject.Visitors.Ruri;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class VisitorTest {

    Rachel rachel;
    Luis luis;
    Ruri ruri;
    Velociraptor velociraptor;


    @Before
    public void before(){
        rachel = new Rachel ("Rachel", 20);
        luis = new Luis ("Luis", 20);
        ruri = new Ruri ("Ruri", 20);
        velociraptor = new Velociraptor("Velociraptor", DinosaurType.CARNIVORE, AttackType.BITE, 100);

    }

    @Test
    public void canGetName(){
        assertEquals("Rachel", rachel.getName());
        assertEquals("Luis", luis.getName());
        assertEquals("Ruri", ruri.getName());
    }

    @Test
    public void canGetHealth(){
        assertEquals(20, rachel.getHealth());
        assertEquals(20, luis.getHealth());
        assertEquals(20, ruri.getHealth());
    }

    @Test
    public void canTakeDamage(){
        rachel.takeDamage(10);
        assertEquals(10, rachel.getHealth());
    }

    @Test
    public void canAttack(){
        velociraptor.fight(rachel);
        velociraptor.fight(luis);
        velociraptor.fight(ruri);
        assertEquals(10, rachel.getHealth());
    }

}
