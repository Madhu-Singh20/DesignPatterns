package com.ms.designPatterns.behavioral.Strategy.drivingStrategy;

public class NormalDriveStrategy implements DriveStrategy{

    @Override
    public void drive() {
        System.out.println("Normal driving");

    }
}
