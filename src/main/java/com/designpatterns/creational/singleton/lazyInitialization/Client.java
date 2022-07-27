package com.designpatterns.creational.singleton.lazyInitialization;

import java.util.Random;

public class Client {

    public static void main(String args[]){
        DatabaseConnection databaseConnection1 = DatabaseConnection.getInstance();
        DatabaseConnection databaseConnection2 = DatabaseConnection.getInstance();
        RandomClass randomClass = new RandomClass();
        System.out.println("Succesfully Implemented Lazy Initialization Singleton Pattern");
    }

}
