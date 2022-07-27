package com.designprinciples.dependencyinversion;

public interface Flyable {

    public void fly();

    public void fly(FlyingBehaviour dependencyInjectedFlyingBehaviour);
}
