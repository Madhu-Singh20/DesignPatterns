package com.ms.lld.carRentalSystem;

import com.ms.lld.carRentalSystem.products.Vehicle;
import lombok.Data;

import java.util.List;

@Data
public class StoreInventoryManagement {

    List<Vehicle> vehicleList;
    List<Reservation> reservations;
}
