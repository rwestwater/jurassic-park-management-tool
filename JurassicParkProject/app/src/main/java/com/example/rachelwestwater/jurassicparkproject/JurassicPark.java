package com.example.rachelwestwater.jurassicparkproject;

import com.example.rachelwestwater.jurassicparkproject.Dinosaur.Brontosaurus;
import com.example.rachelwestwater.jurassicparkproject.Dinosaur.Velociraptor;
import com.example.rachelwestwater.jurassicparkproject.Visitors.Visitor;
import java.util.ArrayList;

public class JurassicPark {

    private Velociraptor velociraptor;
    private Brontosaurus brontosaurus;
    private ArrayList<Visitor> visitorArrayList;

    public JurassicPark(Velociraptor velociraptor, Brontosaurus brontosaurus){
        this.velociraptor = velociraptor;
        this.brontosaurus = brontosaurus;
    }

    public String guestEvacuation() {
        return "PARK EVACUATION, ALL GUESTS MAKE YOUR WAY TO THE NEAREST EXIT";
    }



}
