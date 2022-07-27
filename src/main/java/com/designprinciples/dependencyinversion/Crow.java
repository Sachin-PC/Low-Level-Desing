package com.designprinciples.dependencyinversion;

public class Crow extends Bird implements Flyable{

    /**
     * Here, if we want a different flying behaviour, we can simple change
     * FlyingBehaviour flyingBehaviour = new FlyingBehaviourOne();
     * to
     * FlyingBehaviour flyingBehaviour = new FlyingBehaviourTwo();
     * So, fly method doesn't worry about which behaviour to implement. This dependency is handled
     * using the FlyingBehaviour interface. This interface handles which class to be instantiated
     */
    FlyingBehaviour flyingBehaviour = new FlyingBehaviourOne();

    @Override
    public void fly() {
        flyingBehaviour.makeFly();
    }

    @Override
    public void fly(FlyingBehaviour dependencyInjectedFlyingBehaviour) {
        dependencyInjectedFlyingBehaviour.makeFly();
    }
}
