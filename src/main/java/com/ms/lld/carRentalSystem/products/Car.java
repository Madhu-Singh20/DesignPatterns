package com.ms.lld.carRentalSystem.products;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Car extends Vehicle{
    public Car(int id, String number, String companyName, String model,  VehicleType vehicleType, VehicleStatus vehicleStatus) {
        super(id,number, companyName, model, vehicleType, vehicleStatus );
    }
}
