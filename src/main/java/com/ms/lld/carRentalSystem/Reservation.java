package com.ms.lld.carRentalSystem;

import com.ms.lld.carRentalSystem.products.Vehicle;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class Reservation {

    private int id;
    private User user;
    private Vehicle vehicle;
    private Date bookingDate;
    private Date bookedFrom;
    private Date bookedTill;
    private Location location;
}
