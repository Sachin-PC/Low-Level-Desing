package com.designpatterns.creational.singleton.lazyInitialization;

public class RandomClass {
    DatabaseConnection databaseConnection = DatabaseConnection.getInstance();
}
