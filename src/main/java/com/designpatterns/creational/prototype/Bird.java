package com.designpatterns.creational.prototype;

public class Bird {
    private String name;
    private String color;
    private int weight;

    public Bird(String name, String color, int weight){
        this.name = name;
        this.color = color;
        this.weight = weight;
    }
    public Bird(Bird birdCopy){
        this.name = birdCopy.name;
        this.color = birdCopy.color;
        this.weight = birdCopy.weight;
    }

    public Bird clone(){
        Bird birdClone = new Bird(this);
        return birdClone;
    }
}
