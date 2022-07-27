package com.designpatterns.creational.prototype;

public class Penguin extends Bird{
    private String beakType;
    private boolean isIntelligent;

    public Penguin(String name, String color, int weight, String beakType, boolean isIntelligent){
        super(name,color,weight);
        this.beakType = beakType;
        this.isIntelligent = isIntelligent;
    }

    public Penguin(Penguin penguinCopy)
    {
        super(penguinCopy);
        this.beakType = penguinCopy.beakType;
        this.isIntelligent = penguinCopy.isIntelligent;
    }

    @Override
    public Penguin clone(){
        Penguin penguinClone = new Penguin(this);
        return penguinClone;
    }
}
