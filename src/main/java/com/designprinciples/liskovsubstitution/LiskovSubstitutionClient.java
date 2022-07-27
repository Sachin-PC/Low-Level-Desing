package com.designprinciples.liskovsubstitution;

import java.util.ArrayList;
import java.util.List;

public class LiskovSubstitutionClient {

    public static void main(String args[]){
        Flyable crow1 = new Crow();
        crow1.fly();

        Eatable crow2 = new Crow();
        crow2.eat();

        Eatable penguin = new Penguin();
        penguin.eat();

        FlyableEatable sparrow = new Sparrow();
        FlyableEatable eagle = new Eagle();
        /**
         * In the below list, we cannot add Crow even though it implements both fly and eagle because
         * it implements both the interfaces separately and there is no way we can know it is
         * implementing both until and unless we see its class. So, if we need a list of
         * birds(or classes) implementing both flyable and eatable we need to have a new interface
         * which extends both Flyable and Eatable so that the birds implementing both can implement
         * this interface and when we want list of birds which can both fly and eat, we can have a list
         * like below
         */
        List<FlyableEatable> flyableEatableBirdsList = List.of(
                sparrow,
                eagle
                );
        for(FlyableEatable flyableEatableBird : flyableEatableBirdsList){
            flyableEatableBird.eat();
            flyableEatableBird.fly();
        }
    }
}
