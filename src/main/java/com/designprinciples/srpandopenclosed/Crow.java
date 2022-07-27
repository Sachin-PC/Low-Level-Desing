package com.designprinciples.srpandopenclosed;

public class Crow extends Bird {

    @Override
    public void eat() {
        System.out.println("Crow eating behaviour");
    }

    @Override
    public void fly() {
        System.out.println("Crow flying behaviour");
    }
}
