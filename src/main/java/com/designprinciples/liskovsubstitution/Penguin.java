package com.designprinciples.liskovsubstitution;

public class Penguin extends Bird implements Eatable{

    @Override
    public void eat() {
        System.out.println("Penguin eating behaviour");
    }
}
