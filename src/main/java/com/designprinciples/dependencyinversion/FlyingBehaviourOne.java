package com.designprinciples.dependencyinversion;

public class FlyingBehaviourOne implements FlyingBehaviour{
    @Override
    public void makeFly() {
        System.out.println("Flying Behaviour One Implementation");
    }
}
