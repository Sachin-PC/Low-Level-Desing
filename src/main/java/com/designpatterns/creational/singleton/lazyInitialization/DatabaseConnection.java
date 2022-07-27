package com.designpatterns.creational.singleton.lazyInitialization;

public class DatabaseConnection {
    private static DatabaseConnection databaseConnection;
    private static int i=0;

    private DatabaseConnection(){

    }

    public static DatabaseConnection getInstance(){
        if(databaseConnection == null){
            databaseConnection = new DatabaseConnection();
            /** synchronized (DatabaseConnection.getInstance()) {
                if(databaseConnection == null) {
                    databaseConnection = new DatabaseConnection();
                }
            } **/
        }
        return databaseConnection;
    }
}
