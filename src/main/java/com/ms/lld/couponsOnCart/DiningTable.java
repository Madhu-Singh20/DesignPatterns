package com.ms.lld.couponsOnCart;

public class DiningTable extends Product{

    public DiningTable() {
        super("Dining Table",ProductType.FURNITURE,1000);
    }

    @Override
    public double getCost() {
        return this.cost;
    }
}
