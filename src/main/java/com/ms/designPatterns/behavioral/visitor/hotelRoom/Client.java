package com.ms.designPatterns.behavioral.visitor.hotelRoom;

public class Client {

    public static void main(String[] args){
        Room singleRoom=new SingleRoom();
        Room doubleRoom=new DoubleRoom();
        Room deluxRoom=new DeluxRoom();

        RoomVisitor roomPricingVisitor=new RoomPricingVisitor();
        RoomVisitor roomServiceVisitor=new RoomServiceVisitor();

        singleRoom.accept(roomPricingVisitor);
        doubleRoom.accept(roomPricingVisitor);
        deluxRoom.accept(roomPricingVisitor);

        singleRoom.accept(roomServiceVisitor);
        doubleRoom.accept(roomServiceVisitor);
        deluxRoom.accept(roomServiceVisitor);
    }

}
