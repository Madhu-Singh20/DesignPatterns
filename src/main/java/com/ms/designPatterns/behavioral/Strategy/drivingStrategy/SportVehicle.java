package com.ms.designPatterns.behavioral.Strategy.drivingStrategy;

public class SportVehicle extends Vehicle{

    public SportVehicle() {
        super( new SportDriveStrategy() );
    }
}
