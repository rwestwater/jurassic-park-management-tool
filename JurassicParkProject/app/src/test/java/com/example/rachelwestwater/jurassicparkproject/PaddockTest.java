package com.example.rachelwestwater.jurassicparkproject;

import com.example.rachelwestwater.jurassicparkproject.Dinosaur.Brontosaurus;
import com.example.rachelwestwater.jurassicparkproject.Dinosaur.Dinosaur;
import com.example.rachelwestwater.jurassicparkproject.Dinosaur.DinosaurType;
import com.example.rachelwestwater.jurassicparkproject.Dinosaur.Velociraptor;
import com.example.rachelwestwater.jurassicparkproject.Paddock.CarnivorePaddock;
import com.example.rachelwestwater.jurassicparkproject.Paddock.HerbivorePaddock;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PaddockTest {

    HerbivorePaddock herbivorePaddock1;
    HerbivorePaddock herbivorePaddock2;
    CarnivorePaddock carnivorePaddock1;
    CarnivorePaddock carnivorePaddock2;
    Brontosaurus brontosaurus;
    Velociraptor velociraptor;

        @Before
        public void before() {
            herbivorePaddock1 = new HerbivorePaddock("Forest");
            herbivorePaddock2 = new HerbivorePaddock("Plain Terrain");
            carnivorePaddock1 = new CarnivorePaddock("Jungle");
            carnivorePaddock2 = new CarnivorePaddock("Riverland");
            velociraptor = new Velociraptor("Velociraptor", DinosaurType.CARNIVORE);
            brontosaurus = new Brontosaurus("Brontosaurus", DinosaurType.HERBIVORE);
        }

        @Test
        public void getName(){
            assertEquals("Forest", herbivorePaddock1.getName());
            assertEquals("Plain Terrain", herbivorePaddock2.getName());
            assertEquals("Jungle", carnivorePaddock1.getName());
            assertEquals("Riverland", carnivorePaddock2.getName());
        }

        @Test
        public void addDinosaurToPaddock(){
            carnivorePaddock1.addDinosaur(velociraptor);
            assertEquals(1, carnivorePaddock1.dinosaurCount());
        }



//        @Test
//        public void getPaddockDinosaur(){
//            herbivorePaddock1.
//            assertEquals("dinosaurs", herbivorePaddock1.paddockDinosaurs());
//        }



}
