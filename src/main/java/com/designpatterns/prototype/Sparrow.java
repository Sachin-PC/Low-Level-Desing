package com.designpatterns.prototype;

public class Sparrow extends Bird {
    private int legSize;

    public Sparrow(String name, String color, int weight, int legSize) {
        super(name,color,weight);
        this.legSize = legSize;
    }
    public Sparrow(Sparrow SparrowCopy){
        super(SparrowCopy);
        this.legSize = SparrowCopy.legSize;
    }

    @Override
    public Sparrow clone(){
        Sparrow sparrowClone = new Sparrow(this);
        return sparrowClone;
    }
}
