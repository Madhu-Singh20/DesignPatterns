package com.ms.designPatterns.behavioral.visitor.hotelRoom;

public interface RoomVisitor {

   void visit(SingleRoom singleRoom);
   void visit(DoubleRoom doubleRoom);
   void visit(DeluxRoom deluxRoom);

}
