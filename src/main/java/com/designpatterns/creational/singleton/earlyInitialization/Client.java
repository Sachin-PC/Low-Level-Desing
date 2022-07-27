package com.designpatterns.creational.singleton.earlyInitialization;

public class Client {

    public static void main(String args[]){
        DatabaseConnection databaseConnection1 = DatabaseConnection.getInstance();
        DatabaseConnection databaseConnection2 = DatabaseConnection.getInstance();
        System.out.println("Succesfully Implemented Early Initialization Singleton Pattern");
    }
}
