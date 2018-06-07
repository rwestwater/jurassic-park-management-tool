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

    public void addVisitor(Visitor visitor) {
        visitorList.add(visitor);
    }

    public int visitorListCount() {
        return this.visitorList.size();
    }

    public boolean visitorsAlive(){
        int survivors = 0;
        for (Visitor visitor : visitorList){
            if ( visitor.getHealth() > 0){
                survivors ++;
            }
        } if (survivors <= 0){
            return false;
        } else {
            return true;
        }
    }

    public String dinosaurRampage(Velociraptor velociraptor) {
        System.out.println("A rampage has begun");
        while (visitorsAlive()){
            for(int i = 0; i < visitorList().size(); i++){
                velociraptor.attack(visitorList().get(i));
                }
        }
        System.out.println("All visitors have been eaten by " + velociraptor.getName());
        return "No survivors";
    }
}
