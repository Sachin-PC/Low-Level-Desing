package com.designprinciples.dependencyinversion;

public class Eagle implements Flyable{

    FlyingBehaviour flyingBehaviour = new FlyingBehaviourTwo();

    @Override
    public void fly() {
        flyingBehaviour.makeFly();
    }

    @Override
    public void fly(FlyingBehaviour dependencyInjectedFlyingBehaviour) {
        dependencyInjectedFlyingBehaviour.makeFly();
    }
}
