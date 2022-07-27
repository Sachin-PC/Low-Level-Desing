package com.designprinciples.dependencyinversion;

public class FlyingBehaviourTwo implements FlyingBehaviour{
    @Override
    public void makeFly() {
        System.out.println("Flying Behaviour Two Implementation");
    }
}
