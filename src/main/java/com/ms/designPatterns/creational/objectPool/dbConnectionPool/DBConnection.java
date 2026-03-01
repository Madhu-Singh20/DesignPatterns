package com.ms.designPatterns.creational.objectPool.dbConnectionPool;

public class DBConnection {

    public void connect() {
        System.out.println("Connected by " + Thread.currentThread().getName());
    }
}
