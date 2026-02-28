package com.ms.lld.couponsOnCart;

public class Client {

    public static void main(String[] args){

         ShoppingCart shoppingCart=new ShoppingCart();

         Product doll1= new Doll();
         Product doll2= new Doll();
         Product diningTable= new DiningTable();

        shoppingCart.addProduct(doll1);
        shoppingCart.addProduct(doll2);
        shoppingCart.addProduct(diningTable);

        System.out.println("You have to pay " +shoppingCart.getCostAfterCoupon());


    }
}
