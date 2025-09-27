package com.ms.designPatterns.behavioral.Strategy.drivingStrategy;

public class OffRoadVehicle extends Vehicle{

    public OffRoadVehicle() {
        super( new SportDriveStrategy() );
    }
}
