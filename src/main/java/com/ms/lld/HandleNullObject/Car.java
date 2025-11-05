package com.ms.lld.HandleNullObject;

public class Car extends Vehicle{

    @Override
    public int getSeatingCapacity() {
        return 4;
    }

    @Override
    public int getTankCapacity() {
        return 20;
    }
}
