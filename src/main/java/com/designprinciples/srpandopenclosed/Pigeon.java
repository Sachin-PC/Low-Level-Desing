package com.designprinciples.srpandopenclosed;

public class Pigeon extends Bird{

    @Override
    public void eat(){
        System.out.println("Pigeon eating behaviour");
    }

    @Override
    public void fly(){
        System.out.println("Pigeon flying behaviour");
    }
}
