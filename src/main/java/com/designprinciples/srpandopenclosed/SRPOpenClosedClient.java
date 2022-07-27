package com.designprinciples.srpandopenclosed;

public class SRPOpenClosedClient {

    public static void main(String args[]) {
        Bird pigeon = new Pigeon();
        Bird crow = new Crow();
        pigeon.eat();
        pigeon.fly();
        crow.eat();
        crow.fly();
    }
}
