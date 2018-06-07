package com.example.rachelwestwater.jurassicparkproject.Paddock;

import com.example.rachelwestwater.jurassicparkproject.Dinosaur.Dinosaur;

import java.util.ArrayList;

public abstract class Paddock {
    private String name;
    protected ArrayList<Dinosaur> dinosaurs;

    public Paddock(String name) {
        this.name = name;
        this.dinosaurs = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public int dinosaurCount() {
        return dinosaurs.size();
    }

    public void emptyPaddock() {
        dinosaurs.clear();
    }

    public void removeDinosaur(Dinosaur dinosaur) {
        dinosaurs.remove(dinosaur);
    }
}
