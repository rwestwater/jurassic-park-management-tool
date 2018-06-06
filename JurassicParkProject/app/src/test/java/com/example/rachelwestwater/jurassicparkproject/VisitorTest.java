package com.example.rachelwestwater.jurassicparkproject;

import com.example.rachelwestwater.jurassicparkproject.Dinosaur.AttackType;
import com.example.rachelwestwater.jurassicparkproject.Dinosaur.Brontosaurus;
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
    Brontosaurus brontosaurus;


    @Before
    public void before(){
        rachel = new Rachel ("Rachel", 50);
        luis = new Luis ("Luis", 50);
        ruri = new Ruri ("Ruri", 50);
        velociraptor = new Velociraptor("Barney", DinosaurType.CARNIVORE, AttackType.BITE, 100, velociraptor, brontosaurus);

    }

    @Test
    public void canGetName(){
        assertEquals("Rachel", rachel.getName());
        assertEquals("Luis", luis.getName());
        assertEquals("Ruri", ruri.getName());
    }

    @Test
    public void canGetHealth(){
        assertEquals(50, rachel.getHealth());
        assertEquals(50, luis.getHealth());
        assertEquals(50, ruri.getHealth());
    }

    @Test
    public void canTakeDamage(){
        rachel.takeDamage(50);
        assertEquals(0, rachel.getHealth());
    }

    @Test
    public void canAttack(){
        velociraptor.fight(rachel);
        velociraptor.fight(luis);
        velociraptor.fight(ruri);
        assertEquals(0, rachel.getHealth());
    }

}
