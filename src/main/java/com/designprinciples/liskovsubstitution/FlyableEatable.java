package com.designprinciples.liskovsubstitution;

public interface FlyableEatable extends Flyable, Eatable{

    /**
     * This interface extends Flyable and Eatable so that the classes implementing this will have both
     * fly and eat method. So, we can get a list of birds who can both fly and eat using this interface.
     * This implementation is shown in LiskovSubstitutionClient class
     **/
}
