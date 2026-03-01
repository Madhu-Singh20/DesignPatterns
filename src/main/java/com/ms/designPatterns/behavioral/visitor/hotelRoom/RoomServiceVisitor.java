package com.ms.designPatterns.behavioral.visitor.hotelRoom;

public class RoomServiceVisitor implements RoomVisitor{

    @Override
    public void visit(SingleRoom singleRoom) {
        System.out.println("Room service per day : " +2);
    }

    @Override
    public void visit(DoubleRoom doubleRoom) {
        System.out.println("Room service per day : " +4);
    }

    @Override
    public void visit(DeluxRoom deluxRoom) {
        System.out.println("Room service per day : " +6);
    }

}
