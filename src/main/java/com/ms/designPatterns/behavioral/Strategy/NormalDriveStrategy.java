package com.ms.designPatterns.behavioral.Strategy;

public class NormalDriveStrategy implements DriveStrategy{

    @Override
    public void drive() {
        System.out.println("Normal driving");

    }
}
