package com.example.rachelwestwater.jurassicparkproject.Dinosaur;

public enum AttackType {
    SLASH(50),
    BITE(50),
    WHIP(50);

    private final int value;

    AttackType(int value){
        this.value = value;
    }

    public int getValue(){
        return this.value;
    }
}
