package com.ms.designPatterns.behavioral.Strategy;

public class OffRoadVehicle extends Vehicle{

    public OffRoadVehicle() {
        super( new SportDriveStrategy() );
    }
}
