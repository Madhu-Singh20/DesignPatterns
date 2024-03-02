package com.ms.designPatterns.behavioral.Strategy;

public class SportVehicle extends Vehicle{

    public SportVehicle() {
        super( new SportDriveStrategy() );
    }
}
