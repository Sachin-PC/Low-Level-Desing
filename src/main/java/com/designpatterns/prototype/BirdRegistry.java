package com.designpatterns.prototype;

import java.util.HashMap;

public class BirdRegistry {
    private HashMap<String,Bird> birds= new HashMap<String,Bird>();

    public void addBird(String birdName, Bird bird)
    {
        birds.put(birdName,bird);
    }

    public Bird getBirdClone(String birdName){
        return birds.get(birdName).clone();
    }
}
