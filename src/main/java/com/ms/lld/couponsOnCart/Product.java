package com.ms.lld.couponsOnCart;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public abstract class Product {
     String name;
     ProductType productType;
     double cost;

    public abstract double getCost();

}
