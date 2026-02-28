package com.ms.lld.couponsOnCart;

public class CouponForNonToys extends Product{

    Product product;

    public CouponForNonToys(Product product) {
        super("CouponForNonToys", ProductType.COUPON,0);
        this.product = product;
    }

    @Override
    public double getCost() {
        if(!product.getProductType().equals(ProductType.TOYS)) {
            return product.getCost() - (product.getCost() * .10);
        }
        return product.getCost();
    }
}
