package com.ms.lld.couponsOnCart;

public class Doll extends Product{

    public Doll() {
        super("Doll",ProductType.TOYS,200);
    }

    @Override
    public double getCost() {
        return this.cost;
    }
}
