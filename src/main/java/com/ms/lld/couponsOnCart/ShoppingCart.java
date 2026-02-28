package com.ms.lld.couponsOnCart;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {

    List<Product> productList=new ArrayList<>();

    public void addProduct(Product product){
        productList.add(new Coupon5Percent(new CouponForNonToys(product)));
    }

    public double getCostAfterCoupon(){
        double payable=0;
        for (Product product: productList){
            payable += product.getCost();
        }
        return payable;
    }
}
