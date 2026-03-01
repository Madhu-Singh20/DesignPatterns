package com.ms.designPatterns.behavioral.visitor.hotelRoom;

public class RoomPricingVisitor implements RoomVisitor{

    @Override
    public void visit(SingleRoom singleRoom) {
       System.out.println("Charges for single room are : " +2000);
    }

    @Override
    public void visit(DoubleRoom doubleRoom) {
        System.out.println("Charges for double room are : " +4000);
    }

    @Override
    public void visit(DeluxRoom deluxRoom) {
        System.out.println("Charges for delux room are : " +9000);

    }
}
