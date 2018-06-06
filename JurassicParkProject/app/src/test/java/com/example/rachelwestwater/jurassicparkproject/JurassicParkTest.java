package com.example.rachelwestwater.jurassicparkproject;

import com.example.rachelwestwater.jurassicparkproject.Dinosaur.AttackType;
import com.example.rachelwestwater.jurassicparkproject.Dinosaur.Brontosaurus;
import com.example.rachelwestwater.jurassicparkproject.Dinosaur.DinosaurType;
import com.example.rachelwestwater.jurassicparkproject.Dinosaur.Velociraptor;
import com.example.rachelwestwater.jurassicparkproject.Food.Ferns;
import com.example.rachelwestwater.jurassicparkproject.Food.FoodType;
import com.example.rachelwestwater.jurassicparkproject.Food.Meats;
import com.example.rachelwestwater.jurassicparkproject.Visitors.Luis;
import com.example.rachelwestwater.jurassicparkproject.Visitors.Rachel;
import com.example.rachelwestwater.jurassicparkproject.Visitors.Ruri;
import com.example.rachelwestwater.jurassicparkproject.Visitors.Visitor;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class JurassicParkTest {

    JurassicPark jurassicPark;
    Velociraptor velociraptor;
    Brontosaurus brontosaurus;
    Rachel rachel;
    Luis luis;
    Ruri ruri;

    @Before
    public void before(){
        jurassicPark = new JurassicPark(velociraptor, brontosaurus);
        velociraptor = new Velociraptor("Velociraptor", DinosaurType.CARNIVORE, AttackType.SLASH, 100);
        brontosaurus = new Brontosaurus("Brontosaurus", DinosaurType.HERBIVORE, AttackType.WHIP, 120);
        rachel = new Rachel("Rachel", 20);
        luis = new Luis("Luis", 20);
        ruri = new Ruri("Ruri", 20);
    }

    @Test
    public void parkIsEmpty(){
        assertEquals(0, jurassicPark.visitorListCount());
    }

    @Test
    public void evacuatePark() {
        jurassicPark.addVisitor(rachel);
        jurassicPark.addVisitor(luis);
        jurassicPark.evacuatePark();
        assertEquals(0, jurassicPark.visitorListCount());
    }










}
