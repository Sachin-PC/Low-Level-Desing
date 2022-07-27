package com.designprinciples.liskovsubstitution;

public class Crow extends Bird implements Flyable, Eatable{
    @Override
    public void eat() {
        System.out.println("Crow eating behaviour");
    }

    @Override
    public void fly() {
        System.out.println("Crow flying behaviour");
    }
}
