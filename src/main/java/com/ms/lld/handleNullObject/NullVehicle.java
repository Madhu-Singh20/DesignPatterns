package com.ms.lld.handleNullObject;

public class NullVehicle extends Vehicle{

    @Override
    public int getSeatingCapacity() {
        return 0;
    }

    @Override
    public int getTankCapacity() {
        return 0;
    }
}
