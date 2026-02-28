package com.ms.lld.couponsOnCart;

public class Coupon5Percent extends Product{

    Product product;

    public Coupon5Percent(Product product) {
        super("Coupon5Percent", ProductType.COUPON,0);
        this.product = product;
    }

    @Override
    public double getCost() {
        return product.getCost()-(product.getCost()*.5);
    }
}
