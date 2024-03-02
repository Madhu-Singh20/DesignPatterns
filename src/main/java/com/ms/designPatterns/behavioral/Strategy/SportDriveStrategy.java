package com.ms.designPatterns.behavioral.Strategy;

public class SportDriveStrategy implements DriveStrategy{

    @Override
    public void drive() {
        System.out.println("Sport driving");

    }
}
