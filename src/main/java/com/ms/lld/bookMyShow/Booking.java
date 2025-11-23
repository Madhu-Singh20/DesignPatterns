package com.ms.lld.bookMyShow;

import lombok.Data;

import java.util.List;

@Data
public class Booking {

      int id;
      Show show;
      List<Seat> seatList;
      Payment payment;
}
