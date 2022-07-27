package com.designprinciples.dependencyinversion;

public class DependencyInversionClient {

    public static void main(String args[]){

        dependencyInversionImpl();

        dependencyInjectionImpl();

    }

    /**
     * This method shows simple dependency inversion implementation
     */
    public static void dependencyInversionImpl(){
        Flyable crow = new Crow();
        Flyable eagle = new Eagle();
        System.out.println("Dependency Inversion Implementation:");
        crow.fly();
        eagle.fly();
    }

    /**
     * This methos shows dependency Injection Implementation
     */
    public static void dependencyInjectionImpl(){
        FlyingBehaviour flyingBehaviourOne = new FlyingBehaviourOne();
        FlyingBehaviour flyingBehaviourTwo = new FlyingBehaviourTwo();
        Flyable crow = new Crow();
        Flyable eagle = new Eagle();
        System.out.println("\nDependency Injection Implementation:");
        crow.fly(flyingBehaviourOne);
        crow.fly(flyingBehaviourTwo);

        eagle.fly(flyingBehaviourOne);
        eagle.fly(flyingBehaviourTwo);
    }
}
