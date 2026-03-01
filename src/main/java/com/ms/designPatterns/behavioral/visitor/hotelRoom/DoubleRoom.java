package com.ms.designPatterns.behavioral.visitor.hotelRoom;

public class DoubleRoom implements Room{

    @Override
    public void accept(RoomVisitor roomVisitor) {
        roomVisitor.visit(this);
    }

}
