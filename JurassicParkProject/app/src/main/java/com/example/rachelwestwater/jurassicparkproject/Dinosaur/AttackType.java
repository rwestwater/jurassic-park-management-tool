package com.example.rachelwestwater.jurassicparkproject.Dinosaur;

public enum AttackType {
    SLASH(10),
    BITE(10),
    WHIP(5);

    private final int value;

    AttackType(int value){
        this.value = value;
    }

    public int getValue(){
        return this.value;
    }
}
