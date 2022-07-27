package com.designpatterns.creational.singleton.earlyInitialization;

public class DatabaseConnection {

    private static String url;
    private static String hostname;
    private static DatabaseConnection databaseConnection = new DatabaseConnection("url", "hostname");

    private DatabaseConnection(String url, String hostname){
        this.url = url;
        this.hostname = hostname;
    }

    public static DatabaseConnection getInstance(){
        return databaseConnection;
    }
}
