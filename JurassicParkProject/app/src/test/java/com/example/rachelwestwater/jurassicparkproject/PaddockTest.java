package com.example.rachelwestwater.jurassicparkproject;

import com.example.rachelwestwater.jurassicparkproject.Dinosaur.Brontosaurus;
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
            herbivorePaddock1.addDinosaur(brontosaurus);
            assertEquals(1, carnivorePaddock1.dinosaurCount());
            assertEquals(1, herbivorePaddock1.dinosaurCount());
        }

        @Test
        public void removeDinosaurFromPaddock(){
            carnivorePaddock1.addDinosaur(velociraptor);
            carnivorePaddock1.addDinosaur(velociraptor);
            carnivorePaddock1.removeDinosaur(velociraptor);
            assertEquals(1, carnivorePaddock1.dinosaurCount());
        }

        @Test
        public void emptyPaddock(){
            herbivorePaddock1.addDinosaur(brontosaurus);
            herbivorePaddock1.addDinosaur(brontosaurus);
            herbivorePaddock1.emptyPaddock();
            assertEquals(0, herbivorePaddock1.dinosaurCount());
        }





}
