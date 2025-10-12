package com.ms.lld.carRentalSystem.products;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Vehicle {

    private int id;
    private String number;
    private String companyName;
    private String model;
    private VehicleType vehicleType;
    private VehicleStatus vehicleStatus;
}
