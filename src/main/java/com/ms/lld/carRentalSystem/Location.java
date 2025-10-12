package com.ms.lld.carRentalSystem;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Location {

    private int id;
    private String line1;
    private String line2;
    private String city;
    private String district;
    private String state;
    private long pincode;

}
