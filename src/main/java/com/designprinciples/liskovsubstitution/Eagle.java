package com.designprinciples.liskovsubstitution;

public class Eagle extends Bird implements FlyableEatable{
    @Override
    public void eat() {
        System.out.println("Eagle eating behaviour");
    }

    @Override
    public void fly() {
        System.out.println("Eagle flying behaviour");
    }
}
