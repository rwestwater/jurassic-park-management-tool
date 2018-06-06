package com.example.rachelwestwater.jurassicparkproject.Paddock;

import com.example.rachelwestwater.jurassicparkproject.Dinosaur.Brontosaurus;

public class HerbivorePaddock extends Paddock {
    public HerbivorePaddock(String name) {
        super(name);
    }

    public void addDinosaur(Brontosaurus brontosaurus) {
        dinosaurs.add(brontosaurus);
    }

    public void transferDinosaur(Brontosaurus brontosaurus, HerbivorePaddock destination) {
        boolean successful = dinosaurs.remove(brontosaurus);
        if (successful) {
            destination.addDinosaur(brontosaurus);
        }
        System.out.println(brontosaurus.getName() + " has been moved from " + getName() + " to " + destination.getName());

    }
}

