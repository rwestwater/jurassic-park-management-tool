package com.example.rachelwestwater.jurassicparkproject;

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


    @Before
    public void before(){
        rachel = new Rachel ("Rachel", 100);
        luis = new Luis ("Luis", 100);
        ruri = new Ruri ("Ruri", 100);

    }

    @Test
    public void canGetName(){
        assertEquals("Rachel", rachel.getName());
        assertEquals("Luis", luis.getName());
        assertEquals("Ruri", ruri.getName());
    }

    @Test
    public void canGetHealth(){
        assertEquals(100, rachel.getHealth());
        assertEquals(100, luis.getHealth());
        assertEquals(100, ruri.getHealth());
    }

    @Test
    public void canTakeDamage(){
        rachel.takeDamage(50);
        assertEquals(50, rachel.getHealth());
    }

}
