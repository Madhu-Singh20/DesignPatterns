package com.ms.designPatterns.behavioral.visitor.hotelRoom;

public interface Room {

    public void accept(RoomVisitor roomVisitor);
}
