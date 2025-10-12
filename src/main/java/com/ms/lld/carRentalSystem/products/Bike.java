package com.ms.lld.carRentalSystem.products;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Bike extends Vehicle{

    public Bike(int id, String number, String companyName, String model,  VehicleType vehicleType, VehicleStatus vehicleStatus) {
        super(id,number, companyName, model, vehicleType, vehicleStatus );
    }
}
