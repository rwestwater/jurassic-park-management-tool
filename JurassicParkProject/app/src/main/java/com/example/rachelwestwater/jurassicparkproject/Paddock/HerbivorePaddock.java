package com.example.rachelwestwater.jurassicparkproject.Paddock;

import com.example.rachelwestwater.jurassicparkproject.Dinosaur.Brontosaurus;

public class HerbivorePaddock extends Paddock {
    public HerbivorePaddock(String name) {
        super(name);
    }

    public void addDinosaur(Brontosaurus brontosaurus) {
        dinosaurs.add(brontosaurus);
    }
}

