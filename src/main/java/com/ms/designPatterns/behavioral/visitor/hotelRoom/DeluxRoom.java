package com.ms.designPatterns.behavioral.visitor.hotelRoom;

public class DeluxRoom implements Room{

    @Override
    public void accept(RoomVisitor roomVisitor) {
        roomVisitor.visit(this);
    }

}
