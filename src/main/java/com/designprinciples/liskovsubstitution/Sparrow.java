package com.designprinciples.liskovsubstitution;

public class Sparrow extends Bird implements FlyableEatable{
    @Override
    public void eat() {
        System.out.println("Sparrow eating behaviour");
    }

    @Override
    public void fly() {
        System.out.println("Sparrow flying behaviour");
    }
}
