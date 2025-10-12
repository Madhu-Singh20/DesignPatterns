package com.ms.lld.carRentalSystem;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
public class Store {

    private int id;
    private Location location;
    private StoreInventoryManagement storeInventoryManagement;

}
