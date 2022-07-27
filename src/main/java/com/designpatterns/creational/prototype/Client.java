package com.designpatterns.creational.prototype;

import java.util.ArrayList;
import java.util.List;

public class Client {

    public static void main(String args[]){
        Bird bird1 = new Bird("normalBird","black",5);
        Sparrow sparrow1 = new Sparrow("sparrow1","brown",7,3);
        Penguin normalPenguin = new Penguin("normalPenguin","black",10,"long",false);
        Penguin intelligentPenguin = new Penguin("intelligentPenguin","blacl",15,"short",true);

        BirdRegistry birdRegistry = new BirdRegistry();
        birdRegistry.addBird("normalBird",bird1);
        birdRegistry.addBird("sparrow1",sparrow1);
        birdRegistry.addBird("normalPenguin",normalPenguin);
        birdRegistry.addBird("intelligentPenguin",intelligentPenguin);

        List<String> birdTypes = List.of(
                "normalBird",
                "sparrow1",
                "normalPenguin",
                "intelligentPenguin"
        );

        List<Bird> clonedBirds = new ArrayList<Bird>();

        for(String birdType : birdTypes){
            clonedBirds.add(birdRegistry.getBirdClone(birdType));
        }

        System.out.println("Succesfully cloned the birds of different Types");

    }
}
