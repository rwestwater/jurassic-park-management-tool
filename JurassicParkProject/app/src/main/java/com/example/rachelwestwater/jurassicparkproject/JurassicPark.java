package com.example.rachelwestwater.jurassicparkproject;

import com.example.rachelwestwater.jurassicparkproject.Dinosaur.Brontosaurus;
import com.example.rachelwestwater.jurassicparkproject.Dinosaur.Velociraptor;
import com.example.rachelwestwater.jurassicparkproject.Visitors.Rachel;
import com.example.rachelwestwater.jurassicparkproject.Visitors.Visitor;
import java.util.ArrayList;

public class JurassicPark {

    private Velociraptor velociraptor;
    private Brontosaurus brontosaurus;
    protected ArrayList<Visitor> visitorList;

    public JurassicPark(Velociraptor velociraptor, Brontosaurus brontosaurus){
        this.visitorList = new ArrayList<>();
        this.velociraptor = velociraptor;
        this.brontosaurus = brontosaurus;
    }

    public ArrayList<Visitor> visitorList() {
        return this.visitorList;
    }

    public int visitorListCount() {
        return this.visitorList.size();
    }

    public void guestEvacuation() {
        this.visitorList.clear();
    }

    public String guestEvacuationNotice() {
        return "PARK EVACUATION, ALL GUESTS MAKE YOUR WAY TO THE NEAREST EXIT";
    }


    public void addVisitor(Visitor visitor) {
        visitorList.add(visitor);
    }

    public void evacuatePark() {
        visitorList.clear();
    }
}
